package net.millan_mvvm.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import net.millan_mvvm.navigation.ROUTE_COURSES
import net.millan_mvvm.navigation.ROUTE_HOME

@Composable
fun HomeScreen(navController: NavHostController) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomBar(
                selectedItemIndex = selectedIndex,
                onItemSelected = { index ->
                    selectedIndex = index
                    // Handle navigation based on the selected index
                    when (index) {
                        0 -> navController.navigate("home") // Navigate to Home
                        1 -> navController.navigate("courses") // Navigate to Courses
                        2 -> navController.navigate("profile") // Navigate to Profile
                        3 -> navController.navigate("favorites") // Navigate to Favorites
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier.fillMaxSize()
                .padding(10.dp)
        ) {
            item {
                GreetingSection(navController)
                SearchSection()
                CategorySection(navController)
                CoursesSection(navController)
                RecommendationsSection(navController)
            }
        }
    }
}

@Composable
fun GreetingSection(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate(ROUTE_COURSES) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            }
            .padding(10.dp)
    ) {
        Row {
            Column {
                Text(
                    text = "Hi, Milan!",
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "What do you want to learn today?",
                    fontWeight = FontWeight.Thin
                )
            }
            AsyncImage(
                model = "https://i.pinimg.com/originals/86/68/64/866864e81fdf004999e673ce333eeadb.png",
                contentDescription = "Profile Picture"
            )
        }
    }
}

@Composable
fun SearchSection() {
    var search by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = search,
        onValueChange = { search = it },
        placeholder = { Text("Search...") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    )
}

@Composable
fun CategorySection(navController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text("Categories", fontWeight = FontWeight.Bold)
        }
        Column(
            modifier = Modifier.clickable {
                navController.navigate(ROUTE_COURSES) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            }
        ) {
            Text("View all")
        }
    }
}

@Composable
fun CoursesSection(navController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CourseCard("Data Science", Color(0xffd1f9f4), navController)
        Spacer(modifier = Modifier.width(25.dp))
        CourseCard("Cyber Security", Color(0xffd1e5f9), navController)
    }
}

@Composable
fun CourseCard(title: String, color: Color, navController: NavHostController) {
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(150.dp)
            .clickable {
                navController.navigate(ROUTE_COURSES) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            },
        colors = CardDefaults.cardColors(color)
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(20.dp)
        )
    }
}

@Composable
fun RecommendationsSection(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Recommended", fontWeight = FontWeight.Bold)
            Text("View all")
        }
        Spacer(modifier = Modifier.height(20.dp))
        CourseCard("Introduction to PHP", Color(0xffbfa2f4), navController)
    }
}

@Composable
fun BottomBar(
    selectedItemIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) {
        val items = listOf(
            NavigationItem(Icons.Default.Home, "Home"),
            NavigationItem(Icons.Default.Favorite, "Courses"),
            NavigationItem(Icons.Default.Person, "Profile"),
            NavigationItem(Icons.Default.Favorite, "Favorites")
        )

        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.label) },
                label = { Text(text = item.label) },
                selected = (selectedItemIndex == index),
                onClick = {
                    onItemSelected(index)
                }
            )
        }
    }
}

data class NavigationItem(val icon: ImageVector, val label: String)

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen(rememberNavController())
}
