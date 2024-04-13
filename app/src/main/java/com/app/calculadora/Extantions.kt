package com.app.calculadora

import android.app.Activity
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

fun somar(elements: Elements):Float{
    var somar = elements.valor1!! + elements.valor2!!
    return somar
}

fun subtrair(elements: Elements):Float{
    var subtrair = elements.valor1!! - elements.valor2!!
    return subtrair
}

fun multiplicar(elements: Elements):Float{
    var multiplicar = elements.valor1!! * elements.valor2!!
    return multiplicar
}

fun dividir(elements: Elements):Float{
    var dividir = elements.valor1!! / elements.valor2!!
    return dividir
}

fun Activity.toast(msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun verificar(valor1: EditText, valor2: EditText):Boolean{
    var verificar:Boolean

    if (valor1.text.toString().isEmpty() || valor2.text.toString().isEmpty()) {
        verificar = true
    }else{
        verificar = false
    }
    return verificar
}