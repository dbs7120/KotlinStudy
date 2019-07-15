package com.kotlinStudy.ch6


fun main() {
    var a: Int = 10
    a = 33

    // 코틀린은 If 문을 표현식으로 사용 가능
    // 표현식으로 발생하는 값은 맨마지막에
    // 표현식으로 작성시 else 문 반드시 필요
    val result = if (a < 10) {
        print("hello....")
        10 + 20
    } else {
        print("world...")
        20 + 20
    }
    println(result)
    println("================================")

    // 표현식 사용가능
    val a2 = 3
    when (a2) {
        1, 2 -> println("a2 is 1 or 2")
        else -> {
            println("a2 is neither 1 nor 2")
        }
    }
    println("================================")

    // 범위 조건
    val data3 = 15
    when (data3) {
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1<=data3<=10")
        in 11..20 -> println("11<=data3<=20")
        else -> println("data3>20")
    }
    println("================================")

    // 컬렉션 타입 조건
    val list = listOf<String>("Hello", "world", "kkang")
    val array = arrayOf<String>("one", "two", "three")
    val data4 = "kkang"
    when (data4) {
        in list -> println("data4 in list")
        in array -> println("data4 in array")
    }
    println("================================")

    // 여러 타입 분기
    fun testWhen(data: Any?) {
        when (data) {
            1 -> println("data value is 1")
            "hello" -> println("data value is hello")
            is Boolean -> println("data type is Boolean")
        }
    }
    testWhen(true)
    testWhen(1)
    testWhen("hello")
    println("================================")

    // when 표현식으로써 사용
    // else 문 생략 불가
    // 각각의 블록 마지막 문장이 반환값+-
    val data6 = 3
    val result2 = when (data6) {
        1 -> "1..."
        2 -> "2..."
        else -> {
            println("else...")
            "hello"
        }
    }
    println(result2)


}