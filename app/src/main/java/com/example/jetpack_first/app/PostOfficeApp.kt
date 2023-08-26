package com.example.jetpack_first.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_first.screen.SignUpScreen

@Composable
fun PostOfficeApp() {
    Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
        SignUpScreen(navController = rememberNavController())
    }
}