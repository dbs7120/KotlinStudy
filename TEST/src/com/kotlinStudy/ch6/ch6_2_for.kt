package com.kotlinStudy.ch6

fun main() {
    var sum: Int = 0
    // 코틀린 for 반복문 : 범위만 표현
    for (i in 1..10) {
        sum += i
    }
    println(sum)
    println("====================")

    // 컬렉션 타입
    val list = listOf("Hello", " world", "!")
    val sb = StringBuffer()
    for (str in list) {
        sb.append(str)
    }
    println(sb)
    println("====================")

    // 컬렉션타입의 인덱스값 이용
    for (i in list.indices) {
        println(list[i])
    }
    println("====================")

    // 인덱스와 값 모두 이용
    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }
    println("====================")

    // for until step 사용
    for (i in 1 until 11 step 2) {
        println(i)
    }
    println("====================")

    // while 문은 타언어와 동일
    // break, continue 도 동일한 구조

    // 중첩 for 문
    for (i in 1..3) {
        for (j in 1..3) {
            println("i : $i , j : $j")
        }
    }
    println("====================")

    // 라벨 사용
    aaa@ for (i in 1..3) {
        for (j in 1..3) {
            if (i > 2) break@aaa
            println("i : $i, j : $j")
        }
    }


}