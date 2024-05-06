package com.example.emulador_20230113_rony


import android.content.Context
import android.widget.Toast
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Correo {


    fun mostrarCorreo(context: Context) {

        val correo = "20230113@ricaldone.edu.sv"
        Toast.makeText(context, "Correo electrónico del estudiante: $correo", Toast.LENGTH_SHORT)
            .show()



        class ContactanosActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.fragment_contactanos)


                val button = findViewById<Button>(R.id.imprimir)


                button.setOnClickListener {

                    val correo = Correo()

                    correo.mostrarCorreo(this)
                }
            }
        }
    }
}