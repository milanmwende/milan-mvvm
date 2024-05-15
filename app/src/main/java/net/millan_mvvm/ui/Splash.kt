package net.millan_mvvm.ui


import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import net.millan_mvvm.navigation.ROUTE_HOME

import net.millan_mvvm.R
import net.millan_mvvm.navigation.ROUTE_LOGIN


@Composable
fun SplashScreen(navController: NavHostController) {

    Scaffold {

        innerPadding->



        val scale = remember {
            androidx.compose.animation.core.Animatable(0f)
        }

        // Animation
        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 0.7f,
                // tween Animation
                animationSpec = tween(
                    durationMillis = 800,
                    easing = {
                        OvershootInterpolator(4f).getInterpolation(it)
                    })
            )
            // Customize the delay time
            delay(3000L)
            navController.navigate(ROUTE_HOME)
        }

        // Image

        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.cblogo),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(500.dp)
                    .width(800.dp)
                    .padding(50.dp)
            )

            Text("CodeBridge", fontSize = 30.sp, fontFamily = FontFamily.Monospace)


        }


    }

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    SplashScreen(rememberNavController())
}

