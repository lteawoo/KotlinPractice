package kr.taeu.kotlin.kotlinlang.helloworld

// 모든 변수를 val (read-only)를 기본으로 선언하길 추천한다. 필요할때만 var로 선언해라
val popcorn = 5
val hotdog = 7
var customers = 10

fun main() {
    customers = 8 // Variables can be declared outside the main() function
    // hotdog = 8 // val can`t be reassigned
    println(popcorn)
    println(hotdog)
    println(customers)
}