package com.jongmin.kotlin

fun main() {

    var arr1 = listOf("1","2") //ArraList는  넣고 빼고등의 수정 불가
    var arr2 = mutableListOf("1","2") //ArraList는  넣고 빼고등의 수정 가능

    //arr1.add("3") // 에러 발생
    arr2.add("3")

    //반복문 - arr1의 인자만큼 인자를 꺼내 실행
    for(item in arr1){
        println(item)
    }

    // for((순서, 요소) in 배열)
    for((index, item) in arr1.withIndex()){
        println( "$index - $item")
    }

    // Casting - Auto Casting
    var hello:Any = "hello"
    if(hello is String){
        var str: String = hello
    }
}