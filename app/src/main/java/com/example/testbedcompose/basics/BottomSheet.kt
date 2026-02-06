package com.example.testbedcompose.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetExample() {


//    var showBottomSheet by remember {
//        mutableStateOf(false)
//    }
//

    // alternative woys to write this

    val showBottomSheet = remember {
        mutableStateOf(false)
    }


    var state by remember { mutableStateOf(false) }
    state = true

    var sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )


    Column(
        modifier = Modifier.fillMaxWidth()
            .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Button(
            onClick = {
                showBottomSheet.value = true
            }
        ) {
            Text(text = "Open Bottom Sheet")
        }

        if(showBottomSheet.value) {
            ModalBottomSheet(
                modifier = Modifier.fillMaxWidth(),
                sheetState = sheetState,
                onDismissRequest = {
                    showBottomSheet.value = false
                }
            ) {

//                Text( text = "This is the bottom sheet, swipe up for the open and down for close",
//                    modifier = Modifier.background(Color.Green)
//                )

//                LazyColumnExample()

                LazyColumn {
                    items(100) { index->
                        Text("Item $index in LazyColumn",
                            modifier = Modifier.fillMaxSize()
                                .padding(20.dp)
                                .background(Color.Red)
                                .padding(30.dp),
                            fontStyle = FontStyle.Normal,
                            color = Color.White
                        )
                    }
                    }
                }
            }
        }
    }

