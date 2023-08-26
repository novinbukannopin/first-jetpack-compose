package com.example.jetpack_first.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpack_first.component.ScreenConfig
import com.example.jetpack_first.screen.SignUpScreen
import com.example.jetpack_first.screen.SplashScreen


@Composable
fun setUpNavController(controller: NavHostController) {
    NavHost(navController = controller, startDestination = ScreenConfig.screenSplash.route) {
        composable(ScreenConfig.screenA.route) {
            SignUpScreen(navController = controller)
        }

        composable(ScreenConfig.screenSplash.route) {
            SplashScreen(navController = controller)
        }
    }
}