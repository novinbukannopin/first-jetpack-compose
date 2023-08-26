package com.example.jetpack_first.component

sealed class ScreenConfig(val route: String) {
    object screenA : ScreenConfig("A")
    object screenSplash : ScreenConfig("splash")
}