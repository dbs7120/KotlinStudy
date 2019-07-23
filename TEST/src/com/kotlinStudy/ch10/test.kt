package com.kotlinStudy.ch10

interface SomeInterface {
    fun interfaceFun()
}

open class SomeClass {
    fun someClassFun() {
        println("test1")
    }
}

class Outer {
    val myInner: SomeClass = object : SomeClass(), SomeInterface {
        override fun interfaceFun() {
            println("test2")
        }
    }
}

class Test{
    companion object : SomeClass(), SomeInterface{
        override fun interfaceFun() {
            println("test3")
        }

    }
}

fun main() {
    val obj = Outer()
    obj.myInner.someClassFun()
    //obj.myInner.interfaceFun()
    obj.myInner

    Test.interfaceFun()


}