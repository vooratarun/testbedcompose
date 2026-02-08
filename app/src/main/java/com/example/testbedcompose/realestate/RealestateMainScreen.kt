package com.example.testbedcompose.realestate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.testbedcompose.R


@Composable
fun RealestateMainScreen() {

    val property = Property(
        type = "Apartment",
        title = "Luxury Apartment",
        address = "123 Main St, Anytown, USA",
        pickPath = "pic_1",
        price = 250000,
        bed = 2,
        bath = 2,
        size = 1200,
        isGarage = true,
        score = 4.5,
        description = "A beautiful and spacious luxury apartment in the heart of the city."
    )
    val navController = rememberNavController()
    val backStack by navController.currentBackStackEntryAsState()
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .statusBarsPadding()
            .background(colorResource( R.color.lightGrey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item{ HeaderSection()}
        item { SearchRow() }
        item { Spacer(Modifier.height(16.dp)) }
        item { Categories() }
        item{ PropertyCard(property)}
        item{ PropertyCard(property)}
        item{ PropertyCard(property)}
        item{ BottomBar(navController,
            modifier = Modifier
                 .navigationBarsPadding()
                 .padding(16.dp))
        }

    }
}
