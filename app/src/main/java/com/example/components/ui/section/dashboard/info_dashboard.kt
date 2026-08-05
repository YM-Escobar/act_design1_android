package com.example.components.ui.section.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.components.ui.component.dashboard.Info_dashboard



@Composable
fun Dashboard_information(){
    val information1 = mapOf(
        "12" to "Cursos",
        "85%" to "Progreso",
        "3" to "Logros"
    )
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
    information1.forEach { (key, value) ->
        Info_dashboard(key, value)
    }
    }

    Spacer(modifier = Modifier.height(20.dp))

    val information2 = mapOf(
        "Curso Actual" to "Desarrollo Android con Compose",
        "Próxima Clase" to "Martes,21 de mayo - 10:00 AM",
        "Calificación Actual" to "9.2/10"
    )

    information2.forEach { (key, value) ->
        Info_dashboard(key, value)
    }


}
