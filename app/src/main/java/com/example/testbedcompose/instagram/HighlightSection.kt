package com.example.testbedcompose.instagram

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.R


@Composable
fun HighlightSection(){
    // Implementation goes here

    val highlights = listOf(
        ImageWithText(
            image = painterResource(id = R.drawable.ic_moon),
            text = "YouTube"
        ),
        ImageWithText(
            image = painterResource(id = R.drawable.ic_home),
            text = "Q&A"
        ),
        ImageWithText(
            image = painterResource(id = R.drawable.ic_music),
            text = "Discord"
        ),
        ImageWithText(
            image = painterResource(id = R.drawable.ic_profile),
            text = "Telegram"
        ),
    )

    LazyRow {
        items(highlights.size) { index ->
            RoundImageWithText(
                image = highlights[index].image,
                text = highlights[index].text
            )
        }
    }

}

@Composable
fun RoundImageWithText(image: Painter, text: String) {

    Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ){
        RoundImage(
            image = image,
            modifier = Modifier.padding(10.dp).size(70.dp)
        )
        Text(text = text)
    }

}