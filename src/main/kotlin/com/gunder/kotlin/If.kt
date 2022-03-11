package com.gunder.kotlin

fun main() {
    val open = 8
    val now = 8
    val office: String = if (now > open){
        "toko tutup!"
    } else if (now == open) {
        "tunggu bentar ya..."
    } else {
        "toko buka!"
    }
    print(office)
}