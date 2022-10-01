package com.gunder.kotlin.oop

open class AnimalLover(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){

        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat(pName:String, pWeight:Double, pAge:Int, pIsCarnivore: Boolean):AnimalLover(pName,pWeight,pAge,pIsCarnivore){

    fun playWitHuman(){
        println("$name play with human")
    }

    override fun eat() {
        super.eat()
        println("namanya adalah $name")
    }

    override fun sleep() {
        super.sleep()
    }
}

class Fish(pName:String, pWeight:Double, pAge:Int, pIsCarnivore: Boolean):AnimalLover(pName,pWeight,pAge,pIsCarnivore){

    override fun eat() {
        super.eat()
        println("namanya adalah $name")
    }

}

fun main() {
    val catAnimal = Cat("cemplin",2.0,2,true)
    println("${catAnimal.name} play with human, dia berusia ${catAnimal.age}")
    catAnimal.playWitHuman()
    catAnimal.sleep()
    catAnimal.eat()
}