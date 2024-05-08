package net.millan_mvvm.ui.screen.evening

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.navigation.ROUTE_HOME
import net.millan_mvvm.navigation.ROUTE_PRODUCTS

@Composable
fun EveningScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){
        Text(text = "this is the evening screen")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }
                },
            text = "Go home"
        )




    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

