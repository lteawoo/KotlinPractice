package kr.taeu.kotlin.kotlinlang.collections

fun main() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    // To access a value in a map, use the indexed access operator [] with its key
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    // to add items to a mutable map
    juiceMenu.put("coconut", 150)
    juiceMenu["dragonFruit"] = 200
    println(juiceMenu)

    // to remove items use the .remove() function
    juiceMenu.remove("dragonFruit")
    println(juiceMenu)
}