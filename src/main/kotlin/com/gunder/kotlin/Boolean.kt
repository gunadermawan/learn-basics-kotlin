package com.gunder.kotlin

fun main() {
    val open = 7
    val close = 5
    val now = 23
    val isOpen = now < open || now > close
    print(!isOpen)
}