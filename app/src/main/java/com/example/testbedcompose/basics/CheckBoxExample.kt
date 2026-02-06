package com.example.testbedcompose.basics


import android.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import kotlin.collections.all
import kotlin.collections.forEachIndexed
import kotlin.collections.indices
import kotlin.collections.none

@Composable
fun CheckBoxExample() {

    val childCheckedStates =  remember {
            mutableStateListOf(false, false, false)
    }
    val parentState = when{
        childCheckedStates.all { it } -> ToggleableState.On
        childCheckedStates.none { it } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Select all")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    for (i in childCheckedStates.indices) {
                        childCheckedStates[i] = newState
                    }
                }
            )
        }

        childCheckedStates.forEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Option ${index + 1}")
                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        childCheckedStates[index] = it
                    }
                )
            }
        }

        if(childCheckedStates.all { it }){
            Text("All options are selected")
        } else if (childCheckedStates.none { it }) {
            Text("No options are selected")
        } else {
            Text("Some options are selected")
        }
    }
}

@Composable
fun CheckboxExampleNew() {

    var checked by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )

        Text(text = "Accept Terms & Conditions")
    }
}



@Composable
fun CheckboxWithTextClick() {

    var checked by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable {
            checked = !checked
        }
    ) {

        Checkbox(
            checked = checked,
            onCheckedChange = null // handled by Row click
        )

        Text(text = "Subscribe to newsletter")
    }
}

@Composable
fun CheckboxwithLazyColumn(){
    val items = listOf(
        "Android",
        "iOS",
        "Web",
        "Backend",
        "DevOps"
    )

    val checkedStates = remember{
        mutableStateMapOf<String,Boolean>().apply {
            items.forEach { this[it] = false }
        }
    }

    val allSelected = checkedStates.values.all { it } // all true
    val noneSelected = checkedStates.values.none { value -> !value } // none true

    Column {
        Row {
            Button(
                onClick = {
                    checkedStates.keys.forEach { key ->
                        checkedStates[key] = true
                    }
                }
            ) {
                Text("Select All")
            }

            Button(
                onClick = {
                    checkedStates.keys.forEach { key ->
                        checkedStates[key] = false
                    }
                }
            ) {
                Text("Clear All")
            }
        }
    }

    Spacer(modifier = Modifier.padding(20.dp))

    LazyColumn {
        items(items.size) { index ->
            val item = items[index]
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {
                    checkedStates[item] = !(checkedStates[item] ?: false)
                }
            ) {
                Checkbox(
                    checked = checkedStates[item] ?: false,
                    onCheckedChange = null
                )
                Text(text = item)
            }
        }
    }

    if(allSelected){
        Text("All options are selected")
    } else if (noneSelected) {
        Text("No options are selected")
    } else {
        Text("Some options are selected ${checkedStates.count { it.value }} out of ${checkedStates.size}")
    }
}
