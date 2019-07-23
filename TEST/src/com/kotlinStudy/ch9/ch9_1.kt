package com.kotlinStudy.ch9

open class Shape {                       // 코틀린의 상위클래스는 open 키워드를 통해 상속 허용
    var x: Int = 0                       // 상위클래스 내부가 final 로 선언된 클래스, 함수, 프로퍼티일 경우 하위에서 재정의 금지됨
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var y: Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }
    lateinit var name: String

    open fun print() {                              // 함수 오버라이드를 위한 open 키워드 사용
        println("$name : location : $x, $y")
    }
}

class Rect : Shape() {                               // 상속관계 하위클래스는 : 를 통해 상속함
    var width: Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var height: Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    override fun print() {                          // 상위 클래스의 open 함수 override 키워드를 통해 오버라이드함
        println("$name : location : $x, $y ... width : $width ... height : $height")
    }
}

class Circle : Shape() {
    var r: Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    override fun print() {
        println("$name : location : $x, $y ... radius : $r")
    }
}

fun main() {
    val rect = Rect()
    rect.name = "Rect"
    rect.x = 10
    rect.y = 10
    rect.width = 20
    rect.height = 20
    rect.print()

    val circle = Circle()
    circle.name = "Circle"
    circle.x = 30
    circle.y = 30
    circle.r = 5
    circle.print()
}



