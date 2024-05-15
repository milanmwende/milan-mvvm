package net.millan_mvvm.ui.screen.Course

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.google.firebase.database.core.utilities.Clock
import net.millan_mvvm.R
import net.millan_mvvm.navigation.ROUTE_COURSES
import net.millan_mvvm.navigation.ROUTE_HOME
import net.millan_mvvm.navigation.ROUTE_LESSON

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseView(
    //course: Course
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                //back navigation
                navigationIcon = {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null,
                        modifier = Modifier.clickable { navController.popBackStack() },
                    )
                },
                title = {
                    Text(
                        text = "Introduction to Android Development",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                },
            )
        },
    ) { innerPadding ->

        LazyColumn { item { Column(
            modifier = Modifier.padding(innerPadding)
                .padding(horizontal = 16.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.Gray, RoundedCornerShape(16.dp))
            ) {
                //image
                AsyncImage(
                    model = "https://images.unsplash.com/photo-1521185496955-15097b20c5fe?q=80&w=2850&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                    contentDescription = "Android Dev",
                    modifier = Modifier
                        .fillMaxSize()

                )
            }

            // course description
            Text(
                text = "Introduction to Android Development",
                modifier = Modifier.padding(8.dp),
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Row {
                Column {

                    Row {
                        Icon(
                            painter = painterResource(R.drawable.baseline_access_time_24),
                            contentDescription = "Star",
                            tint = Color.Gray,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "1hour 30minutes")
                    }


                }


            }

            Row {

                Text(text = "30 Lessons",
                    modifier = Modifier.padding(start = 40.dp)

                )


            }


            Spacer(
                modifier = Modifier
                    .height(
                        10.dp
                    )
            )

            Row {
                Text(
                    text = "About the Course",
                    color = Color.Blue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                )

            }


            Row {

                Text(
                    text = "Python's popularity stems from its user-friendly syntax, which resembles everyday language and promotes readability and maintainability of code. Unlike traditional programming languages, Python allows developers to express complex ideas in just a few lines of code, making it accessible to individuals with diverse backgrounds and skill levels. Whether you're a novice programmer or an experienced developer looking to expand your skill set, Python provides a welcoming environment for learning and experimentation.As we embark on this journey into the world of Python programming, we invite you to embrace the endless possibilities that await. Whether you're aspiring to become a software developer, data scientist, or simply looking to expand your horizons, Python offers a gateway to creativity, innovation, and problem-solving. Join us as we unravel the mysteries of Python and embark on a transformative learning experience that will shape your future in the world of technology.",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Light
                )


            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Text(text = "Course Lecturers", fontWeight = FontWeight.SemiBold)

            }

            Row {
//Column {   AsyncImage(
//    model = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FGuy_Black%2C_Baron_Black_of_Brentwood&psig=AOvVaw3mAsWW5utlEG5eKkzlyWJO&ust=1715730992191000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCKDV0ZTqi4YDFQAAAAAdAAAAABAF",
//    contentDescription = null,)


                Column {

                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = "Round corner image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(70.dp)

                    )


                    Text(text = "Kate Vuan") }



                Spacer(modifier = Modifier.width(70.dp))



                Column {

                    Image(
                        painter = painterResource(R.drawable.l2),
                        contentDescription = "Round corner image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(70.dp)
                    )

                    Text(text = "Jakes Spencer") }


            }

            Row {

                Button(
                    onClick = {
                        navController.navigate(ROUTE_LESSON) {
                            popUpTo(ROUTE_COURSES) { inclusive = true }
                        }
                    },
                    modifier = Modifier
                        .width(350.dp)

                ) {


                    Text(text = "Start Learning Now")


                }


            }
        }




        }






        }

//grid
            /*
            * description on duration, number of lessons, rating and number of students
            * */

            //course content
            /*
            * tab with about course, modules, reviews
            * */


        }
    }



@Preview(showBackground = true)
@Composable
fun CourseViewPreview() {
    CourseView(rememberNavController())
}