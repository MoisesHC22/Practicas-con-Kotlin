package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  /*
    var acumulador  = 1
    while (acumulador <= 10)
    {
        println(acumulador)
        acumulador = acumulador + 2
    }
  */

    var n1: Double
    var n2: Double
    val resultado: Double

    while(true) {
        try {
            println("Ingresa un valor: ")
            n1 = readln().toDouble()

            println("Ingresa el segundo valor")
            n2 = readln().toDouble()

            break

        } catch (e: NumberFormatException)
        {
            var excepcion = e
            println("Error: Escribe un valor numerico valido: $excepcion")
        }
    }

    resultado = n1 + n2

    println("El resultado es: $resultado")
}
