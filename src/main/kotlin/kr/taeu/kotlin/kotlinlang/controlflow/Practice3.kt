package kr.taeu.kotlin.kotlinlang.controlflow

fun main() {
    var pizzaSlices = 0
    while (pizzaSlices++ < 7) {
        println("There's a only $pizzaSlices slices/s of pizza :(")
    }

    println("There are $pizzaSlices slices of pizza. Horray! We have a whole pizza")
}