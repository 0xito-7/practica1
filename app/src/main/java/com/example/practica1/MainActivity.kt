package com.example.practica1

//enlazar elementos de la vista
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.practica1.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //asignando un valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton3.setOnClickListener {
           Toast.makeText(this,"Respoder",Toast.LENGTH_SHORT).show()

        }

        binding.imageButton4.setOnClickListener {//accion clic al botón
            Toast.makeText(this,"Ingnorar",Toast.LENGTH_SHORT).show() //mensaje
            System.exit(0) //cerrar la aplicacion
        }





    }
}