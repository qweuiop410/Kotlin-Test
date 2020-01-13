package com.jongmin.kotlin

//해당 파일이 실시될때 가장 먼저 실행
fun main(){
    // final
    val hello1:String = "hello world"

    // int, string, float, double
    var hello2:String = "hello world"
    // null값을 넣을수 있을때 뒤에 ? 추가
    var hello3:String?

    // hello4함수 호출
    hello4()
    // hello5함수 호출
    hello5(hello1)

    // 출력
    println(hello5("println"))
    print(hello5("print"))

}

// Java의 void 함수
fun hello4(){
}

// Java의 String 함수
fun hello5(h:String):String{
    return h
}