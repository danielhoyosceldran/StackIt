package com.example.stackit.ui.screens

import android.R.attr.fontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stackit.ui.theme.StackItTheme
import com.example.stackit.R
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

data class Collection(val id: String, val name: String, val description: String)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onLogoutClicked: () -> Unit) {
    val collections = getPlaceholderCollections();
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = stringResource(R.string.app_name),
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Text(stringResource(R.string.app_name))
                    }
                },
                actions = {
                    IconButton(onClick = onLogoutClicked) {
                        Icon(
                            Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "Logout",
                            modifier = Modifier.padding(end = 8.dp))
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* todo: Add code to create collection */ },
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if(collections.isEmpty()) {
                    Text(text = "No collections found")
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                            .padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(collections) { collection ->
                            CollectionCard(collection)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CollectionCard(collection: Collection) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Text(
            text = collection.name,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    StackItTheme {
        HomeScreen(onLogoutClicked = {})
    }
}

// Placeholder data
fun getPlaceholderCollections(): List<Collection> {
    return listOf(
        Collection("1", "Collection 1", "Description 1"),
        Collection("2", "Collection 2", "Description 2"),
        Collection("3", "Collection 3", "Description 3"),
        Collection("4", "Collection 4", "Description 4"),
        Collection("5", "Collection 5", "Description 5"),
        Collection("6", "Collection 6", "Description 6"),
        Collection("7", "Collection 7", "Description 7"),
        Collection("8", "Collection 8", "Description 8"),
        Collection("9", "Collection 9", "Description 9"),
        Collection("10", "Collection 10", "Description 10"),
        Collection("11", "Collection 11", "Description 11"),
        Collection("12", "Collection 12", "Description 12"),
        Collection("13", "Collection 13", "Description 13"),
        Collection("14", "Collection 14", "Description 14"),
        Collection("15", "Collection 15", "Description 15"),
        Collection("16", "Collection 16", "Description 16"),
        Collection("17", "Collection 17", "Description 17"),
        Collection("18", "Collection 18", "Description 18"),
        Collection("19", "Collection 19", "Description 19"),
        Collection("20", "Collection 20", "Description 20"),
        Collection("21", "Collection 21", "Description 21"),
        Collection("22", "Collection 22", "Description 22"),
        Collection("23", "Collection 23", "Description 23"),
        Collection("24", "Collection 24", "Description 24"),
        Collection("25", "Collection 25", "Description 25"),
        Collection("26", "Collection 26", "Description 26"),
        Collection("27", "Collection 27", "Description 27"),
        Collection("28", "Collection 28", "Description 28"),
        Collection("29", "Collection 29", "Description 29"),
        Collection("30", "Collection 30", "Description 30"),
        Collection("31", "Collection 31", "Description 31"),
        Collection("32", "Collection 32", "Description 32"),
        Collection("33", "Collection 33", "Description 33"),
        Collection("34", "Collection 34", "Description 34"),
        Collection("35", "Collection 35", "Description 35"),
        Collection("36", "Collection 36", "Description 36"),
        Collection("37", "Collection 37", "Description 37"),
        Collection("38", "Collection 38", "Description 38"),
        Collection("39", "Collection 39", "Description 39"),
        Collection("40", "Collection 40", "Description 40"),
        Collection("41", "Collection 41", "Description 41"),
        Collection("42", "Collection 42", "Description 42"),
        Collection("43", "Collection 43", "Description 43"),
        Collection("44", "Collection 44", "Description 44"),
        Collection("45", "Collection 45", "Description 45"),
        Collection("46", "Collection 46", "Description 46"),
        Collection("47", "Collection 47", "Description 47"),
        Collection("48", "Collection 48", "Description 48"),
        Collection("49", "Collection 49", "Description 49"),
        Collection("50", "Collection 50", "Description 50"),
        Collection("51", "Collection 51", "Description 51"),
        Collection("52", "Collection 52", "Description 52"),
        Collection("53", "Collection 53", "Description 53"),
        Collection("54", "Collection 54", "Description 54"),
        Collection("55", "Collection 55", "Description 55"),
        Collection("56", "Collection 56", "Description 56"),
        Collection("57", "Collection 57", "Description 57"),
        Collection("58", "Collection 58", "Description 58"),
        Collection("59", "Collection 59", "Description 59"),
        Collection("60", "Collection 60", "Description 60"),
        Collection("61", "Collection 61", "Description 61"),
        Collection("62", "Collection 62", "Description 62"),
        Collection("63", "Collection 63", "Description 63"),
        Collection("64", "Collection 64", "Description 64"),
        Collection("65", "Collection 65", "Description 65"),
        Collection("66", "Collection 66", "Description 66"),
        Collection("67", "Collection 67", "Description 67"),
        Collection("68", "Collection 68", "Description 68"),
        Collection("69", "Collection 69", "Description 69"),
        Collection("70", "Collection 70", "Description 70"),
        Collection("71", "Collection 71", "Description 71"),
        Collection("72", "Collection 72", "Description 72"),
        Collection("73", "Collection 73", "Description 73"),
        Collection("74", "Collection 74", "Description 74"),
        Collection("75", "Collection 75", "Description 75"),
        Collection("76", "Collection 76", "Description 76"),
        Collection("77", "Collection 77", "Description 77"),
        Collection("78", "Collection 78", "Description 78"),
        Collection("79", "Collection 79", "Description 79"),
        Collection("80", "Collection 80", "Description 80"),
        Collection("81", "Collection 81", "Description 81"),
        Collection("82", "Collection 82", "Description 82"),
        Collection("83", "Collection 83", "Description 83"),
        Collection("84", "Collection 84", "Description 84"),
        Collection("85", "Collection 85", "Description 85"),
        Collection("86", "Collection 86", "Description 86"),
        Collection("87", "Collection 87", "Description 87"),
        Collection("88", "Collection 88", "Description 88"),
        Collection("89", "Collection 89", "Description 89"),
        Collection("90", "Collection 90", "Description 90"),
        Collection("91", "Collection 91", "Description 91"),
        Collection("92", "Collection 92", "Description 92"),
        Collection("93", "Collection 93", "Description 93"),
        Collection("94", "Collection 94", "Description 94"),
        Collection("95", "Collection 95", "Description 95"),
        Collection("96", "Collection 96", "Description 96"),
        Collection("97", "Collection 97", "Description 97"),
        Collection("98", "Collection 98", "Description 98"),
        Collection("99", "Collection 99", "Description 99"),
        Collection("100", "Collection 100", "Description 100"),
    )

}