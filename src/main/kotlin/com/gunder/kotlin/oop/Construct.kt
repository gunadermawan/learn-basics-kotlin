package com.gunder.kotlin.oop

class Car(tire: Int, colors: String, isElectric: Boolean) {
    val tire: Int
    val colors: String
    val isElectric: Boolean
    var isDiesel: Boolean

    init {
        this.tire = if (tire < 0) 0 else tire
        this.colors = colors
        this.isElectric = isElectric
        this.isDiesel = false
    }

    //    secondary constructor
    constructor(tire: Int, colors: String, isElectric: Boolean, isDiesel: Boolean) : this(tire, colors, isElectric) {
        this.isDiesel = isDiesel
    }
}

fun main() {
    val carToyota = Car(4, "black", false)
    println("mobil avanza dengan ${carToyota.tire}, ${carToyota.colors} dan ${carToyota.isElectric}")

    val carTesla = Car(4, "Red", true, false)
    println("Mobil tesla dengan detail ${carTesla.tire}, ${carTesla.colors}, ${carTesla.isElectric} dan ${carTesla.isDiesel}")
}