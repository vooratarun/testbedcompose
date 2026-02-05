package com.example.testbedcompose.basics

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun ButtonExample(){
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text("Filled Button")
    }

    FilledTonalButton(
        onClick = {
            Toast.makeText(context, "Tonal Button is clicked", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text("Tonal Button")
    }

    OutlinedButton(
        onClick = {
            Toast.makeText(context, "Outlined Button is clicked", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text("Outlined Button")
    }


    ElevatedButton(
        onClick = {
            Toast.makeText(context, "Elevated Button is clicked", Toast.LENGTH_SHORT).show()
        }
    ) {
       Text("Elevated Button")
    }


    TextButton(
        onClick = {
            Toast.makeText(context, "Text Button is clicked", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text("Text Button")
    }

}
