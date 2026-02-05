package com.example.testbedcompose.basics

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
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
            modifier = Modifier
                .background(Color.Red)
                .padding(25.dp),
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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(15.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .background(Color.Green)
                .padding(15.dp)
            ,   horizontalArrangement = Arrangement.Center,
        ) {
            Text("text 1 ", fontSize = 13.sp, color = Color.DarkGray, fontFamily = FontFamily.Monospace)
            Text("text 2 ")
            Text("text 3 ")
            Text("text 4 ")
            Text("text 5 ")
        }
    }
}

@Composable
fun NestedRowExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("text 1 ")
        Text("text 2 ")

        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .padding(25.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Nested text 1 ")
                Text("Nested text 2 ")
                Text("Nested text 3 ")
            }
        }

        Text("text 3 ")
        Text("text 4 ")
        Text("text 5 ")
    }
}

@Composable
fun ProfileRowExample(){

    Row(
        modifier = Modifier.padding(20.dp)
        , verticalAlignment = Alignment.CenterVertically
    ){
        Text("👤", fontSize = 40.sp)
        Column (
            modifier = Modifier.padding(12.dp)
        ){
            Text("Tarun Voora", fontSize = 18.sp)
            Text("Android Developer", fontSize = 14.sp)
        }
    }
}

@Composable
fun DashboardExample(){
   Column(
         modifier = Modifier.fillMaxSize()
             .background(Color.LightGray)
             .padding(16.dp)
   ){
       Text("Dashboard", fontSize = 30.sp, modifier = Modifier.padding(30.dp))
       Row(
           modifier = Modifier
               .fillMaxWidth()
               .padding(top= 20.dp)
               .background(Color.Magenta),
           horizontalArrangement = Arrangement.SpaceEvenly

       ){
           Text("orders", fontSize = 20.sp, modifier = Modifier.background(Color.Green).padding(10.dp))
           Text("Payments", fontSize = 20.sp)
           Text("Settings", fontSize = 20.sp)
       }
   }
}



@Composable
fun UserCard(){
    val context = LocalContext.current

    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
            .background(Color.Green)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text("👤", fontSize = 40.sp)

        Column(modifier = Modifier.weight(1f).padding(12.dp)) {
            Text("Tarun Voora", fontSize = 18.sp)
            Text("Android Developer", fontSize = 14.sp)

        }

        Button(
            onClick = {
                Toast.makeText(context, "Followed", Toast.LENGTH_SHORT).show();
            },
            modifier = Modifier.background(Color.Blue)
        ) {
            Text("Follow", color = Color.White)
        }

    }
}