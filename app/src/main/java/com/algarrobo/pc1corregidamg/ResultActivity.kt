package com.algarrobo.pc1corregidamg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val promedio = intent.getDoubleExtra("promedio",0.0)
        val tvnotfin = findViewById<TextView>(R.id.tvnotfin)
        tvnotfin.text= promedio.toString()
        val resultado = if (promedio > 10.5) "Aprobado" else "Desaprobado"
        val tvresul = findViewById<TextView>(R.id.tvresul)
        tvresul.text= resultado





    }
}