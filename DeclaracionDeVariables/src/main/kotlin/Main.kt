package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*Kotlin utiliza valores Int, Double, String, Float*/

    // Constantes

    /* val nombre = "Hola mundo"
       val mensaje = "Con kotlin"
       val edad = 21

       //Concatenación de las constantes
       val resultado = nombre.plus(mensaje).plus(" ").plus(edad)
       println("Iniciando con Kotlin: $resultado")
    */

    //Variable nunca se modifica
    //Declaración larga
    var variable: String = "Mi primer variable"
    println(variable)

    variable = "Cambie al segundo valor"
    println(variable)

    //Declaración corta
    var nombre = "Juan Perez"
    var edad = 21
    var edadAdulto = 70

    //Concatenación
    println(nombre.plus(" Edad: ").plus(edad))

    nombre = "Miguelito"
    println(nombre.plus( " Edad: ").plus(edadAdulto))
}
