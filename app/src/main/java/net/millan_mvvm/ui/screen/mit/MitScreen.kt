package net.millan_mvvm.ui.screen.mit

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.navigation.ROUTE_ABOUT
import net.millan_mvvm.navigation.ROUTE_HOME


@Composable
fun MitScreen(navController: NavHostController) {




    Column {
        Text(text = "MIT Screen")

        Text(text = "hjfd")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                    }
                },
            text = "Home"
        )
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())
}

