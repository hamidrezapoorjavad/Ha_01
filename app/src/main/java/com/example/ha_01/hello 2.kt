package com.example.ha_01

fun main() {
//    println("please enter your number")
//    var a = readLine()!!.toInt()
//    val c = 500
//    val b = 200
//    var result:Boolean= (a > b)&&(a < c)
//    println(result)
//    val myArray = arrayOf(.5,.8,.4,.6,.1)
////    print(myArray[0])
////    println(myArray.size)
////    println(myArray[myArray.size-1])
//    val my = Array(30,{i ->i*3  })
////    print(my[9])

//    val name = Array(10, { i -> "ali$i" })
//    print(name[5])
//    println("enter your number")
//    val a = readLine()!!.toInt()
//    if (a>70 )
//        print("pass")
//
//    else
//        print("fail")
//    var name: String
//    println("enter 1 or 2")
//    val number = readLine()!!.toInt()
//    name = if (number == 1) {
//        "ali"
//    } else {
//        "hamid"
//    }
//    print(name)
//    println("enter your number")
//    val number = readLine()!!.toInt()
//    if (number in 80..100) {
//        print("top student")
//    } else if (number in 50..80) {
//        print("pass")
//    } else if (number in 30..50) {
//        print("condition pass")
//    } else if (number in 0..30) {
//        print("fail")
//    } else {
//        print("wrong no")
//    }
    var name = readLine()!!.toInt()
    when(name) {
        1 -> {print("one")
            print("two")}
        2 -> print("two")
        3 -> print("three")
        4 -> print("four")
        5 -> print("five")
        6 -> print("six")
        7 -> print("seven")
        8 -> print("eight")
        9 -> print("nine")
        in 10..30-> print("ten")
        else -> print("ff")
    }

}
