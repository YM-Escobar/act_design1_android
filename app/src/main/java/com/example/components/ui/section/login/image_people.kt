package com.example.components.ui.section.login




import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.components.R


@Composable
fun Image_people(){
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Image(
            modifier = Modifier.width(300.dp).height(300.dp),
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = ""
        )
    }
    Spacer(
        modifier = Modifier.height(40.dp)
    )
}