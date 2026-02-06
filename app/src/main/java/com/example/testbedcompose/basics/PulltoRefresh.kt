package com.example.testbedcompose.basics

import android.annotation.SuppressLint
import android.graphics.Movie
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.material3.pulltorefresh.pullToRefreshIndicator
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun PullToRefreshExample(){
    // Implementation goes here

    val scope = rememberCoroutineScope();
    var isRefreshing by remember { mutableStateOf(false) }
    var items by remember { mutableStateOf(List(20) { "Item #$it" }.toMutableList()) }

    fun refreshItems(){
        scope.launch {
            isRefreshing = true
            delay(2000)
            items = List(20) { "Item #${(0..100).random()}" }.toMutableList() // simulate data change
            isRefreshing = false
        }
    }

    PullToRefreshIndicatorExample(
        items = items,
        isRefreshing = isRefreshing,
        onRefresh = { refreshItems() },
        modifier = Modifier.fillMaxSize()
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshIndicatorExample(
    items: List<String>,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    modifier: Modifier
){

    val state = rememberPullToRefreshState()

    // Implementation goes here
    PullToRefreshBox(
        isRefreshing = isRefreshing,
        onRefresh = onRefresh,
        modifier = modifier.fillMaxSize(),
        state = state,
        indicator = {
            MyCustomIndicator2(
                state = state,
                isRefreshing = isRefreshing
            )
        },
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){

            LazyColumn(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(items.size){ index ->
                    Text(
                        text = items[index],
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCustomIndicator(
    state: PullToRefreshState,
    isRefreshing: Boolean,
    modifier: Modifier = Modifier
){
    // Implementation of custom indicator goes here
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ){
        if(isRefreshing){
            Text(text = "Refreshing...")
        } else {
            Text(text = "Pull to refresh")
        }
    }
}

@SuppressLint("UnusedCrossfadeTargetStateParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCustomIndicator2(
    state: PullToRefreshState,
    isRefreshing: Boolean,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier.pullToRefreshIndicator(
        state = state,
        isRefreshing   = isRefreshing,
        containerColor = PullToRefreshDefaults.containerColor,
        threshold = PullToRefreshDefaults.PositionalThreshold

    ),
        contentAlignment = Alignment.Center
    ){
        // Custom indicator implementation
        Crossfade(
            targetState = isRefreshing,
            animationSpec = tween(durationMillis = 1000),
            modifier = Modifier.align(Alignment.Center)
        ) { refreshing ->
            if (refreshing) {
                CircularProgressIndicator(Modifier.size(20.dp))
            }
        }
    }
}