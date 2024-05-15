// HomeScreen.kt
package net.millan_mvvm.ui.screen.home

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.R
import net.millan_mvvm.navigation.ROUTE_COURSE
import net.millan_mvvm.ui.components.course.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeViewModel
) {
    LaunchedEffect(key1 = Unit) {
        Log.d("HomeScreen", "Fetching popular courses")
        viewModel.fetchPopularCourses()
    }

    // Collect popularCourses StateFlow and display UI
    val courses by viewModel.popularCourses.collectAsState()
    var currentScreen by remember { mutableStateOf(NavItem.Home) }
    Log.d("sd", "PopularCourses: ${courses.size}")
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
        bottomBar = {
            BottomNavigation(
                onItemClick = { route ->
                    navController.navigate(route)

                },
                currentScreen = currentScreen
            )
        }
        ,
        modifier = Modifier.fillMaxSize()

    ){ innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            SearchField()
            Spacer(modifier = Modifier.height(8.dp))
            PopularCourses(
                courses,
                onCourseClick = {
                    navController.navigate(ROUTE_COURSE)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            RecomendedCourses(navController = navController)
            Spacer(modifier = Modifier.height(8.dp))
            Categories()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen(navController = rememberNavController(), viewModel = HomeViewModel())
}
