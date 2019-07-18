package com.kotlinStudy.ch8

import kotlin.properties.Delegates

//  프로퍼티 값 변경 감지
class User6 {
    // 람다식 사용
    var name: String by Delegates.observable("nonValue",
        { props, old, new -> println("old : $old ... new : $new") })
}

fun main() {
    val user = User6()
    println(user.name)
    user.name = "kkang"
    user.name = "kim"
    println(user.name)
}