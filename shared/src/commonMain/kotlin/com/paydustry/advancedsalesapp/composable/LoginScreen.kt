package com.paydustry.advancedsalesapp.composable

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.paydustry.advancedsalesapp.Platform
import com.paydustry.advancedsalesapp.getPlatform

class LoginScreen: Screen {
    @Preview
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Logged in!")
            Button(onClick = {
                navigator?.pop()
            }, modifier = Modifier) {
                Text("Click to go back")
            }
        }
    }
}