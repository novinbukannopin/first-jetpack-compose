package com.example.jetpack_first.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_first.R
import com.example.jetpack_first.component.ScreenConfig
import com.example.jetpack_first.ui.theme.NunitoSans
import com.example.jetpack_first.ui.theme.Primary
import com.example.jetpack_first.ui.theme.TextColor
import com.example.jetpack_first.ui.theme.WhiteBG
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {


    LaunchedEffect(key1 = true) {
        delay(3000)
        navController.navigate(ScreenConfig.screenA.route) {
            popUpTo(0)
        }
    }

    Surface(color = WhiteBG) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_splash),
                contentDescription = "Icon Splash",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = "Welcome",
                color = Primary,
                fontFamily = NunitoSans,
                fontWeight = FontWeight.SemiBold,
                fontSize = 42.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = "Lorem ipsum dolor sit amet, tes bos ku selamat datang",
                    color = Primary,
                    fontFamily = NunitoSans,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(56.dp))
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = "powered by Uinsby",
                    color = TextColor,
                    fontFamily = NunitoSans,
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewSplashScreen() {
    SplashScreen(navController = rememberNavController())
}