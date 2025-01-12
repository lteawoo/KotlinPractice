package kr.taeu.kotlin.kotlinlang.controlflow

fun main() {
    for (i in 1..100) {
        println(
            if (i % 3 == 0 && i % 5 == 0) "fizzbuzz"
            else if (i % 3 == 0) "fizz"
            else if (i % 5 == 0) "buzz"
            else i
        )
//        println(
//            when {
//                i % 15 == 0 -> "fizzbuzz"
//                i % 3 == 0 -> "fizz"
//                i % 5 == 0 -> "buzz"
//                else -> i
//            }
//        )
    }
}