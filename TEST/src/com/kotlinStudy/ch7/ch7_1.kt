package com.kotlinStudy.ch7

// 코틀린 클래스 구조
class Class{
    val myVariable = 10
    constructor(){}
    fun myFun(){}
    class Inner{
    }
}

class MyClass{
    var name: String = "world"
    fun sayHello(){
        println("hello $name")
    }
}

fun main(){
    val obj1 = MyClass()
    val obj2 = MyClass()
    obj1.name="kkang"
    obj1.sayHello()
    obj2.name="kim"
    obj2.sayHello()
}