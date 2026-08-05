package com.example.components.ui.component.dashboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Info_dashboard(info1: String, info2: String){
    Box(
        modifier = Modifier
    ){
        Column{
            Text(
                text = info1
            )
            Text(
                text = info2
            )
        }
    }

    Spacer(modifier = Modifier.height(20.dp))
}