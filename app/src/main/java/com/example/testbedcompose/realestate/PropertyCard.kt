package com.example.testbedcompose.realestate

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.R


@Composable
fun PropertyCard(item: Property) {
    val white = colorResource(R.color.white)
    val blue = colorResource(R.color.blue)
    val black = colorResource(R.color.black)
    val grey = colorResource(R.color.grey)

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(white)
    ) {
        Box(

        ){
            Image(
                painter = painterResource(R.drawable.news
                ), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(white)
                    .height(233.dp)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(30.dp)),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "$${item.price}",
                color = colorResource(R.color.white),
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomStart)
                    .clip(RoundedCornerShape(50.dp))
                    .background(blue, shape = RectangleShape)
                    .padding(horizontal = 12.dp, vertical = 4.dp)
            )
        }

        Column {
            Spacer(Modifier.height(8.dp))
            Text(
                text = item.title,
                color = black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            Text(
                text = item.address,
                color = grey,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )
            Row(){
                MetaChip()
                MetaChip()
                MetaChip()
            }
        }

    }

}

@Composable
fun MetaChip(){
    Row(
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(colorResource(R.color.white)),
        verticalAlignment = Alignment.CenterVertically
    ){

            Image(
                painter = painterResource(R.drawable.bed),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text("3 Beds", color = colorResource(R.color.black))
    }
}