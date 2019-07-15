package com.kotlinStudy.ch4

// 중위표기식(infix)
// 매개변수가 하나인 함수
// 클래스 맴버 함수로 선언되거나 클래스의 확장 함수일 때만 가능
infix fun Int.myFun(x: Int): Int {
    return x * x
}

fun <T> varargsFun(vararg array: T) {  // 가변 인자 함수 (vararg 예약어), T : 제너릭
    for (a in array) {
        println(a)
    }
}

class FunClass {
    infix fun infixFun(a: Int) {
        println("infixFun call....")
    }
}

fun main() {
    val obj = FunClass()
    obj.infixFun(10)
    obj infixFun 10

    println(10 myFun 10)
    println(10.myFun(10))
    println("===================================================")

    varargsFun(10, "hello", "world")
    varargsFun(10, "20", "false")


}