package net.millan_mvvm.ui.screen.Profile

import android.content.res.Configuration
import net.millan_mvvm.ui.screen.home.HomeViewModel

// HomeScreen.kt


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material.dialog.Alert
import coil.compose.AsyncImage
import net.millan_mvvm.R
import net.millan_mvvm.navigation.ROUTE_COURSE
import net.millan_mvvm.navigation.ROUTE_LOGIN
import net.millan_mvvm.navigation.ROUTE_PROFILE
import net.millan_mvvm.navigation.ROUTE_SIGNUP
import net.millan_mvvm.ui.components.course.*
import net.millan_mvvm.ui.theme.Blue200


fun <Painter> Image(painter: Painter) {

}

fun Alert() {
    TODO("Not yet implemented")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    navController: NavHostController,

) {
    Scaffold() {


         innerPadding ->



        Column(modifier = Modifier.padding(innerPadding)) {
            Row {
                Icon(
                    Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null,
                    modifier = Modifier.clickable { navController.popBackStack() },
                )

                Spacer(
                    modifier = Modifier
                        .width(130.dp)
                )

                Column { Text(text = "Edit Profile", fontWeight = FontWeight.ExtraBold) }


            }

            Spacer(
                modifier = Modifier
                    .height(
                        5.dp
                    )
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 100.dp, top = 40.dp)


            ) {
                Image(
                    painter = painterResource(R.drawable.img_1),
                    contentDescription = "Round corner image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .border(5.dp, Color.White, RoundedCornerShape(40))
                )

//      AsyncImage(
//    model = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FGuy_Black%2C_Baron_Black_of_Brentwood&psig=AOvVaw3mAsWW5utlEG5eKkzlyWJO&ust=1715730992191000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCKDV0ZTqi4YDFQAAAAAdAAAAABAF",
//    contentDescription = null,)
//  }


            }

            Spacer(
                modifier = Modifier
                    .height(
                        5.dp
                    )
            )



            Row {
                var text by remember { mutableStateOf(TextFieldValue("")) }
              OutlinedTextField(
                    value = text,
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
                    //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                    onValueChange = {
                    text = it
                    },
                    label = { Text(text = "Email address") },
                    placeholder = { Text(text = "Enter your e-mail") },
                    modifier = Modifier.padding(start = 40.dp, top = 10.dp)
                )

            }


            Spacer(
                modifier = Modifier
                    .height(
                        5.dp
                    )
            )

            Row {
                var text by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = text,
                    leadingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Password") },
                    //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                    onValueChange = {
                        text = it
                    },
                    label = { Text(text = "Old Password") },
                    placeholder = { Text(text = "Password") },
                    modifier = Modifier.padding(start = 40.dp, top = 20.dp)
                )

            }

            Spacer(
                modifier = Modifier
                    .height(
                        5.dp
                    )
            )

            Row {
                var text by remember { mutableStateOf(TextFieldValue("")) }
             OutlinedTextField(
                    value = text,
                    leadingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Password") },
                    //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                    onValueChange = {
                    text = it
                    },
                    label = { Text(text = "New Password") },
                    placeholder = { Text(text = "Password") },
                    modifier = Modifier.padding(start = 40.dp, top = 20.dp)
                )

            }
            Spacer(
                modifier = Modifier.height(
                    20.dp
                )
            )
            Button(
                onClick = { Alert() }) {
                Text(text = "Updated successfully")}
            var colors = ButtonDefaults.buttonColors(
                containerColor = Blue200
            ) // Change color here
            var modifier = Modifier.align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(100.dp)

//            {
//                Text("Update", color = Color.White)
//            }


            Row {
                Text(text = "Log Out",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 150.dp)

                        .clickable {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_PROFILE) { inclusive = true }}


            }
                )
            }


        }}



    }








@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun PreviewHomeScreen() {
    ProfileScreen(rememberNavController())
}
