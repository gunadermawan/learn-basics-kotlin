package com.gunder.kotlin.oop.inheritance

open class Animal(val name:String, val age:Int) {
    open fun sleep(){
        println("$name sedang tidur!")
    }

    open fun eat(){
        print("$name sedang tidur")
    }

    open fun age(){
        println("$name sekarang berusia $age")
    }
}