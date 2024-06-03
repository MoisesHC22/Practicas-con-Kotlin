package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*Kotlin utiliza valores Int, Double, String, Float*/

    // Constantes
    val nombre = "Hola mundo"
    val mensaje = "Con kotlin"
    val edad = 21

    //Concatenacion de las constantes
    val resultado = nombre.plus(mensaje).plus(" ").plus(edad)
    println("Iniciando con Kotlin: $resultado")

}