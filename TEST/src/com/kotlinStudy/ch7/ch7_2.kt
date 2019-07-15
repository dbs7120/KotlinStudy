package com.kotlinStudy.ch7


class MyClass1 {}                // 생성자 생략(컴파일러 기본정의)
class MyClass2() {}              // 생성자 예약어(constructor) 생략
class MyClass3 constructor() {}  // 5,6은 동일한 생략

class User1 constructor(name: String, age: Int) {}      // 매개변수가 존재하는 생성자
class User2(name: String, age: Int) {}                  // 8,9 는 동일한 구조

val user1 = User1("kkang", 33)
val user2 = User2("kim", 28)

class User3(name: String, age: Int = 0) {}              // 생성자 매개변수 기본값 명시

val user3 = User3("kkang", 33)
val user4 = User3("kim")

class User4(name: String, age: Int) {
    init {                                              // 생성자 초기화 블록 init 사용
        println("i am init...")
    }
}

val user5 = User4("kkang", 33)


class User5(name: String, age: Int) {
    val name = name                         // 생성자 매개변수 값이용 방법 1 : 클래스 프로퍼티를 지정해 대입

    init {
        println("i am init... constructor argument : $name ... $age")
    }

    fun sayHello() {
        println("hello $name")
    }
}

class User6(val name: String, val age: Int) {   // 생성자 매개변수 값이용 방법 2 : 생성자 매개변수를 val,var 로 지정
    init {
        println("i am init... constructor argument : $name ... $age")
    }

    fun sayHello() {
        println("hello $name")
    }
}

fun main() {
    val user7 = User5("kkang", 33)
    user7.sayHello()
    println("========================================")
    val user8 = User6("kim",22)
    user8.sayHello()
}