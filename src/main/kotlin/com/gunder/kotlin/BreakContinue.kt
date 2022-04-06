package com.gunder.kotlin

fun main() {
    val listOf = listOf(1, 2, 3, null, 5, 6, null, 8, 9, 10)
    for (i in 1..10) {
        if (i == 5) continue
        println(i)
    }
}