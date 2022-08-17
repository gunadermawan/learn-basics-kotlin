package com.gunder.kotlin

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val Am = SimpleDateFormat("HH:mm:ss", Locale.ENGLISH)
    Am.timeZone =   TimeZone.getDefault()
    Am.timeZone = TimeZone.getTimeZone("UTC")
    println(Am)
}