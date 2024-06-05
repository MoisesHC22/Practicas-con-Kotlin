package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Las listas son más rapidas

    val lista = listOf("Azul","Rojo","Verde")
    println(lista)

    println("posicion:" + lista[0])

    println("----------------------------------------------------------------------------- ")

    //Lista mutable es aquella que puede ser modificado

    val listaM = mutableListOf(1,2,3,4,5,6,7)
    listaM.add(10)
    println("Valor agregado: -->" + listaM)

    println("-----------------------------------------------------------------------------")
    //Remover un elemento

    listaM.remove(7)
    println("Valor eliminado: -->" + listaM)

    println("-----------------------------------------------------------------------------")
    //Arreglo a lista muteable

    var arregloNumerico = intArrayOf(1,2,3,4,5,6)

    val arr = arregloNumerico.toMutableList()
    arr.remove(3)
    println("Eliminado: -->" + arr)
}