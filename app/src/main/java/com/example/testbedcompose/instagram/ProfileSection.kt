package com.example.testbedcompose.instagram

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.R


@Composable
fun ProfileSection() {
    // Implementation goes here

    Column(modifier = Modifier.fillMaxWidth()){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {

            RoundImage(
                image =  androidx.compose.ui.res.painterResource(id = R.drawable.news),
                modifier = Modifier
                    .weight(3f)
                    .padding(10.dp)
            )
            Stats(
                modifier = Modifier
            )
        }
    }

}


@Composable
fun Stats(modifier: Modifier) {

        Column(modifier = modifier.padding(10.dp)) {
            Text("150")
            Text("Posts")
        }
        Column(modifier = modifier.padding(10.dp)) {
            Text("150")
            Text("Followers")
        }
        Column(modifier = modifier.padding(10.dp)) {
            Text("150")
            Text("Following")
        }
}


@Composable
fun ProfileDescription(
    name: String,
    description: String,
    link : String,
    followedBy : List<String>,
    otherCount : Int
) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)) {
        Text(text = name)
        Text(text = description)
        Text(text = link)
        if(followedBy.isNotEmpty()){
            Text(
                text = "Followed by ${followedBy.joinToString(", ")}" + if (otherCount > 0) " and $otherCount others" else "",
                color = Color.Gray
            )
        }
    }

}