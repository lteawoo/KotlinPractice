package kr.taeu.kotlin.kotlinlang.controlflow

fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2
    println(if (a > b) a else b)
}