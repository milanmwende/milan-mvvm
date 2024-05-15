package net.millan_mvvm.ui.components.Les

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.millan_mvvm.R
import net.millan_mvvm.data.courses.Lesson
import net.millan_mvvm.ui.screen.Course.CourseView




@Composable
fun LessonScreen(
    //course: Course
    navController: NavHostController
){
    Scaffold {
        innerPadding->


        Column (modifier = Modifier.padding(innerPadding)){
            Row {
                Column {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null,
                        modifier = Modifier.clickable { navController.popBackStack() },
                    )
                }
                Spacer(
                    modifier = Modifier
                        .width(130.dp)


                )
                Column { Text(text = "Your Courses", fontWeight = FontWeight.ExtraBold) }
            }

            Spacer(
                modifier = Modifier
                    .height(30.dp)
            )

            Row {

                Card (          modifier = Modifier.padding(20.dp)
                ){  Box {
                    Image(
                        painter = painterResource(R.drawable.coding),
                        contentDescription = "Round corner image",
                        )


                } }


            }


            Row (modifier = Modifier.padding(10.dp)){ Text(text = " Lesson  1/30", fontWeight = FontWeight.Medium, color = Color.Blue) }

            Spacer(modifier = Modifier
                .height(10.dp)

            )


            Row(modifier = Modifier.padding(10.dp)){
                Text(text = "Introduction to Kotlin", fontWeight = FontWeight.Bold)

            }

            Spacer(modifier = Modifier
                .height(10.dp)

            )


            Row(modifier = Modifier.padding(20.dp)) {
                Text(text = "The first topic in Kotlin often covers the basics of syntax, variables, data types, and basic control flow structures. It introduces learners to the fundamental building blocks of the language, providing them with a solid foundation for more advanced concepts. This topic typically includes:\n" +
                        "\n" +
                        "Syntax: Explanation of Kotlin's syntax, including statements, expressions, and comments.\n" +
                        "\n" +
                        "Variables: Introduction to declaring variables, understanding mutable and immutable variables, and variable naming conventions.\n" +
                        "\n" +
                        "Data Types: Overview of primitive data types such as Int, Double, Boolean, and Char, as well as more complex types like String and Arrays.\n" +
                        "\n" +
                        "Basic Control Flow: Introduction to control flow structures such as if-else expressions, when expressions (Kotlin's alternative to switch statements), and loops (for and while loops).\n" +
                        "\n" +
                        "Functions: Basic understanding of declaring and calling functions, including function parameters and return types.\n" +
                        "\n" +
                        "This initial topic serves as a starting point for learners to familiarize themselves with the syntax and basic concepts of Kotlin, laying the groundwork for exploring more advanced topics such as object-oriented programming, collections, lambdas, and coroutines."
                ,

                    fontFamily = FontFamily.Serif
                )

            }















        }


    }





}

























@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LessonPreview() {
    LessonScreen(rememberNavController())
}