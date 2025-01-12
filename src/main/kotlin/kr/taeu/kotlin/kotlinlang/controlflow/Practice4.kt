package kr.taeu.kotlin.kotlinlang.controlflow

fun main() {
    var pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's a only $pizzaSlices slices/s of pizza :(")
    } while (pizzaSlices < 7)
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Horray! We have a whole pizza")
}