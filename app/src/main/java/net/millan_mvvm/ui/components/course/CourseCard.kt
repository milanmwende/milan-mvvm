package net.millan_mvvm.ui.components.course

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.millan_mvvm.data.courses.*
import net.millan_mvvm.ui.theme.Blue200

@Composable
fun CourseItem(
    course: Course,
    onClick: (Int) -> Unit
) {

    Column(
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .fillMaxWidth()
            .clickable(onClick = { onClick(course.id) })
    ) {
        // Display image
        ImageCard(
            imageUrl = course.thumbnail,
            contentDescription = course.title,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )

        // Display title
        Text(
            text = course.title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        // Display instructor
        Text(
            text = course.instructor,
            fontSize = 12.sp,
            color = Blue200,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(2.dp))

        // Display stars based on rating
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                repeat(5) { index ->
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = if (index < course.rating.toInt()) Color(0xFFFFD700) else Color.Gray,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                }
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "(${course.rating})",
                    fontSize = 10.sp,
                    color = Color.Gray
                )
            }
        }/**/
    }
}

@Preview(showBackground = true)
@Composable
fun CourseItemPreview() {
    CourseItem(
        course = Course(
            id = 1,
            title = "Python for Beginners",
            description = "Learn Python from scratch",
            thumbnail = "https://images.unsplash.com/photo-1521185496955-15097b20c5fe?q=80&w=2850&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            instructor = "John Doe",
            rating = 4.5f,
            aboutCourse = "This course is designed for beginners...",
            lessons = 10,
            modules = listOf(
                Module(
                    id = 1,
                    title = "Introduction to Python",
                    description = "Learn the basics of Python",
                    lessons = listOf(
                        Lesson(
                            id = 1,
                            title = "What is Python?",
                            duration = "5:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 2,
                            title = "Setting up Python",
                            duration = "7:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 3,
                            title = "Your First Python Program",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                ),
                Module(
                    id = 2,
                    title = "Intermediate Python",
                    description = "Learn intermediate Python concepts",
                    lessons = listOf(
                        Lesson(
                            id = 4,
                            title = "Python Functions",
                            duration = "8:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 5,
                            title = "Python Classes",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                )
            ),
            reviews = listOf(
                Review(
                    id = 1,
                    rating = 4.5f,
                    review = "Great course for beginners",
                    user = User(
                        id = 1,
                        name = "Jane Doe",
                        profilePic = "https://..."
                    )
                ),
                Review(
                    id = 2,
                    rating = 4.0f,
                    review = "I learned a lot from this course",
                    user = User(
                        id = 2,
                        name = "Alice Smith",
                        profilePic = "https://..."
                    )
                )
            )
        ),
        onClick = {}
    )
}/**/

