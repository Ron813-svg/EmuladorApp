package com.example.emulador_20230113_rony.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.emulador_20230113_rony.R

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dashboard)

        val mostrarNombreBtn: Button = findViewById(R.id.mostrarNombreBtn)

        mostrarNombreBtn.setOnClickListener {

            val nombreEstudiante = "Rony Javier Ramirez"
            Toast.makeText(this, "Nombre del estudiante: $nombreEstudiante", Toast.LENGTH_SHORT)
                .show()
        }
    }
}

