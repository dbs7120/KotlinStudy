package com.kotlinStudy.ch5

val intData: Int = 10
val oneMillion: Int = 1_000_000
val result = intData.minus(3)

fun cases(obj: Any): String {
    when (obj) {
        1 -> return "one"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a String"
        else -> return "unknown"
    }
}

fun main(args: Array<String>) {
    var num: Long = 1024
    println(result)
    println()
    println(cases(1))
    println(cases(3))
    println(cases(num))
}