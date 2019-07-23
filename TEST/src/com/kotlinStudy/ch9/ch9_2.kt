package com.kotlinStudy.ch9

open class Super {
    open val name: String = "kkang"             // 프로퍼티의 오버라이드
    open val name2: String = "kkang"
}

open class Sub : Super() {
    // val -> val, var 로 재정의 가능
    // var -> var 로만 재정의 가능
    // 상위클래스의 프로퍼티 이름, 타입 모두 같아야 함
    // null 허용일 경우 null 불허 재정의 가능
    // null 불허일 경우 null 허용 불가능
    final override var name: String = "kim"
    override var name2: String = "kim"
}

class Sub2 : Sub() {
    // override 키워드는 open 키워드를 내장함 (상위에 open 키워드가 없더라도 하위에서 재정의 가능)
    override var name2: String = "lee"

    // 상위 클래스의 구성성분이 final 로 된경우는 하위에서 재정의 불가능
    // override var name:String = "lee"
}

