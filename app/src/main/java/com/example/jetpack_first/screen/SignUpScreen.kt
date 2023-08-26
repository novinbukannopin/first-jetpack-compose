package com.example.jetpack_first.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpack_first.R
import com.example.jetpack_first.component.HeadingTextComponent
import com.example.jetpack_first.component.MyTextField
import com.example.jetpack_first.component.NormalTextComponent

@Composable
fun SignUpScreen(navController: NavController) {
    Surface(
        color = Color.White, modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(40.dp))
            MyTextField(
                label = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.ic_user)
            )
            MyTextField(
                label = stringResource(id = R.string.last_name),
                painterResource(id = R.drawable.ic_user)
            )
            MyTextField(
                label = stringResource(id = R.string.email),
                painterResource(id = R.drawable.ic_email)
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreviewSignUpScreen() {
//    SignUpScreen()
}