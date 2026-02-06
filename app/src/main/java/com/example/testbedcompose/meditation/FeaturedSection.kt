package com.example.testbedcompose.meditation

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testbedcompose.R
import com.example.testbedcompose.ui.theme.Beige1
import com.example.testbedcompose.ui.theme.Beige2
import com.example.testbedcompose.ui.theme.Beige3
import com.example.testbedcompose.ui.theme.BlueViolet1
import com.example.testbedcompose.ui.theme.BlueViolet2
import com.example.testbedcompose.ui.theme.BlueViolet3
import com.example.testbedcompose.ui.theme.ButtonBlue
import com.example.testbedcompose.ui.theme.LightGreen1
import com.example.testbedcompose.ui.theme.LightGreen2
import com.example.testbedcompose.ui.theme.LightGreen3
import com.example.testbedcompose.ui.theme.OrangeYellow1
import com.example.testbedcompose.ui.theme.OrangeYellow2
import com.example.testbedcompose.ui.theme.OrangeYellow3
import com.example.testbedcompose.ui.theme.TextWhite


@Composable
fun FeaturedSection() {

    val context = LocalContext.current

    val features = listOf(
        Feature(
            title = "Sleep meditation",
            R.drawable.ic_headphone,
            BlueViolet1,
            BlueViolet2,
            BlueViolet3
        ),
        Feature(
            title = "Tips for sleeping",
            R.drawable.ic_videocam,
            LightGreen1,
            LightGreen2,
            LightGreen3
        ),
        Feature(
            title = "Night island",
            R.drawable.ic_headphone,
            OrangeYellow1,
            OrangeYellow2,
            OrangeYellow3
        ),
        Feature(
            title = "Calming sounds",
            R.drawable.ic_headphone,
            Beige1,
            Beige2,
            Beige3
        )
    )
    // Implementation goes here
    Column(modifier = Modifier.fillMaxWidth()) {
        Text("Features",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(15.dp),
            color= Color.White
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            items(features.size) {
                FeatureItem(feature = features[it]){
                    Toast.makeText(context, "Clicked on ${features[it].title}", Toast.LENGTH_SHORT).show()
                }

            }

        }

    }
}

@Composable
fun FeatureItem(feature: Feature, OnClick: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(feature.darkColor)
    ){
        Text(text = feature.title,
            style = MaterialTheme.typography.headlineSmall,
            color = Color.White,
            lineHeight = 26.sp,
            modifier = Modifier
                .padding(15.dp)
                .align(Alignment.TopStart)
        )

        Icon(
            painter = painterResource(id = feature.iconId),
            contentDescription = feature.title,
            tint = Color.White,
            modifier = Modifier
                .padding(15.dp)
                .align(Alignment.BottomStart)
        )

        Text(
            text = "Start",
            color = TextWhite,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable {
                    // Handle the click
                    OnClick()
                }
                .padding(15.dp)
                .align(Alignment.BottomEnd)
                .clip(RoundedCornerShape(10.dp))
                .background(ButtonBlue)
                .padding(10.dp)

        )
    }

}