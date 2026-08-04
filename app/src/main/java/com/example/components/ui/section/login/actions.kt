package com.example.components.ui.section.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Actions(){
    Box{
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                modifier = Modifier.background(Color.Gray).clip(RoundedCornerShape(10.dp)),
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Blue)

            ){
                Text(
                    text = "Editar"
                )
            }
            Button(
                modifier = Modifier.background(Color.Gray).clip(RoundedCornerShape(10.dp)),
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(
                    text = "Guardar"
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(40.dp))
}