package com.example.jetpack_first.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ScreenA(navController: NavController) {

    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = "Ok")
    }
}