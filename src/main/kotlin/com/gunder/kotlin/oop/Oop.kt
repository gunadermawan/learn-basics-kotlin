package com.gunder.kotlin.oop

class Oop(val tire: String,
          val door: String,
          val engine: String) {

    fun startEngine(){
        println("$engine start!")
    }

    fun doorOpen(){
        println("$door open from passenger!")
    }
}
