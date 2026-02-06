package com.example.testbedcompose.basics

import androidx.annotation.MenuRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun MenuExample(){
    // Implementation goes here

    var expanded by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {
        Box {
            IconButton(
                onClick = { expanded = !expanded }
            ) {
                Icon(Icons.Default.MoreVert, contentDescription = "this is 3 dot")
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {
                DropdownMenuItem(
                    text = { Text("Profile") },
                    trailingIcon = { Icon(Icons.Outlined.Person, contentDescription = "profile") },
                    onClick = {
                        // do some action here on click
                    }
                )

                HorizontalDivider()
                DropdownMenuItem(
                    text = { Text("Settings") },
                    trailingIcon = { Icon(Icons.Outlined.Person, contentDescription = "settings") },
                    onClick = {
                        // do some action here on click
                    }
                )
            }
        }
    }
}


@Composable
fun BasicDropdownMenuExample(){

    val options = listOf("Low", "Medium", "High")
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(options[0]) }

    Box(
        contentAlignment = Alignment.TopEnd
    ) {
        IconButton(onClick = { expanded = true }) {
            Text(text = selectedOption)
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        selectedOption = option
                        expanded = false
                    }
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExposedDropdownMenuExample() {

    val options = listOf("Android", "iOS", "Web")
    var expanded by remember { mutableStateOf(false) }
    var selected by remember { mutableStateOf(options[0]) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {

        OutlinedTextField(
            value = selected,
            onValueChange = {},
            readOnly = true,
            label = { Text("Platform") },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded)
            },
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    leadingIcon = {Icon(Icons.Default.Settings, contentDescription = null)},
                    onClick = {
                        selected = option
                        expanded = false
                    }
                )
            }
        }
    }
}


