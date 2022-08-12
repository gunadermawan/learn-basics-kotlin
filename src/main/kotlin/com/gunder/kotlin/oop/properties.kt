package com.gunder.kotlin.oop

class Miaw(val name: String, val age: Int) {
    fun eat(){
        print("$name sedang makan! dan usianya $age")
    }
}

fun main() {
//    setter
    var cat = Miaw("miaw",12)
//    getter
    cat.eat()
}

