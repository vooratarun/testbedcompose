package com.example.testbedcompose.instagram

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun ButtonSection() {
    // Implementation goes here

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ){

        ActionButton(text = "Following", modifier = Modifier, icon = androidx.compose.material.icons.Icons.Default.ArrowDropDown)
        ActionButton(text = "Message")
        ActionButton(text = "Email")
        ActionButton(icon = androidx.compose.material.icons.Icons.Default.ArrowDropDown)

    }
}


@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: ImageVector? = null
){

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
        modifier = modifier.border(
                    width = 1.dp,
                    color = LightGray,
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(10.dp)
                ).padding(10.dp)
    ){

        if (text != null){
            Text(text,
                fontWeight = FontWeight.SemiBold)
        }
        if (icon != null){
            Icon(imageVector = icon, contentDescription = null, tint = Color.Black)
        }
    }


}