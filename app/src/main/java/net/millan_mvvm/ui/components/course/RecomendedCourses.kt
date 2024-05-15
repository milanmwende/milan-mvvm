package net.millan_mvvm.ui.components.course

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.R
import net.millan_mvvm.navigation.ROUTE_HOME
import net.millan_mvvm.navigation.ROUTE_LOGIN
import net.millan_mvvm.ui.theme.Blue200

@Composable
fun RecomendedCourses(navController: NavController) {



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Recommended Courses",
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(16.dp)
                .background(Color(0x30808080), RoundedCornerShape(16.dp))
                .clip(RoundedCornerShape(26.dp))
        ){
            Column{

              Row {

                  Image(
                      painter = painterResource(R.drawable.coding),
                      contentDescription = "Round corner image", modifier = Modifier.fillMaxWidth()



                  )
              }


          }




            }

        Row {
            Text(text = "Introduction to Python", fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .clickable {  navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    } }
                )

        }

        Row {
            Text(text = "By.   Jack Peterson", fontWeight = FontWeight.Light, color = Color.Blue)

        }




        }

    }


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreviewLight() {
    RecomendedCourses(rememberNavController())
}
