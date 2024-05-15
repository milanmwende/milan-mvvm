package net.millan_mvvm.ui.components.course

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Categories() {
    @Composable
    fun Categories(categories: List<String>) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                "Categories",
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
            )

            Spacer(modifier = Modifier.height(8.dp))

            LazyRow(
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                items(categories.size) { category ->
                    CategoryItem(category = category)
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }
    }

    @Composable
    fun CategoryItem(category: String) {
        Box(
            modifier = Modifier
                .width(100.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Gray)
        ) {
            Text(
                text = category,
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
                    .padding(2.dp)
            )
        }
    }


//sealed class Categories{


}

class CategoryItem(category: Int) {

}


@Preview(showBackground = true)
@Composable
fun CategoriesPreview() {
    Categories()
}
