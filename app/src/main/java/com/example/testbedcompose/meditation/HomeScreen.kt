package com.example.testbedcompose.meditation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.testbedcompose.ui.theme.DeepBlue


@Composable
fun HomeScreen() {
    // Implementation goes here

    Box(
      modifier = Modifier.fillMaxSize()
          .background(DeepBlue)
    ){
        Column {
            GreetingSection()
            ChipSection(listOf("Sweet sleep", "Insomnia", "Depression", "Baby sleep", "Anxiety"))
            CurrentMeditation()
            BottomMenu()
            FeaturedSection()
        }
    }
}