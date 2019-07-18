package com.kotlinStudy.ch7

class User(name: String) {
    init {
        println("init block...$name")
    }

    constructor(name: String, age: Int) : this(name) {  // 보조 생성자, 보조 생성자 매개변수를 this 키워드로 주생성자 매개변수 연결
        println("constructor ... $name ... $age")
    }
}

class User_2(name: String) {
    init {
        println("constructor ... $name")
    }

    constructor(name: String, age: Int) : this(name) {
        println("constructor ... $name ... $age")
    }

    constructor(name: String, age: Int, email: String) : this(name, age) {    // 생성자 오버로딩
        println("constructor ... $name ... $age ... $email")
    }
}

fun main() {
    println("-----주 생성자로 생성한 경우-----")
    val user1 = User("kkang")
    println("-----보조 생성자로 생성한 경우-----")
    val user2 = User("Kim", 33)
    println("===============================")
    println("User1")
    val user3 = User_2("kim")
    println("User2")
    val user4 = User_2("yun", 13)
    println("User3")
    val user5 = User_2("lee", 20, "lee@naver.com")

}