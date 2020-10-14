package com.example.ha_01

fun main() {
  println("please enter your name")
  println("please enter your family")
  println("please enter your birthday date")
  val name = readLine()
  val family = readLine()
  val date = readLine()

  println(2020 - (date!!.toInt()))
  println("$name$family")
}





