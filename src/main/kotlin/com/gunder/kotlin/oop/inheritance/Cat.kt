package com.gunder.kotlin.oop.inheritance

class Cat(val pName: String, val pAge: Int) : Animal(pName, pAge) {
    fun play() {
        println("$pName playing with human")
    }

    override fun sleep() {
        println("$pName sedang tidur!")
    }

    override fun eat() {
        println("$pName sedang makan!")
    }

    override fun age() {
        println("$pAge sekarang berusia $age tahun")
    }
}