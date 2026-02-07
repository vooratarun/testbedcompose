package com.example.testbedcompose.instagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.R


@Composable
fun PostSection(
    modifier: Modifier = Modifier
){

   val posts = listOf(
        painterResource(id = R.drawable.news),
        painterResource(id = R.drawable.news),
        painterResource(id = R.drawable.news),
        painterResource(id = R.drawable.news),
        painterResource(id = R.drawable.news),
        painterResource(id = R.drawable.news),
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier.scale(1.0f)
    ) {

        items(posts.size) { index ->
            PostItem(image = posts[index])
        }
    }
}

@Composable
fun PostItem(image: Painter) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.scale(1.0f).
                    aspectRatio(1f)
                    .border(
                        width = 1.dp,
                        color = androidx.compose.ui.graphics.Color.LightGray
                    )
    )
}