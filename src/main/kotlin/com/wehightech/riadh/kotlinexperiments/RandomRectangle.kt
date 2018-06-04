package com.wehightech.riadh.kotlinexperiments

import java.util.Random

fun main(args: Array<String>) {
    val rectangle = createRandomRectangle()
    println("Obtained rectangle: ${rectangle.height} ${rectangle.width} Is square :: ${rectangle.isSquare}")
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}
fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

