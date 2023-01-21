package com.gunder.kotlin.oop.inheritance

open class Animal(val name: String, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name is eat now")
    }

    open fun sleep() {
        println("$name is sleep now")
    }
}