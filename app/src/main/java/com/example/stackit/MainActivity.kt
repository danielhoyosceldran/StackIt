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
import com.example.stackit.ui.screens.HomeScreen
import com.example.stackit.ui.screens.AuthScreen
import com.example.stackit.ui.theme.StackItTheme
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost


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
    // Create a NavController. It manages app navigation state.
    // `rememberNavController()` creates and remembers a NavController for the lifecycle of the Composable.
    val navController = rememberNavController()

    val ROUTE_AUTH = "auth_route" // Route for the authentication screen
    val ROUTE_HOME = "home_route" // Route for the home screen

    val startDestination = ROUTE_HOME

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = Modifier.fillMaxSize() // Make NavHost fill the available space
    ) {
        composable(ROUTE_AUTH) {
            AuthScreen()
        }
        composable(ROUTE_HOME) {
            HomeScreen()
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