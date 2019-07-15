package com.kotlinStudy.ch3

import com.kotlinStudy.ch4.ch3Example as ch3Fun

const val topData1: Int = 20    //상수 선언
var topData2: Int = 20          //val : value(immutable), var : variable(mutable)
val topData3: Int = 20

class User {
    val objData1: String = "hello"
    var objData2: String = "world"

    fun some() {
        val localData1: Int
        val localData2: String
        localData1 = 40
        println(localData1)
        localData2 = "hello"
        println(localData2)
    }
}


fun main() {
    println(topData1 + topData2)
    User().some()
    val test = ch3Fun()
    print(test)
}
