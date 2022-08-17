package com.gunder.kotlin

fun main() {
    val value = 7
    val range = 1..10
    val stringOfValue = when (value) {
        in range -> println("value in range")
        !in range -> println("value outside of range")
        else -> println("value undefined")
    }
    print(stringOfValue)
}