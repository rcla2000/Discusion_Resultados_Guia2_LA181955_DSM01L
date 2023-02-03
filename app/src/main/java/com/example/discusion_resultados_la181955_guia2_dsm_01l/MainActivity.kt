package com.example.discusion_resultados_la181955_guia2_dsm_01l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtNumero1 : EditText
    private lateinit var txtNumero2 : EditText
    private lateinit var btnSumar : Button
    private lateinit var txtResultado : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumero1 = findViewById<EditText>(R.id.txtNumero1)
        txtNumero2 = findViewById<EditText>(R.id.txtNumero2)
        btnSumar = findViewById<Button>(R.id.btnSumar)
        txtResultado = findViewById<TextView>(R.id.txtResultado)
        var suma : Float = 0F

        btnSumar.setOnClickListener {
            if (txtNumero1.text.toString().isEmpty() || txtNumero2.text.toString().isEmpty()) {
                Toast.makeText(this, "Debe ingresar ambos números para realizar la suma.", Toast.LENGTH_SHORT).show()
            } else {
                suma = this.sumar(txtNumero1.text.toString().trim(), txtNumero2.text.toString().trim())
                txtResultado.text = "RESULTADO: " + suma.toString()
            }
        }
    }

    private fun sumar(num1 : String, num2 : String) : Float {
        var resultado : Float
        resultado = num1.toFloat() + num2.toFloat()
        return resultado
    }
}