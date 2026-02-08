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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testbedcompose.R


@Composable
fun Categories() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ){
        CategoryItem(R.drawable.cat_1,"House",Modifier.padding(end = 16.dp))
        CategoryItem(R.drawable.cat_2,"Apartment",Modifier.padding(end = 16.dp))
        CategoryItem(R.drawable.cat_3,"Villa",Modifier.padding(end = 16.dp))
        CategoryItem(R.drawable.cat_4,"Banglaw",Modifier.padding(end = 16.dp))
        CategoryItem(R.drawable.cat_5,"Empty Land",Modifier.padding(end = 16.dp))
    }

}

@Composable
fun CategoryItem(
    icon : Int,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .size(45.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(colorResource(R.color.white)),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = androidx.compose.ui.res.painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }
        Spacer(Modifier.height(8.dp))
        Text(
            title,
            color = colorResource(R.color.black),
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }

}