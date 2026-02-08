package com.example.testbedcompose.realestate

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.R


@Composable
fun HeaderSection() {

    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 16.dp,
                vertical = 24.dp)
            .statusBarsPadding(),
        verticalAlignment = Alignment.CenterVertically,
        ){
            Image(
                painter = painterResource(R.drawable.size),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f)
            ) {
                Text(
                    "Welcome",
                    color = Color.Gray
                )
                Text(
                    "Sara Anderson",
                    color = Color.Black
                )
            }

            Image(
                painter = painterResource(R.drawable.bell_icon),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

    }

}