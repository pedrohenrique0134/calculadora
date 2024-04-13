package com.app.calculadora

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val valor1 = binding.valor1
        val valor2 = binding.valor2

        val somar = binding.somar
        val subtrair = binding.subtrair
        val multiplicar = binding.multiplicar
        val dividir = binding.dividir

        var numero = 2

        somar.setOnClickListener {
        if ( verificar(binding.valor1, binding.valor2)){
           toast("digite um numero")
        }else{
            somar(Elements(binding.valor1.text.toString().toFloat(), binding.valor2.text.toString().toFloat())).let {
                binding.resultado.text = "Resultado: $it"
            }
        }
        }

        subtrair.setOnClickListener {
            if (verificar(binding.valor1, binding.valor2)){
                toast("digite um numero")
            }else{
                subtrair(Elements(binding.valor1.text.toString().toFloat(), binding.valor2.text.toString().toFloat())).let {
                    binding.resultado.text = "Resultado: $it"

                }
            }

        }
        multiplicar.setOnClickListener {
            if (verificar(binding.valor1, binding.valor2)){
                toast("digite um numero")
            }else{
                multiplicar(Elements(binding.valor1.text.toString().toFloat(), binding.valor2.text.toString().toFloat())).let {
                    binding.resultado.text = "Resultado: $it"

                }

            }
        }
        dividir.setOnClickListener {
            if (verificar(binding.valor1, binding.valor2)){
                toast("digite um numero")
            }else{
                dividir(Elements(binding.valor1.text.toString().toFloat(), binding.valor2.text.toString().toFloat())).let {
                    binding.resultado.text ="Resultado: $it"
                }

            }
        }
    }
}
