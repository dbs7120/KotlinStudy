package com.kotlinStudy.ch8

// 프로퍼티 null 로 초기화
class User_3 {
    val name1: String = "kkang"
    var name2: String? = null
    val name3: String? = null
    var age: Int? = null

    constructor(name2: String, name3: String, age: Int) {
        this.name2 = name2
        //this.name3 = name3    //name3 가 val 로 선언되었기 때문에 에러
        this.age = age
    }
}

// 늦은 초기화 (lateinit)
// lateinit 키워드 사용, var 변수만 가능, 클래스몸체 프로퍼티만 가능
// 사용자 정의 getter/setter 가 있으면 사용 불가, null 허용 프로퍼티에는 사용불가, 기초타입(Int) 사용 불가
class User4 {
    lateinit var lateData: String
    //lateinit val data2: String <- 에러
    //lateinit var data3: String? <- 에러
    //lateinit var  data4: Int <- 에러
}

// 초기화 미루기 (by lazy)
// 호출 시점에 초기화, val 프로퍼티만 가능, 클래스 몸체나 최상위 프로퍼티에 사용가능, 기초타입 사용가능
// 표현식이므로 마지막 줄의 데이터가 프로퍼티의 값으로 초기화 됨
val someData: String by lazy {
    println("i am someData lazy...")
    "hello"
}

class User5 {
    val prompt: String by lazy {
        println("i am prompt lazy...")
        someData
    }
    val age: Int by lazy {
        println("i am age lazy...")
        10
    }

    init {
        println("i am init...")
    }

    constructor() {
        println("i am contract...")
    }
}

fun main() {
    val user = User4()
    user.lateData = "hello"
    println(user.lateData)
    println("===================")
    val user1 = User5()
    println("prompt use before...")
    println("name : ${user1.prompt}")
    println("prompt use after...")
    println("age use after...")
    println("age : ${user1.age}")
    println("age use after...")
}