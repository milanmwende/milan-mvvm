package net.millan_mvvm.ui.screen.courses


import android.content.res.Configuration
//import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import net.millan_mvvm.navigation.ROUTE_COURSES
import net.millan_mvvm.navigation.ROUTE_HOME



@Composable
fun ContactScreen(navController: NavHostController) {


//    Scaffold(
//        bottomBar = {
//            BottomBar(
//                selectedItemIndex = selectedIndex,
//                onItemSelected = { index ->
//                    selectedIndex = index
//                    // Handle navigation based on the selected index
//                    when (index) {
//                        0 -> navController.navigate("home") // Navigate to Home
//                        1 -> navController.navigate("courses") // Navigate to Courses
//                        2 -> navController.navigate("profile") // Navigate to Profile
//                        3 -> navController.navigate("favorites") // Navigate to Favorites
//                    }
//                }
//            )
//        }
//    )

    LazyColumn {
    item {
      Column {
          Row {
              Text(text = "Home",
                  modifier = Modifier
                      .padding(start = 20.dp)
                      .clickable{ navController.navigate(ROUTE_HOME) {
                          popUpTo(ROUTE_COURSES) { inclusive = true }} }

                  )


          }
      }

        Spacer(modifier = Modifier.height(10.dp))
LazyRow (modifier = Modifier
    .padding(start = 30.dp)
){
item {
Card(modifier = Modifier
    .height(30.dp)
    .width(60.dp)
    .padding(start = 10.dp)
) {

Text(text = "Python",
    modifier = Modifier
        .padding(start = 5.dp, top = 5.dp)
)

}

Spacer(modifier = Modifier
    .width(3.dp)
)
    Card(modifier = Modifier
        .height(30.dp)
        .width(60.dp)
        .padding(start = 10.dp)
    ) {

        Text(text = "Python",
            modifier = Modifier
                .padding(start = 5.dp, top = 5.dp)
        )

    }


    Spacer(modifier = Modifier
        .width(3.dp)
    )
    Card(modifier = Modifier
        .height(30.dp)
        .width(60.dp)
        .padding(start = 10.dp)
    ) {

        Text(text = "Python",
            modifier = Modifier
                .padding(start = 5.dp, top = 5.dp)
        )

    }


    Spacer(modifier = Modifier
        .width(3.dp)
    )
    Card(modifier = Modifier
        .height(30.dp)
        .width(60.dp)
        .padding(start = 10.dp)
    ) {

        Text(text = "Python",
            modifier = Modifier
                .padding(start = 5.dp, top = 5.dp)
        )

    }


    Spacer(modifier = Modifier
        .width(3.dp)
    )
    Card(modifier = Modifier
        .height(30.dp)
        .width(60.dp)
        .padding(start = 10.dp)
    ) {

        Text(text = "Python",
            modifier = Modifier
                .padding(start = 5.dp, top = 5.dp)
        )

    }

















}



}
Spacer(modifier = Modifier
    .height(10.dp)
)








          Row {

           Card (
               modifier = Modifier
                   .fillMaxWidth()
                   .height(200.dp)
                   .padding(all = 10.dp),
               colors = CardDefaults.cardColors(Color(0xffAFE8F9))

           ){
               Box() {

//                   AsyncImage(
//                       model = "https://i.pinimg.com/originals/86/68/64/866864e81fdf004999e673ce333eeadb.png",
//                       contentDescription = "python",
//                       modifier = Modifier
//                           .height(50.dp)
//                           .width(60.dp)
//
//                   )

                   Text(text = "Introduction to Full-Stack Development",
                   modifier = Modifier
                       .padding(all = 20.dp),
                   fontFamily = FontFamily.Serif,
                   fontWeight = FontWeight.ExtraBold,
                   fontSize = 20.sp,
                   textAlign = TextAlign.Center,
//                   Icon(Icons.Default.PlayArrow),


               )
               }





           }








          }
          Spacer(modifier = Modifier.height(10.dp))

Row {
    Card (modifier = Modifier
        .height(70.dp)
        .fillMaxWidth()
    ){
        Row {  Text(text = "Lesson 2/50") }
        Row {  Text(text = "Writing different values using HTML", fontWeight = FontWeight.Light) }


    }


      }

          Spacer(modifier = Modifier.height(10.dp))

          Row {
              Card (modifier = Modifier
                  .height(70.dp)
                  .fillMaxWidth()
              ){
                  Row {  Text(text = "Lesson 2/50") }
                  Row {  Text(text = "Writing different values using HTML", fontWeight = FontWeight.Light) }


              }



}
          Spacer(modifier = Modifier.height(10.dp))
          Row {
              Card (modifier = Modifier
                  .height(70.dp)
                  .fillMaxWidth()
              ){
                  Row {  Text(text = "Lesson 2/50") }
                  Row {  Text(text = "Writing different values using HTML", fontWeight = FontWeight.Light) }


              }





              }



          Spacer(modifier = Modifier.height(10.dp))

          Row {
              Card (modifier = Modifier
                  .height(70.dp)
                  .fillMaxWidth()
              ){
                  Row {  Text(text = "Lesson 2/50") }
                  Row {  Text(text = "Writing different values using HTML", fontWeight = FontWeight.Light) }


              }


          }


          Spacer(modifier = Modifier.height(10.dp))

          Row {
              Card(
                  modifier = Modifier
                      .height(70.dp)
                      .fillMaxWidth()
              ) {
                  Column {
                      Row { Text(text = "Lesson 2/50") }
                      Row { Text(text = "Writing different values using HTML", fontWeight = FontWeight.Light) }

                  }

              }

              Column {
                  Row {
                      AsyncImage(
                          model = "https://i.pinimg.com/originals/86/68/64/866864e81fdf004999e673ce333eeadb.png",
                          contentDescription = "python",
                          modifier = Modifier
                              .height(50.dp)
                              .width(60.dp)

                      )

                  }
              }


          }






          }}

//
//    @Composable
//    fun BottomBar(
//        selectedItemIndex: Int,
//        onItemSelected: (Int) -> Unit
//    ) {
//        NavigationBar(
//            containerColor = MaterialTheme.colorScheme.primaryContainer,
//            modifier = Modifier
////            .hoverable( "")
//
//        ) {
//            val items = listOf(
//                NavigationItem(Icons.Default.Home, "Home"),
//                NavigationItem(Icons.Default.PlayArrow, "Courses"),
//                NavigationItem(Icons.Default.Favorite, "Favourites"),
//                NavigationItem(Icons.Default.Person, "Profile")
//            )
//
//            items.forEachIndexed { index, item ->
//                NavigationBarItem(
//                    icon = { Icon(imageVector = item.icon, contentDescription = item.label) },
//                    label = { Text(text = item.label) },
//                    selected = (selectedItemIndex == index),
//                    onClick = {
//                        onItemSelected(index)
//                    }
//                )
//            }
//        }
//    }

    data class NavigationItem(val icon: ImageVector, val label: String)




}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

