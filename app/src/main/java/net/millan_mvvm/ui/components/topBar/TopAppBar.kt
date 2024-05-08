package net.millan_mvvm.ui.components.topBar

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNav(
    viewModel: TopNavViewModel = viewModel(),
    onNotificationClick: () -> Unit = {}
) {
    val searchText by viewModel.searchText.collectAsState()
    val notificationCount by viewModel.notificationCount.collectAsState()

    TopAppBar(
        title = {
            TextField(
                value = searchText,
                onValueChange = {
                    //viewModel.updateSearchText(it)
                                },
                label = { Text("Search") },
                leadingIcon = {
                    Icon(Icons.Default.Search, contentDescription = "Search")
                },
                trailingIcon = {
                    if (searchText.isNotEmpty()) {
                        IconButton(onClick = {
                            //viewModel.updateSearchText("")
                        }) {
                            Icon(Icons.Default.Close, contentDescription = "Clear")
                        }
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions(
                    onSearch = {
                       // viewModel.performSearch(searchText) // Call ViewModel search action
                    }
                ),
                modifier = Modifier
                    .height(42.dp)
                    .fillMaxWidth()
                    .border(1.dp, MaterialTheme.colorScheme.onSurface, CircleShape)
            )
        },
        actions = {
            IconButton(onClick = onNotificationClick) {
                Box {
                    Icon(Icons.Default.Notifications, contentDescription = "Notifications")
                    if (notificationCount > 0) {
                        BadgeBox(notificationCount)
                    }
                }
            }
        }
    )
}

@Composable
fun BadgeBox(count: Int) {
    val displayText = if (count > 99) "99+" else count.toString()

    Box(
        modifier = Modifier
            .offset(x = 10.dp, y = -10.dp) // Position adjustment
            .size(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Surface(
            shape = CircleShape,
            color = MaterialTheme.colorScheme.error,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = displayText,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onError,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(2.dp)
            )
        }
    }
    }
