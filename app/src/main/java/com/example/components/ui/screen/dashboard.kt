package com.example.components.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.components.ui.section.dashboard.Actions_dashboard
import com.example.components.ui.section.dashboard.Dashboard_header
import com.example.components.ui.section.dashboard.Dashboard_information
import com.example.components.ui.section.dashboard.Footer_dashboard
import com.example.components.ui.section.dashboard.Title1


@Preview(showSystemUi = true)
@Composable
fun Dashboard(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Dashboard_header()
            Title1()
            Dashboard_information()
            Actions_dashboard()
            Footer_dashboard()
        }

    }
}