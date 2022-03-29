package com.gunder.kotlin

fun main() {
    when(Color.BLUE){
        Color.RED -> println("Color is RED")
        Color.GREEN -> println("Color is GREEN")
        Color.BLUE -> println("Color is BLUE")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}