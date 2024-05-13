// HomeScreen.kt
package net.millan_mvvm.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import net.millan_mvvm.data.courses.Course
import net.millan_mvvm.ui.theme.Blue200


@Composable
fun HomeScreen() {
    val homeViewModel = HomeViewModel()
    // fetch popular courses
    LaunchedEffect(key1 = Unit) {
        print("Fetching popular courses")
        homeViewModel.fetchPopularCourses()
    }

    // Collect popularCourses StateFlow and display UI
    val popularCourses by homeViewModel.popularCourses.collectAsState()



    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            SearchField()
            PopularCourses(courses = popularCourses)
        }
    }
}
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
            .padding(top = 12.dp),
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        colors = textFieldColors,
        shape = RoundedCornerShape(16.dp),
        leadingIcon = {
            Icon(Icons.Filled.Search, contentDescription = "Search")
        },
        trailingIcon = {
            Icon(Icons.Filled.Settings, contentDescription = "Favorites", modifier = Modifier.clickable { /*TODO*/ })
        }
    )
}

@Composable
fun PopularCourses(courses: List<Course>) {
    LazyRow {
        items(courses.size) { course ->
            CourseItem(course = courses[course])
        }
    }
}

@Composable
fun CourseItem(course: Course) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // Display image
        CourseImage(
            imageUrl = course.thumbnail
        )

        // Display title
        Text(
            text = course.title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        // Display instructor
        Text(
            text = course.instructor,
            fontSize = 12.sp,
            color = Blue200,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(2.dp))

        // Display stars based on rating
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                repeat(5) { index ->
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = if (index < course.rating.toInt()) Color(0xFFFFD700) else Color.Gray,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                }
                Spacer(modifier = Modifier.width(1.dp))
                Text(
                    text = "(${course.rating})",
                    fontSize = 8.sp,
                    color = Color.Gray
                )
            }
        }/**/
    }
}

@Composable
fun CourseImage(imageUrl: String) {
    val painter: Painter = // You can add options here if needed
        rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data = imageUrl).apply(block = fun ImageRequest.Builder.() {
            // You can add options here if needed
        }).build())

    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .size(120.dp)
            .padding(4.dp),
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center,
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
