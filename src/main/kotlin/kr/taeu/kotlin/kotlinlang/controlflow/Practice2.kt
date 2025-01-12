package kr.taeu.kotlin.kotlinlang.controlflow

fun main() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "y" -> "Nothing"
            else -> "Other"
        }
    )
}