package com.kotlinStudy.ch8

import java.time.LocalDateTime      // import 를 통해 자바 라이브러리 사용 가능

val tz = LocalDateTime.now()
val today_year = tz.year

class User {
    var name: String = "kkang"  // 코틀린의 클래스 변수 : '프로퍼티' (최상위 레벨 변수와 클래스 변수만 프로퍼티, 함수내부변수는 프로퍼티가 아님)
    val age: Int = 20           // 프로퍼티는 getter 함수와 setter 함수가 기본 내장되어 있음
    // var : getter, setter 가능
    // val : getter 만 가능
}

class User1 {
    // 사용자 정의 프로퍼티 (사용자 정의 getter/setter)
    var greeting: String = "Hello"
        set(value) {
            field = "Hello $value"
        }
        get() = field.toUpperCase()
    var user_age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else {
                field = 0
            }
        }
    val birth_year: Int                 // val 프로퍼티는 getter 가 있을시 초기화 생략 가능 (var 프로퍼티는 초기화 생략 불가)
        get() = today_year - user_age
}

fun main() {
    val user = User()
    user.name = "kim"
    println("name : ${user.name}")
    println("age : ${user.age}")
    println("=========================")

    val user1 = User1()
    user1.greeting = "kkang"
    println(user1.greeting)
    user1.user_age = -1
    println("age : ${user1.user_age}")
    user1.user_age = 30
    println("age : ${user1.user_age}")
    println("birth_year: ${user1.birth_year}")

}