package com.gunder.kotlin

fun main() {
    val range = 1..5
//    for ((index, value) in range.withIndex()) {
//        println("value is $value with index $index")
//    }
    range.forEachIndexed() {value, index ->
        println("value is $index with index $value")
    }
}