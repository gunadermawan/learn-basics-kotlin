package com.gunder.kotlin.oop.inheritance

open class Animal(val name:String, val age:Int) {
    open fun sleep(){
        println("$name sedang tidur!")
    }

    open fun eat(){
        println("$name sedang tidur")
    }

    open fun eat(typeFood: String){
        println("$name cemplin sedang makan $typeFood")
    }

    open fun eat(typeFood: String, quantity:Int) {
        println("$name sedang makan sebanuyak $quantity")
    }

    open fun age(){
        println("$name sekarang berusia $age")
    }
}