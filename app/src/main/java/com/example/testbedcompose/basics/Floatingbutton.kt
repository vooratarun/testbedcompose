package com.example.testbedcompose.basics

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun FloatingButton(){
    // Implementation goes here

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){

        ExtendedFloatingActionButton(
            onClick = {

            },

            content = {
              Box(){
                    Text("+")
              }
            }
        )

    }

}