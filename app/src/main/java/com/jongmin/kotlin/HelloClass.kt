package com.jongmin.kotlin

fun main() {

    var cls1 = HelloClass()
    var cls2 = HelloClass(1)
    println(cls2.age)

    var person = Person(1,"Jongmin")
    println("${person.age} / ${person.name}")
}

class HelloClass{
    var age:Int = 0

    // 최초 실행
    init {
        age = 0
    }

    //기본 생성자
    constructor()

    //보조 생성자
    constructor(age:Int){
        this.age = age
    }
}

data class Person(var age:Int, val name:String)
