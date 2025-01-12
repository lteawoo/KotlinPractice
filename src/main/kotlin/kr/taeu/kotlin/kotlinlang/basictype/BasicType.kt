package kr.taeu.kotlin.kotlinlang.basictype

fun main() {
    // Variable declared without initialization
    val d: Int
    // Variable initialized
    d = 3

    // Variable Explicitly typed and initialized
    val e: String = "Hello"

    // Variables can be read because they have been initialized
    println(d)
    println(e)

    // Variable declared without initialization
//    val d: Int

    // Triggers an error
//    println(d)
    // Variable 'd' must be initialized
}