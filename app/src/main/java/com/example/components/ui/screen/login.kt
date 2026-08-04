package com.example.components.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.components.ui.section.login.Actions
import com.example.components.ui.section.login.Footer
import com.example.components.ui.section.login.Header
import com.example.components.ui.section.login.Image_people
import com.example.components.ui.section.login.Personal_information

@Preview(showSystemUi = true)
@Composable
fun Login(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Center
        ) {

            Header()
            Image_people()
            Personal_information()
            Actions()
            Footer()


        }

    }
}





