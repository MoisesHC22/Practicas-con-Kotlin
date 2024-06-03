package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try{
        println("Ingresa un valor: ")
        var numero = readln().toInt()

        println("Ingresa un segundo valor: ")
        var numero2 = readln().toInt()

        val resultado = numero + numero2
        println(resultado)

    }catch (e: NumberFormatException){
        var excepcion = e
        println("Error: Escribe un valor numerico valido:  $e")
    }
}