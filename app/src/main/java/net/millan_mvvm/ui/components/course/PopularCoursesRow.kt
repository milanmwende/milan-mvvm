package net.millan_mvvm.ui.components.course

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.millan_mvvm.ui.theme.Blue200
import androidx.compose.foundation.lazy.items // Import added
import androidx.compose.ui.tooling.preview.Preview
import net.millan_mvvm.data.courses.*

@Composable
fun PopularCourses(
    courses: List<Course>,
    onCourseClick: (Int) -> Unit
) {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            "Popular Courses",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            "View All",
            fontSize = 14.sp,
            color = Blue200,
            fontWeight = FontWeight.Light,
        )
    }
    LazyRow (
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            items(courses) { course ->
                CourseItem(
                    course = course,
                    onClick = onCourseClick
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PopularCoursesPreview() {

    val dummyCourses = listOf(
        // Add more dummy courses as needed
        Course(
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
        Course(
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
        Course(
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
                            videoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQovSRMtNsy77sGP8raNHbvKR8KGj24upJHIw&usqp=CAU"
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
                        profilePic = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQovSRMtNsy77sGP8raNHbvKR8KGj24upJHIw&usqp=CAU"
                    )
                ),
                Review(
                    id = 2,
                    rating = 4.0f,
                    review = "I learned a lot from this course",
                    user = User(
                        id = 2,
                        name = "Alice Smith",
                        profilePic = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5yb4A0O5GJR2yV4EfDN_HiaR5H5Lsj4KmWg&usqp=CAU"
                    )
                )
            )
        )
    )

    PopularCourses(
        courses = dummyCourses,
        onCourseClick = { courseId ->
            // Handle the click event
            // For preview, you can log the clicked course ID
            Log.d("PopularCoursesPreview", "Clicked on course with ID: $courseId")
        }
    )

}
