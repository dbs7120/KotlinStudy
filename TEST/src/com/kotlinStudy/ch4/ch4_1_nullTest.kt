package com.kotlinStudy.ch4

var num1: Int = 20
var nullableData1: String? = null       // 코틀린은 기본자료형 존재X 모두 객체(Object)
var nullableData2: Int? = null          // 함수내부를 제외한 값들은 선언시 초기화해야함(기본 초기화 X)
var nullableData3: Double? = null       // 자료형값 뒤 ? 는 NULL 안전성을 나타내줌 (?가 없을시 NULL 로 초기화 불가)

// 첫 인자가 Null 일 경우 지정된 값("kkang")으로 초기화 (변수를 통한 NULL전달은 조건문필요)
fun sayHello(name: String? = "kkang", age: Int) {
    println("Hello!! $name")
    println("Age: $age")
}

fun sayHello2(name: String?) {
    if (name == null)
        println("Hello!! kkang")
    else
        println("Hello!! $name")
}

fun functionTest(num: Int? = 7777) {
    println(num)
}

fun ch3Example(): Int {
    var num: Int
    num = 1024
    return num
}

fun main() {
    sayHello(age = 10)
    sayHello("Yun", 26)
    sayHello2(nullableData1)    // 'null' 값 자체 전달
    functionTest(3333)
    functionTest()
    functionTest(nullableData2) // 'null' 값 자체 전달

}