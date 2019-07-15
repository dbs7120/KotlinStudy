package com.kotlinStudy.ch5

// Array
fun main() {
    // 여러타입 배열
    var array = arrayOf(1, "kkang", true)
    array[0] = 10
    array[2] = "world"
    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")
    println("=================================")

    // 배열 타입 지정방법
    var arrayInt = arrayOf<Int>(10, 20, 30)
    var arrayInt2 = intArrayOf(10, 20, 30)
    var array3 = Array(3, { i -> i * 10 })  // 람다 표현식
    println("size : ${arrayInt.size} .. ${arrayInt.get(0)} .. ${arrayInt.get(1)} .. ${arrayInt.get(2)}")
    println("size : ${arrayInt2.size} .. ${arrayInt2.get(0)} .. ${arrayInt2.get(1)} .. ${arrayInt2.get(2)}")
    println("size : ${array3.size} .. ${array3.get(0)} .. ${array3.get(1)} .. ${array3.get(2)}")
    println("=================================")

    // 배열 Null 초기화
    var array4 = arrayOfNulls<Any>(4)
    array4[0] = 10
    array4[2] = "YUN"
    println("size : ${array4.size} .. ${array4.get(0)} .. ${array4.get(1)} .. ${array4.get(2)} .. ${array4.get(3)}")
    println("=================================")

    // 이터레이터 사용 출력
    val iterator1 = array4.iterator()
    while(iterator1.hasNext())
        print("${iterator1.next() }  ")


}