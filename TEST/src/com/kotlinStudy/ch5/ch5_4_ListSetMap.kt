package com.kotlinStudy.ch5

// List : 순서가 있는 데이터 집합, 데이터의 중복 허용
// Set : 순서가 없는 데이터 집합, 데이터 중복 X
// Map : 키와 값으로 이루어지는 데이터 집합, 순서가 없으며 키의 중복은 허용 X

// List         -> listOf() : 불변 (수정, 추가 불가)
// MutableList  -> mutableListOf() : 가변
//Set, Map 도 동일형식

fun main() {
    val immutableList: List<String> = listOf("hello", "world")
    println("${immutableList.get(0)} .. ${immutableList.get(1)}")

    val mutableList: MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("!!!")
    mutableList.set(0, "good-bye")
    println("${mutableList.get(0)} .. ${mutableList.get(1)} .. ${mutableList.get(2)}")
    println("============================================")

    // Map 선언 방법
    val immutableMap1 = mapOf<String, String>(Pair("one", "hello"), Pair("two", "world1"))
    val immutableMap2 = mapOf<String, String>("one" to "hello", "two" to "world2")
    val mutableMap = mutableMapOf<String, String>()

    mutableMap.put("one", "hello")
    mutableMap.put("two", "world3")

    println("${immutableMap1.get("one")} .. ${immutableMap1.get("two")}")
    println("${immutableMap2.get("one")} .. ${immutableMap2.get("two")}")
    println("${mutableMap.get("one")} .. ${mutableMap.get("two")}")
    println("============================================")

    // Iterator 이터레이터 사용 출력
    val iterator1 = immutableList.iterator()
    while (iterator1.hasNext())
        println(iterator1.next())


    val iterator2 = mutableMap.iterator()
    while (iterator2.hasNext()) {
        val entry = iterator2.next()
        println("${entry.key}-${entry.value}")
    }
}