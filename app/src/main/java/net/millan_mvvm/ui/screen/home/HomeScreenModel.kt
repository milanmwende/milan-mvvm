package net.millan_mvvm.ui.screen.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import net.millan_mvvm.data.courses.Course
import net.millan_mvvm.data.courses.CourseRepository

class HomeViewModel : ViewModel() {
    private val courseRepository = CourseRepository()
    private val _popularCourses = MutableStateFlow<List<Course>>(emptyList())

    // Expose popularCourses as StateFlow instead of a simple List
    val popularCourses: StateFlow<List<Course>> = _popularCourses

    // navigate to course details


    fun fetchPopularCourses() {
        viewModelScope.launch {
            try {
                // Fetch popular courses from the repository
                val courses = courseRepository.getPopularCourses()
                // Update the StateFlow with fetched courses
                _popularCourses.value = courses
            } catch (e: Exception) {
                // Handle any errors, e.g., log or display an error message
                Log.e(TAG, "Failed to fetch popular courses", e)
            }
        }
    }

    companion object {
        private const val TAG = "HomeViewModel"
    }
}

