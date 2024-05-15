// CourseRepository.kt
package net.millan_mvvm.data.courses

class CourseRepository {
    private val courses = listOf(
        Course(
            id = 1,
            title = "Python for Beginners",
            description = "Learn Python from scratch",
            thumbnail = "https://plus.unsplash.com/premium_photo-1661746658792-f45a2c46ad1b?q=80&w=2940&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
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
                            videoUrl = "https://images.unsplash.com/photo-1526379095098-d400fd0bf935?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHl0aG9uJTIwcHJvZ3JhbW1pbmd8ZW58MHx8MHx8fDA%3D"
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
            id = 2,
            title = "Kotlin for Android",
            description = "Learn Kotlin for Android development",
            thumbnail = "https://images.unsplash.com/photo-1515879218367-8466d910aaa4?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8bGVhcm5pbmclMjBjb2Rpbmd8ZW58MHx8MHx8fDA%3D",
            instructor = "Jane Smith",
            rating = 4.8f,
            aboutCourse = "This course covers Kotlin programming...",
            lessons = 8,
            modules = listOf(
                Module(
                    id = 3,
                    title = "Introduction to Kotlin",
                    description = "Learn the basics of Kotlin",
                    lessons = listOf(
                        Lesson(
                            id = 6,
                            title = "What is Kotlin?",
                            duration = "5:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 7,
                            title = "Setting up Kotlin",
                            duration = "7:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 8,
                            title = "Your First Kotlin Program",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                ),
                Module(
                    id = 4,
                    title = "Intermediate Kotlin",
                    description = "Learn intermediate Kotlin concepts",
                    lessons = listOf(
                        Lesson(
                            id = 9,
                            title = "Kotlin Functions",
                            duration = "8:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 10,
                            title = "Kotlin Classes",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                )
            ),
            reviews = listOf(
                Review(
                    id = 3,
                    rating = 4.8f,
                    review = "Great course for Android developers",
                    user = User(
                        id = 3,
                        name = "John Smith",
                        profilePic = "https://..."
                    )
                ),
                Review(
                    id = 4,
                    rating = 4.5f,
                    review = "I learned a lot from this course",
                    user = User(
                        id = 4,
                        name = "Bob Johnson",
                        profilePic = "https://..."
                    )
                )
            )
        ),
        Course(
            id = 3,
            title = "Kotlin for Android",
            description = "Learn Kotlin for Android development",
            thumbnail = "https://images.unsplash.com/photo-1605379399642-870262d3d051?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8cHJvZ3JhbW1pbmd8ZW58MHx8MHx8fDA%3D",
            instructor = "Jane Smith",
            rating = 4.8f,
            aboutCourse = "This course covers Kotlin programming...",
            lessons = 8,
            modules = listOf(
                Module(
                    id = 3,
                    title = "Introduction to Kotlin",
                    description = "Learn the basics of Kotlin",
                    lessons = listOf(
                        Lesson(
                            id = 6,
                            title = "What is Kotlin?",
                            duration = "5:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 7,
                            title = "Setting up Kotlin",
                            duration = "7:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 8,
                            title = "Your First Kotlin Program",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                ),
                Module(
                    id = 4,
                    title = "Intermediate Kotlin",
                    description = "Learn intermediate Kotlin concepts",
                    lessons = listOf(
                        Lesson(
                            id = 9,
                            title = "Kotlin Functions",
                            duration = "8:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 10,
                            title = "Kotlin Classes",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                )
            ),
            reviews = listOf(
                Review(
                    id = 3,
                    rating = 4.8f,
                    review = "Great course for Android developers",
                    user = User(
                        id = 3,
                        name = "John Smith",
                        profilePic = "https://..."
                    )
                ),
                Review(
                    id = 4,
                    rating = 4.5f,
                    review = "I learned a lot from this course",
                    user = User(
                        id = 4,
                        name = "Bob Johnson",
                        profilePic = "https://..."
                    )
                )
            )
        ),
        Course(
            id = 4,
            title = "Kotlin for Android",
            description = "Learn Kotlin for Android development",
            thumbnail = "https://unsplash.com/photos/laptop-computer-showing-a-coding-program-in-programer-studio-meeting-room-Rm9X6NvOB18",
            instructor = "Jane Smith",
            rating = 4.8f,
            aboutCourse = "This course covers Kotlin programming...",
            lessons = 8,
            modules = listOf(
                Module(
                    id = 3,
                    title = "Introduction to Kotlin",
                    description = "Learn the basics of Kotlin",
                    lessons = listOf(
                        Lesson(
                            id = 6,
                            title = "What is Kotlin?",
                            duration = "5:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 7,
                            title = "Setting up Kotlin",
                            duration = "7:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 8,
                            title = "Your First Kotlin Program",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                ),
                Module(
                    id = 4,
                    title = "Intermediate Kotlin",
                    description = "Learn intermediate Kotlin concepts",
                    lessons = listOf(
                        Lesson(
                            id = 9,
                            title = "Kotlin Functions",
                            duration = "8:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 10,
                            title = "Kotlin Classes",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                )
            ),
            reviews = listOf(
                Review(
                    id = 3,
                    rating = 4.8f,
                    review = "Great course for Android developers",
                    user = User(
                        id = 3,
                        name = "John Smith",
                        profilePic = "https://..."
                    )
                ),
                Review(
                    id = 4,
                    rating = 4.5f,
                    review = "I learned a lot from this course",
                    user = User(
                        id = 4,
                        name = "Bob Johnson",
                        profilePic = "https://..."
                    )
                )
            )
        ),
        Course(
            id = 5,
            title = "Kotlin for Android",
            description = "Learn Kotlin for Android development",
            thumbnail = "https://plus.unsplash.com/premium_photo-1661882403999-46081e67c401?q=80&w=2858&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            instructor = "Jane Smith",
            rating = 4.8f,
            aboutCourse = "This course covers Kotlin programming...",
            lessons = 8,
            modules = listOf(
                Module(
                    id = 3,
                    title = "Introduction to Kotlin",
                    description = "Learn the basics of Kotlin",
                    lessons = listOf(
                        Lesson(
                            id = 6,
                            title = "What is Kotlin?",
                            duration = "5:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 7,
                            title = "Setting up Kotlin",
                            duration = "7:00",
                            isCompleted = true,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 8,
                            title = "Your First Kotlin Program",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                ),
                Module(
                    id = 4,
                    title = "Intermediate Kotlin",
                    description = "Learn intermediate Kotlin concepts",
                    lessons = listOf(
                        Lesson(
                            id = 9,
                            title = "Kotlin Functions",
                            duration = "8:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        ),
                        Lesson(
                            id = 10,
                            title = "Kotlin Classes",
                            duration = "10:00",
                            isCompleted = false,
                            videoUrl = "https://..."
                        )
                    )
                )
            ),
            reviews = listOf(
                Review(
                    id = 3,
                    rating = 4.8f,
                    review = "Great course for Android developers",
                    user = User(
                        id = 3,
                        name = "John Smith",
                        profilePic = "https://..."
                    )
                ),
                Review(
                    id = 4,
                    rating = 4.5f,
                    review = "I learned a lot from this course",
                    user = User(
                        id = 4,
                        name = "Bob Johnson",
                        profilePic = "https://..."
                    )
                )
            )
        )
    )

    fun getCourses(): List<Course> = courses

    fun getCourseById(courseId: Int): Course {
        return courses.find { it.id == courseId }!!
    }

    fun getPopularCourses(): List<Course> {
        return courses.take(5)
    }
}