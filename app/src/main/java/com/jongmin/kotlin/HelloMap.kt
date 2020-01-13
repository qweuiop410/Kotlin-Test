package com.jongmin.kotlin

fun main() {
    //{"name","Jongmin"}
    var map1 = mapOf(Pair("name","Jongmin1"))
    //map1.put("name","Jongmin")는 에러 발생

    //mutableMapOf는 <> 안에 type을 입력
    //mutableMapOf는 수정 가능
    var map2 = mutableMapOf<String, String>()
    map2.put("name","Jongmin2")
    map2.put("age","1")

    for(map in map1){
        println(map)
        //출력 : name=Jongmin1

        //Key만 출력
        println(map.key)
        //출력 : name

        //Value만 출력
        println(map.value)
        //출력 : Jongmin1
    }

    for(map in map2){
        println(map)
        //출력 : name=Jongmin2
        //출력 : age=1
    }

    // map2의 Key만 출력
    println(map2.keys)
    // 출력 : [name, age]
}