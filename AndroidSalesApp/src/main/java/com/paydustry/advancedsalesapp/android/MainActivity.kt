package com.paydustry.advancedsalesapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.paydustry.advancedsalesapp.composable.InitScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigator(screen = InitScreen())
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Navigator(screen = InitScreen())
}
