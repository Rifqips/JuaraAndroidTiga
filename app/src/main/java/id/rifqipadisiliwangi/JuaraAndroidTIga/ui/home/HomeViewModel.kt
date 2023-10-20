package id.rifqipadisiliwangi.JuaraAndroidTIga.ui.home

import androidx.lifecycle.ViewModel
import id.rifqipadisiliwangi.JuaraAndroidTIga.data.Item

/**
 * ViewModel to retrieve all items in the Room database.
 */
class HomeViewModel() : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * Ui State for HomeScreen
 */
data class HomeUiState(val itemList: List<Item> = listOf())
