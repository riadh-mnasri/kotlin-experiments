package com.wehightech.riadh.kotlinexperiments

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Mnasri"),
        Person("Riadh", age = 35))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}
