package kr.taeu.kotlin.kotlinlang.collections

// You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(18, 2)

    println(greenNumbers.count() + redNumbers.count())
}