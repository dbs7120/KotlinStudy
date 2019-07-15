package com.kotlinStudy.ch6

import java.util.Arrays.asList

// 전개 연산자


fun main() {

    // 전개 연산자 * : 배열의 데이터를 나열 (리스트에는 바로사용 불가)
    val array1 = arrayOf(10, 20, 30)

    val list1 = asList(1, 2, array1[0], array1[1], array1[2], 100, 200)
    list1.forEach({ println(it) })    // 람다식표현 가능
    println("==================")

    val list2 = asList(1, 2, *array1, 100, 200)
    list2.forEach({ println(it) })
    println("==================")


    val obj: MyClass = MyClass(10)
    val result1 = obj + 5
    val result2 = obj - 5
    println("result1 : $result1.. result2 : $result2")
    println("${Test(30) + 5}")
}

// 연산자 재정의

data class MyClass(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

operator fun MyClass.minus(arg: Int): Int {
    return no + arg
}

class Test(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}