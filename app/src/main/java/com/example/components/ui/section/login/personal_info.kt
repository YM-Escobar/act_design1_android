package com.example.components.ui.section.login

import androidx.compose.runtime.Composable
import com.example.components.ui.component.login.Information


@Composable
fun Personal_information(){
    val information = mapOf(
        "Nombre" to "Ana López",
        "Correo" to "ana.lopez@estudiante.com",
        "Curso" to "Desarrollo Android",
        "Estado" to "Activo"
    )
    information.forEach { (key, value) ->
        Information(key, value)

    }
}