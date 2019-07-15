package com.kotlinStudy.ch4

fun recPrint(no: Int = 1, count: Int = 1) {
    println("recPrint...")
    return if (no == count) return else recPrint(no - 1, count)
}

// tailrec 키워드 사용시 자바코드로 변경될 때 일반 반복문으로 바뀌어 컴파일됨
// tailrec 재귀구문은 '재귀구문' 만 존재해야함
// "count + talirecPrint(no-1,count)" : X
// "tailrecPrint(no-1, count)" : O
tailrec fun tailrecPrint(no: Int = 1, count: Int = 1) {
    println("tailrecPrint...")
    return if (no == count) return else tailrecPrint(no - 1, count)   // 재귀 구문은 항상 함수의 맨마지막에 작성
}

fun main(args: Array<String>) {
    recPrint(3)
    println("===================")
    tailrecPrint(3)
}