package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var arreglo = arrayOf("Luis", "Marco", 4, 5.6, true)

    println(arreglo.contentToString())

    var arregloNumerico = intArrayOf(1,2,3,4,5,6)
    var arregloDouble = doubleArrayOf(4.5,6.7,10.9)
    var arregloBooleanos = booleanArrayOf(true, false, true)

    println( arreglo[0].toString().plus("--> Valor: ").plus( arregloDouble[2]))
    arreglo[3] = "Jose Armando Perez"
    println(arreglo.contentToString())

    arreglo+="Juan"
    println(arreglo.contentToString())

}