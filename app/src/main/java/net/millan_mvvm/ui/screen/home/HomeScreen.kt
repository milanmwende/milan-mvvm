// HomeScreen.kt
package net.millan_mvvm.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.ContentAlpha
import coil.compose.AsyncImage
import net.millan_mvvm.data.courses.Course
import net.millan_mvvm.ui.theme.Blue200
import net.millan_mvvm.R


@OptIn(ExperimentalMaterial3Api::class)
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



    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                },
            )
        },
        bottomBar = { BottomNavigation(
            onItemClick = { /*TODO*/ },
            currentScreen = NavItem.Home
        ) },
        modifier = Modifier.fillMaxSize()

    ){ innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            SearchField()
            PopularCourses(courses = popularCourses)
            RecomendedCourses()
            Categories()
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

@Composable
fun PopularCourses(courses: List<Course>) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            "Popular Courses",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            )

        Text(
            "View All",
            fontSize = 14.sp,
            color = Blue200,
            fontWeight = FontWeight.Light,
        )
    }
    LazyRow (
        contentPadding = PaddingValues(horizontal = 8.dp)
    ){
        items(courses.size) { course ->
            CourseItem(course = courses[course])
        }
    }
}

@Composable
fun CourseItem(course: Course) {
    Column(
        modifier = Modifier
            .padding(horizontal = 8.dp)
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
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "(${course.rating})",
                    fontSize = 10.sp,
                    color = Color.Gray
                )
            }
        }/**/
    }
}

@Composable
fun CourseImage(imageUrl: String) {

    Box(
        modifier = Modifier
            .width(180.dp)
            .height(100.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(Color.Gray, RoundedCornerShape(16.dp))
    ) {
        AsyncImage(
            model = "https://images.unsplash.com/photo-1521185496955-15097b20c5fe?q=80&w=2850&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun RecomendedCourses() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Recommended Courses",
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "Take a short survey so we can recommend the best courses for you",
            fontSize = 14.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue200
            ), // Change color here
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        ) {
            Text("Start", color = Color.White)
        }

    }
}

@Composable
fun Categories() {
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
            items(10) {
                CategoryItem()
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }

}

@Composable
fun CategoryItem() {
    Box(
        modifier = Modifier
            .width(100.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Gray)
    ){
        Text(
            text = "Category",
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center)
                .padding(2.dp)
        )
    }
}


@Composable
fun BottomNavigation(
    onItemClick: (NavItem) -> Unit,
    currentScreen: NavItem
) {
    val items = listOf(
        NavItem.Home,
        NavItem.MyCourses,
        NavItem.Chat,
        NavItem.Profile
    )
    val currentSelectedItem = remember { mutableStateOf(currentScreen) }

    BottomAppBar(
        modifier = Modifier.fillMaxWidth()
            .height(56.dp)
            .background(color = Color.White),
    ) {
        val totalItems = items.size
        items.forEach { item ->
            val isSelected = currentSelectedItem.value == item
            val iconColor = if (isSelected) Blue200 else LocalContentColor.current.copy(alpha = ContentAlpha.medium)

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        onItemClick(item)
                        currentSelectedItem.value = item
                    },
                contentAlignment = Alignment.Center
            ){
                val icon = when (item) {
                    NavItem.Home -> Icons.Default.Home
                    NavItem.MyCourses -> Icons.Default.Menu
                    NavItem.Chat -> Icons.Default.Email
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


sealed class NavItem(val title: String) {
    object Home : NavItem("Home")
    object MyCourses : NavItem("My Courses")
    object Chat : NavItem("Chat")
    object Profile : NavItem("Profile")
}




@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
