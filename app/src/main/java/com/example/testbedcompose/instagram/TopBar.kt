package com.example.testbedcompose.instagram

import android.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testbedcompose.R


@Composable
fun TopAppbar(){
    //

    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ){

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = "philiplanker_official",
            color = androidx.compose.ui.graphics.Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = "HOme",
            tint = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier.size(24.dp)
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_moon),
            contentDescription = "dot menu",
            tint = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier.size(24.dp)
        )


    }
}