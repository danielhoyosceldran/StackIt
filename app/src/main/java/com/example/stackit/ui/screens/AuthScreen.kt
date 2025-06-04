package com.example.stackit.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stackit.ui.theme.StackItTheme

@Composable
fun AuthScreen() {
    // A Surface is a rectangular area with a background color and shadows.
    // It's often used as the root composable for screens.
    Surface(
        modifier = Modifier.fillMaxSize(), // Fills the entire available space
        color = MaterialTheme.colorScheme.background // Uses the theme's background color
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center, // Centers children vertically
            horizontalAlignment = Alignment.CenterHorizontally // Centers children horizontally
        ) {
            // Display a simple text for the Login screen
            Text(text = "Login Screen", style = MaterialTheme.typography.headlineLarge)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    // You should wrap previews with your app's theme
    StackItTheme { // Assuming your theme is named StackItTheme as per default template
        AuthScreen()
    }
}