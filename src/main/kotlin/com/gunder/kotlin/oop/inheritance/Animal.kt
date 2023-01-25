package com.gunder.kotlin.oop.inheritance

abstract class Animal(val name: String, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name is eat now")
    }

    open fun eat(typeFood: String, qty: Int) {
        println("$name is eat now with $typeFood and $qty\'s")
    }

    open fun sleep() {
        println("$name is sleep now")
    }
}