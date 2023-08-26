package com.example.jetpack_first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_first.nav.setUpNavController
import com.example.jetpack_first.ui.theme.JetpackfirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            PostOfficeApp()
            JetpackfirstTheme {
                Surface(color = MaterialTheme.colorScheme.primary) {
                    setUpNavController(controller = rememberNavController())
                }
            }
        }
    }
}





