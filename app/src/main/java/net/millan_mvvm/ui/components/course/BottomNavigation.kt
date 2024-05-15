package net.millan_mvvm.ui.components.course

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.ContentAlpha
import net.millan_mvvm.navigation.*
import net.millan_mvvm.ui.theme.Blue200

@Composable
fun BottomNavigation(
    onItemClick: (String) -> Unit,
    currentScreen: NavItem
) {
    val items = listOf(
        NavItem.Home,
        NavItem.MyCourses,

        NavItem.Profile
    )
    val currentSelectedItem = remember { mutableStateOf(currentScreen) }

    BottomAppBar(
        modifier = Modifier.fillMaxWidth()
            .height(56.dp)
            .background(color = Color.White),
    ) {
        items.size
        items.forEach { item ->
            val isSelected = currentSelectedItem.value == item
            val iconColor = if (isSelected) Blue200 else LocalContentColor.current.copy(alpha = ContentAlpha.medium)

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        onItemClick(item.route)
                        currentSelectedItem.value = item
                    },
                contentAlignment = Alignment.Center
            ){
                val icon = when (item) {
                    NavItem.Home -> Icons.Default.Home
                    NavItem.MyCourses -> Icons.Default.Menu

                    NavItem.Profile -> Icons.Default.Person
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        icon,
                        contentDescription = item.title,
                        tint = iconColor,
                        modifier = Modifier.padding(vertical = 0.4.dp)
                    )

                    Text(
                        item.title,
                        color = iconColor,
                        fontSize = 12.sp)
                }
            }

        }
    }
}


sealed class NavItem(
    val title: String, val route: String
    ) {
    object Home : NavItem("Home", ROUTE_HOME)
    object MyCourses : NavItem("My Courses", ROUTE_COURSE)

    object Profile : NavItem("profile", ROUTE_PROFILE)
}