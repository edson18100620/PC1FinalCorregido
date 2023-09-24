package com.algarrobo.pc1corregidamg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btncalcular: Button = findViewById(R.id.btncalcular)
        btncalcular.setOnClickListener {
            val edtparcial: EditText = findViewById(R.id.edtparcial)
            val edtfinal: EditText = findViewById(R.id.edtfinal)
            val edtpep: EditText = findViewById(R.id.edtpep)

            val notparcial = edtparcial.text.toString().toDouble()
            val notfinal = edtfinal.text.toString().toDouble()
            val notpep = edtpep.text.toString().toDouble()

            val promedio = (notparcial*0.2)+(notfinal*0.2)+(notpep*0.6)
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("promedio",promedio)
            startActivity(intent)
        }
    }



}