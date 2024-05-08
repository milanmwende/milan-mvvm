package net.millan_mvvm.ui.screen.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.navigation.ROUTE_HOME
import net.millan_mvvm.navigation.ROUTE_PRODUCTS

import net.millan_mvvm.R

@Composable
fun ProductsScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){
        Text(text = "this is the product screen")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }
                },
            text = "Go home", color = Color(0xff23D342)
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription =null,

            colorFilter = ColorFilter.tint(Color.Green)

            )




    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

