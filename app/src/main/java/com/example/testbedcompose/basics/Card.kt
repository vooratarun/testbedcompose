package com.example.testbedcompose.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ElevatedCardExample(){


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        ElevatedCard (
            elevation = androidx.compose.material3.CardDefaults.cardElevation(
                10.dp
            ),
            modifier = Modifier.background(Color.Green)
        ){

            Text("this is the elevated card", modifier = Modifier.padding(10.dp))

        }
    }
}