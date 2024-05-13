package net.millan_mvvm.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.ui.SplashScreen
import net.millan_mvvm.ui.screen.auth.LoginScreen
import net.millan_mvvm.ui.screen.auth.SignupScreen
import net.millan_mvvm.ui.screen.courses.ContactScreen

import net.millan_mvvm.ui.screen.home.HomeScreen
import net.millan_mvvm.ui.screen.home.HomeViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
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
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen()
        }




        composable(ROUTE_COURSES) {
            ContactScreen(navController)
        }



        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

































    }
}