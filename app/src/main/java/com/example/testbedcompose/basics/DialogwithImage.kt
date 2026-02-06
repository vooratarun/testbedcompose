package com.example.testbedcompose.basics

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog


@SuppressLint("SuspiciousIndentation")
@Composable
fun DialogWithImage() {
    // Implementation goes here
    val context  = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }

    Button(onClick = { showDialog = true }) {
        Text("Open Dialog")
    }

    if(showDialog)
    Dialog(
        onDismissRequest = {
                showDialog = false
        }
    ) {
        Card {
            Image(
                painter = androidx.compose.ui.res.painterResource(id = com.example.testbedcompose.R.drawable.news),
                contentDescription = "this is dialog image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            )

            Text(
                text = "this is the dialog"
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                TextButton(
                    onClick = {
                        showDialog = false
                        Toast.makeText(context, "Clcked OK", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text(text = "OK")
                }


                TextButton(
                    onClick = {
                        showDialog = false
                        Toast.makeText(context, "Clicked Dismiss", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text("Dismiss")
                }
            }
        }
    }
}