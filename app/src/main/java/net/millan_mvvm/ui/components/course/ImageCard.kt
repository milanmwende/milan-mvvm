package net.millan_mvvm.ui.components.course

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ImageCard(
    imageUrl: String,
    contentDescription: String?,
    modifier: Modifier = Modifier // Removed nullable operator
) {
    Box(
        modifier = modifier
            .width(180.dp)
            .height(120.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(Color.Gray, RoundedCornerShape(16.dp))
    ) {
        AsyncImage(
            model = imageUrl, // Used imageUrl variable instead of hardcoded URL
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}


