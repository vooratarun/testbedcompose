package com.example.testbedcompose.instagram

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    // Implementation goes here

    Column() {
        TopAppbar()
        ProfileSection()
        ProfileDescription(
            name = "Philipp Lanker",
            description = "Android Developer, Blogger, and Tech Enthusiast. Sharing my journey in the world of Android development and technology.",
            link = "www.philiplanker.com",
            followedBy = listOf("john_doe", "jane_smith"),
            otherCount = 5
        )
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection()
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection()
        Spacer(modifier = Modifier.height(25.dp))
        PostSection()


    }
}