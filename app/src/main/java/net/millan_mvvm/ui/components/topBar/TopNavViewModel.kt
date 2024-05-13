package net.millan_mvvm.ui.components.topBar

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TopNavViewModel(): ViewModel() {
    private val _onSearchTextChange = MutableStateFlow("")
    val searchText: StateFlow<String> = _onSearchTextChange.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching: StateFlow<Boolean> = _isSearching.asStateFlow()

    private val _courses = MutableStateFlow<List<Course>>(emptyList())
    val courses: StateFlow<List<Course>> = _courses.asStateFlow()

    private val _notificationCount = MutableStateFlow(0) // Example initial count
    val notificationCount: StateFlow<Int> = _notificationCount



    fun setNotificationCount(count: Int) {
        _notificationCount.value = count
    }

    fun submitSearch() {
        // Handle search submission logic
        // Example: resetting the search text and hiding the search field
    }
}


data class Course (
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val instructor: String,
    val duration: String,
    val rating: Float,
    val students: Int,
)

