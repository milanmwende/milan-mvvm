package net.millan_mvvm.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.ui.SplashScreen
import net.millan_mvvm.ui.screen.about.AboutScreen
import net.millan_mvvm.ui.screen.auth.LoginScreen
import net.millan_mvvm.ui.screen.auth.SignupScreen
import net.millan_mvvm.ui.screen.contact.ContactScreen
import net.millan_mvvm.ui.screen.evening.EveningScreen
import net.millan_mvvm.ui.screen.home.HomeScreen
import net.millan_mvvm.ui.screen.mit.MitScreen
import net.millan_mvvm.ui.screen.products.ProductsScreen
import net.millan_mvvm.ui.screen.services.ServicesScreen
import net.millan_mvvm.ui.screen.shop.ShopScreen
import net.millan_mvvm.ui.screen.students.AddStudents

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
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_SERVICES) {
            ServicesScreen(navController)
        }

        composable(ROUTE_MIT) {
            MitScreen(navController)
        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_PRODUCTS) {
            ProductsScreen(navController)
        }

        composable(ROUTE_EVENING) {
            EveningScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

































    }
}