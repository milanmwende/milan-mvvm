package net.millan_mvvm.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.login.LoginScreen
import net.ezra.ui.signup.SignUpScreen
import net.millan_mvvm.ui.SplashScreen
import net.millan_mvvm.ui.components.Les.LessonScreen
import net.millan_mvvm.ui.screen.Course.CourseView
import net.millan_mvvm.ui.screen.Profile.ProfileScreen

import net.millan_mvvm.ui.screen.courses.ContactScreen

import net.millan_mvvm.ui.screen.home.HomeScreen
import net.millan_mvvm.ui.screen.home.HomeViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    homeViewModel: HomeViewModel = HomeViewModel(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

    }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController)
        }


        composable(ROUTE_SIGNUP) {
            SignUpScreen(navController = navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(
                navController,
                homeViewModel
            )
        }


        composable(ROUTE_COURSES) {
            ContactScreen(navController)
        }

        composable(ROUTE_COURSE) {
            CourseView(navController)
        }



        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_PROFILE) {
            ProfileScreen(navController)
        }

        composable(ROUTE_LESSON) {
            LessonScreen(navController)
        }





























    }
}