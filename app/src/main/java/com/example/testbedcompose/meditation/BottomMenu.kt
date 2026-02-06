package com.example.testbedcompose.meditation

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.R
import com.example.testbedcompose.ui.theme.AquaBlue
import com.example.testbedcompose.ui.theme.ButtonBlue
import com.example.testbedcompose.ui.theme.DeepBlue
import com.example.testbedcompose.ui.theme.TextWhite
import com.plcoding.meditationuiyoutube.BottomMenuContent


@Composable
fun BottomMenu() {

    val items = listOf(
        BottomMenuContent("Home", R.drawable.ic_home),
        BottomMenuContent("Meditate", R.drawable.ic_home),
        BottomMenuContent("Sleep", R.drawable.ic_home),
        BottomMenuContent("Music", R.drawable.ic_music),
        BottomMenuContent("Profile", R.drawable.ic_profile)
    )

    var selectedItemIndex by remember {
        mutableStateOf(0)
    }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(DeepBlue)
            .padding(15.dp)
    ){
        items.forEachIndexed { index,item->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = ButtonBlue,
                activeTextColor = TextWhite,
                inactiveTextColor = AquaBlue
            ) {
                selectedItemIndex = index
            }
        }
    }

}

@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean,
    activeHighlightColor: androidx.compose.ui.graphics.Color = ButtonBlue,
    activeTextColor: androidx.compose.ui.graphics.Color = TextWhite,
    inactiveTextColor: androidx.compose.ui.graphics.Color = AquaBlue,
    onItemClick: (BottomMenuContent) -> Unit
){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
                    onItemClick(item)
            }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(
                    color = if (isSelected) activeHighlightColor else androidx.compose.ui.graphics.Color.Transparent,
                ).padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(20.dp)
            )

        }
        Text(
            text = item.title,
            color = if(isSelected) activeTextColor else inactiveTextColor
        )
    }

}