package net.millan_mvvm.ui.components.course

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutScreen(navController: NavHostController) {

LazyColumn {
    item {























    }

}



}






















@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    net.millan_mvvm.ui.screen.courses.AboutScreen(rememberNavController())
}
