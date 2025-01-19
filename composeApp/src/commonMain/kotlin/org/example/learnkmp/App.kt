package org.example.learnkmp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import kotlinx.coroutines.launch
import leankmp.composeapp.generated.resources.Res
import leankmp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource


@Composable
fun App() {
    MaterialTheme {
        val showContent by remember { mutableStateOf(false) }
        val coroutineScope = rememberCoroutineScope()

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                coroutineScope.launch {
                    AuthRepository.signInWithGoogle()
                }
            }) {
                Text("Sign in with Google")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}