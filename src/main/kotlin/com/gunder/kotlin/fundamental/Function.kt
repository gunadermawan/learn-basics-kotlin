package com.gunder.kotlin

fun main() {
    val user = setUser("Guna Dermawan", 22)
    println(user)
    user("Guna Dermawan")
}

fun setUser(name: String, age: Int) = "Your name is $name, and your age is $age"

fun user(name: String){
    println("Your name is $name")
}
