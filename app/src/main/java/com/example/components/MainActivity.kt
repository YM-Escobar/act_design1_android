package com.example.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.components.ui.screen.Dashboard
import com.example.components.ui.screen.Login
import com.example.components.ui.theme.ComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentsTheme {
                Login()
                Dashboard()
            }
            }
        }
}



