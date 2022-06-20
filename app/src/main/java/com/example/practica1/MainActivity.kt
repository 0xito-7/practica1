package com.example.practica1

//enlazar elementos de la vista
import android.app.Activity
import android.os.Bundle
import com.example.practica1.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //asignando un valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}