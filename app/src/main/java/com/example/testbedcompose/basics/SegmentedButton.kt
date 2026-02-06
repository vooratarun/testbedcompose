package com.example.testbedcompose.basics

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun SegmentedbuttonEx(){

    val selectedOptions = remember {
        mutableStateListOf(false, false, false)
    }
    val options = listOf("Walk", "Ride", "Drive")

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        MultiChoiceSegmentedButtonRow{
            options.forEachIndexed { index,label->
                SegmentedButton(
                    checked = selectedOptions[index],
                    onCheckedChange = {
                        selectedOptions[index] = !selectedOptions[index]
                    },
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),
                    label = {
                        when(label) {
                            "Walk" -> Icon(Icons.Default.AddCircle,
                                contentDescription = "Direction Walk")
                            "Ride" -> Icon(Icons.Default.AccountBox,
                                contentDescription = "Direction Walk")
                            "Drive" -> Icon(Icons.Default.AccountCircle,
                                contentDescription = "Direction Walk")

                        }
                    }
                )
            }

        }
    }

}


