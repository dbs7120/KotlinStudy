package com.kotlinStudy.ch5


val myVal1: Any = 10
val myVal2: Any? = myVal1

// myFun1, myFun2 는 동일 (반환값 생략시 Unit 으로 변환됨)
fun myFun1() {}
fun myFun2(): Unit {}

// Unit 과 Nothing 은 제너릭에서 차이를 보임
fun myFun(arg: Nothing?): Nothing{
    throw Exception()
}

// 타입 확인 is 연산자
fun getStringLength(obj: Any): Int?{
    if(obj !is String) return null
    return obj.length
}


