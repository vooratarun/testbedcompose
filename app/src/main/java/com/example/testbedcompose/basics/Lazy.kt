package com.example.testbedcompose.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnExample(){

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Green),
        verticalArrangement = Arrangement.Center
    ) {

        Text("LazyColumn (prefered for the lists",
            modifier = Modifier.padding(10.dp)
                .background(Color.Yellow)
                .padding(20.dp),
        )

        LazyColumn(

            modifier = Modifier.fillMaxSize()
                .background(Color.LightGray)
        ) {

            items(100) { index->
                Text("Item $index in LazyColumn",
                    modifier = Modifier.fillMaxSize()
                        .padding(20.dp)
                        .background(Color.Red)
                        .padding(30.dp),
                    fontStyle = FontStyle.Normal,
                    color = Color.White
                )

            }

        }

    }
}

@Composable
fun LazyRowExample(){
    Column (
        modifier = Modifier.fillMaxSize()
            .background(Color.Green),
        verticalArrangement = Arrangement.Center
    ){
        LazyRow {
            items(100){
                index->
                Text("Item $index in LazyRow",
                    modifier = Modifier.padding(20.dp)
                        .background(Color.Red)
                        .padding(30.dp),
                    fontStyle = FontStyle.Normal,
                    color = Color.White
                )
            }
        }
    }


}