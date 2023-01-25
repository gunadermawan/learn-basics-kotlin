package com.gunder.kotlin.oop.inheritance

class Lion(override val name: String) :IRun {
    override fun sleep() {
       println("$name is sleep now")
    }
}