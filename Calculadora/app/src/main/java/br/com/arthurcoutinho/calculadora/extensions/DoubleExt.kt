package br.com.arthurcoutinho.calculadora.extensions

fun Double.format(digits: Int) =
    java.lang.String.format("%.${digits}f", this)