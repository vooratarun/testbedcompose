package com.example.testbedcompose.basics

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope


@Composable
fun NavigationDrawerExample(){
    // Implementation goes here

    var drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Column {
                    Text("Drawer Title")
                    HorizontalDivider()
                    Text("Conten of Drawer")
                }

                NavigationDrawerItem(
                    label = {
                        Text("item 1")

                    },
                    selected = false,
                    onClick = {}
                )

                NavigationDrawerItem(
                    label = {
                        Text("item 2")

                    },
                    selected = false,
                    onClick = {}
                )
            }

        }

    ) {
        Text("this is content of the screen")
    }


}