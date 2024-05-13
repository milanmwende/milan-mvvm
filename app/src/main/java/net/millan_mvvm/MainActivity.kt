package net.millan_mvvm

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.google.firebase.FirebaseApp
import net.millan_mvvm.navigation.AppNavHost
import net.millan_mvvm.ui.theme.AppTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        setContent {
            AppNavHost()
        }
        // Ensure the system UI (status bar) is visible
        WindowCompat.setDecorFitsSystemWindows(window, true)
    }





}