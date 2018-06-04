package com.wehightech.riadh.kotlinexperiments

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    oldest()
}

fun oldest() {
    val persons = listOf(Person("Mnasri", 35),
        Person("Bouguila"))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}


