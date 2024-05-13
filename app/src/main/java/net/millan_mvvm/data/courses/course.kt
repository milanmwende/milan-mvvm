package net.millan_mvvm.data.courses


data class Course(
    val id: Int,
    val title: String,
    val description: String,
    val thumbnail: String,
    val instructor: String,
    val rating: Float,
    val aboutCourse: String,
    val lessons: Int,
    val modules: List<Module>,
    val reviews: List<Review>
)

data class Module(
    val id: Int,
    val title: String,
    val description: String,
    val lessons: List<Lesson>
)

data class Lesson (
    val id: Int,
    val title: String,
    val duration: String,
    val isCompleted: Boolean,
    val videoUrl: String,
    val isLast: Boolean = false
)

data class Review(
    val id: Int,
    val rating: Float,
    val review: String,
    val user: User
)

data class User(
    val id: Int,
    val name: String,
    val profilePic: String
)
