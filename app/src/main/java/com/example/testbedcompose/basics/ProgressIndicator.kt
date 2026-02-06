package com.example.testbedcompose.basics

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay


@Composable
fun ProgressIndicatorExample(){
    // Implementation goes here

    var loading by remember { mutableStateOf(false) }

//    LaunchedEffect(loading) {
//        if(loading){
//            delay(3000)
//            loading = false
//        }
//    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(
            onClick = {loading = true},
            enabled = !loading

        ) {
            Text("Start loading")
        }

        Button(
            onClick = {loading = false},
            enabled = loading
        ) {
            Text("Stop loading")
        }

        Spacer(modifier = Modifier.height(15.dp))
        if(loading) {
            CircularProgressIndicator(
                modifier = Modifier.height(64.dp),
                color = MaterialTheme.colorScheme.secondary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )
        }

    }
}