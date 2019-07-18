package com.kotlinStudy.ch8

// 생성자변수의 프로퍼티화 -> 다른 프로퍼티에 대입
class User2(name: String) {     // var/val 로 생성자 매개변수 선언시 외부에서 접근가능해짐
    var myName: String = name
        get() = field.toUpperCase()
        set(value) {
            field = "Hello $value"
        }
}

fun main() {
    val user2 = User2("kkang")
    //user2.name = "lee"    // 접근 불가
    user2.myName = "kim"
    //println("name : ${user2.name}") // 접근 불가
    println("myName : ${user2.myName}")
}