package com.gunder.kotlin.oop.inheritance

class Cat(name: String, age: Int, isCarnivore: Boolean) : Animal(name, age, isCarnivore) {
    override fun eat() {
        println("$name is eat now")
    }

    override fun sleep() {
        println("$name is sleep now")
    }
}