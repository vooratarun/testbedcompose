package com.example.testbedcompose.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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


@Composable
fun  ColumnExample(){


    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(25.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ) {

        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }
}

@Composable
fun ColumnBoxExample(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(30.dp),

        contentAlignment = Alignment.BottomEnd
    ) {

        Column(
            modifier = Modifier.background(Color.Red).padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Text("text 1")
            Text("text 2")
            Text("text 3")
            Text("text 4")
            Text("text 5")
        }
    }
}

@Composable
fun BoxExample() {
    Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .size(150.dp)
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ) {

                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Cyan),
                    contentAlignment = Alignment.Center
                ) {

                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(Color.Magenta)
                    ){
                        Text("Inner Box", color = Color.Black, fontSize = 5.sp, modifier = Modifier.align(Alignment.Center))
                    }

                }

            }

        }
}

@Composable
fun RowExample() {

}