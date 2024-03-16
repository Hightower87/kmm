package com.paydustry.advancedsalesapp.composable

import advancedsalesapp.shared.generated.resources.Res
import advancedsalesapp.shared.generated.resources.click
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.paydustry.advancedsalesapp.Platform
import com.paydustry.advancedsalesapp.getPlatform
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

class InitScreen: Screen {
    @OptIn(ExperimentalResourceApi::class)
    @Preview
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        val platform: Platform = getPlatform()
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Hey Merve, Hello, ${platform.name}!")
            Button(onClick = {
                navigator?.push(LoginScreen())
            }, modifier = Modifier) {
                Text(stringResource(Res.string.click))
            }
        }
    }
}