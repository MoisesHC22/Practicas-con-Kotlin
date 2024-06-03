package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var arreglo = intArrayOf(1,2,3,4,56,7,8)

    arreglo.sort()
    println(arreglo.contentToString())

    var duplicados = intArrayOf(2,2,2,5,3,6,7,8,9,3,0)

    // Muestra los números que más se repiten
    var duplicado = duplicados.groupBy { it }.filter { it.value.size > 1 }.keys
    println(duplicado)

}