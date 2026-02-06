package com.example.testbedcompose.basics

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen() {

    val countState = remember { mutableStateOf(0) }

    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Count: $count",
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row {

            Button(onClick = {
                count++
            }) {
                Text("Increment")
            }

            Spacer(modifier = Modifier.width(12.dp))

            Button(onClick = {
                count--
            }) {
                Text("Decrement")
            }
        }
    }
}


