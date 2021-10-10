package com.example.a3_coroutines_version1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val job1 : Job = GlobalScope.launch {
        delay(2000L)
        println("Hello")
    }
    val job2 : Job = GlobalScope.launch {
        job1.join()
        delay(1000L)
        println("World")
    }
    Thread.sleep(4000L)
    //Result : Hello , World // Note : Bỏ Thread.sleep => Result không có gì
}