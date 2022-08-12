package com.gunder.kotlin.oop

class Animal(val name: String, val age: Int){
    fun eat(){
        println("$name sedang makan!")
    }
    fun age(){
        println("usianya adalah $age tahun")
    }
}

fun main() {
    val cat = Animal("kucing miaw", 2)
    cat.eat()
    cat.age()
}
