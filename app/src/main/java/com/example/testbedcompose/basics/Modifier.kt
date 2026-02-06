package com.example.testbedcompose.basics

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// Modifiers

// Modifiers are available in all the composables like text, button, image, column etc.

@Composable
fun ModifierExample() {


    Box(
        modifier = Modifier
            .size(200.dp)
            .background(

                color = Color.Blue,
            ),
        contentAlignment = Alignment.Center

    ) {

        Text(
            "this is the jetpack",
            modifier = Modifier.background(Color.Yellow)
        )
    }
}



@Composable
fun BoxExampleNew() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
    ) {

        Row(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Cyan)
                .align(Alignment.BottomEnd),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("this is the jetpack ", fontSize = 10.sp, modifier = Modifier.background(Color.White))
            Text(" Compose", fontSize = 20.sp)
        }

        Row(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Red)
                .align(Alignment.BottomStart),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("this is the jetpack")
            Text("this is the jetpack")
        }

        Row(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Red)
                .align(Alignment.TopStart),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("this is the jetpack")
            Text("this is the jetpack")
        }

        Column(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Red)
                .align(Alignment.TopEnd),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("this is the jetpack",
                modifier = Modifier.background(Color.White)
                    .padding(10.dp)
            )
            Text("this is the jetpack",
                modifier = Modifier.background(Color.Green)
                    .padding(10.dp))
        }
    }
}