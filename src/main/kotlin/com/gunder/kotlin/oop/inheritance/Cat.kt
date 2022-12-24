package com.gunder.kotlin.oop.inheritance

class Cat(val pName: String, val pAge: Int) : Animal(pName, pAge) {
    fun play() {
        println("$pName playing with human")
    }

    override fun sleep() {
        println("$pName sedang tidur!")
    }

    override fun eat() {
        println("$name sedang makan!")
    }

    override fun age() {
        println("$name sekarang berusia $age tahun")
    }
}