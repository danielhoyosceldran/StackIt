package com.example.stackit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import com.example.stackit.ui.screens.HomeScreen
import com.example.stackit.ui.screens.AuthScreen
import com.example.stackit.ui.theme.StackItTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StackItTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyNavigationGraph() // This is the main entry point for navigation
                }
            }
        }
    }
}

@Composable
fun MyNavigationGraph() {
    // `rememberNavController()` creates and remembers a NavController for the lifecycle of the Composable.
    val navController = rememberNavController()

    val ROUTE_AUTH = "auth_route"
    val ROUTE_HOME = "home_route"

    var isLoggedIn by remember { mutableStateOf(false) }

    val startDestination = if (isLoggedIn) ROUTE_HOME else ROUTE_AUTH

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(ROUTE_AUTH) {
            AuthScreen(
                onLoginClicked = {
                    isLoggedIn = true // Simulate successful login
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_AUTH) { inclusive = true }
                    }
                }
            )
        }
        composable(ROUTE_HOME) {
            HomeScreen(
                onLogoutClicked = {
                    isLoggedIn = false // Simulate logout
                    navController.navigate(ROUTE_AUTH) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StackItTheme {
        MyNavigationGraph() // Preview your navigation graph
    }
}