package net.millan_mvvm.ui.components.course

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchField() {
    var text by remember { mutableStateOf(TextFieldValue()) }

    val textFieldColors = TextFieldDefaults.colors(
        cursorColor = Color.Black,
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent
    )

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Search") },
        modifier = Modifier.fillMaxWidth()
            .padding(top = 0.dp)
            .padding(horizontal = 16.dp),
        textStyle = TextStyle(color = Color.Gray, fontSize = 16.sp),
        colors = textFieldColors,
        shape = RoundedCornerShape(16.dp),
        leadingIcon = {
            Icon(Icons.Filled.Search, contentDescription = "Search")
        },
        trailingIcon = {
            Icon(Icons.Filled.Search, contentDescription = "Favorites", modifier = Modifier.clickable { /*TODO*/ })
        }
    )
}