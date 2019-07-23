package com.kotlinStudy.ch9

open class Super9_3 {
    open var x: Int = 10
    open fun someFun() {
        println("Super... someFun()")
    }
}

open class Sub9_3 :Super9_3(){
    override var x : Int = 20
    override fun someFun() {
        super.someFun()                         // super 키워드를 통해 상위클래스의 멤버 접근
        println("Sub... ${super.x} .... $x")
    }
}

fun main(){
    var sub = Sub9_3()
    sub.someFun()
}