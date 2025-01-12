package kr.taeu.kotlin.kotlinlang.collections

fun main() {

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // create a read-only view
    val shapesLocked: List<String> = shapes // Casting

    // to access an item in a list, use the indexed access operator []
    println("The first item in the list is: ${readOnlyShapes[0]}")

    // To get the first or last
    println("The first item in the list is: ${readOnlyShapes.first()}")

    // To check that an item is in a list, use the in operator
    println("circle" in readOnlyShapes)

    // To add or remove items from a mutable list, use .add() and .remove() functions

    shapes.add("pentagon")
    println(shapes)

    shapes.remove("pentagon")
    println(shapes)
}