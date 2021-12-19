package com.example.wintercrabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun Siguiente(view: android.view.View) {
        val etUsuario = findViewById<TextView>(R.id.etUsuario)
        val etContrasena = findViewById<TextView>(R.id.etContrasena)
        if(etUsuario.text.isNotEmpty()){
            if(etContrasena.text.isNotEmpty()){
                val intent = Intent(this,ActivityMenu::class.java)
                startActivity(intent)
            }
        }
    }
}