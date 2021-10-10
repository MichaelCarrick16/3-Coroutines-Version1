package com.example.a3_coroutines_version1

import kotlinx.coroutines.*

fun main() {
    CoroutineScope(Job()+Dispatchers.IO).launch {        // chạy một coroutine trên background thread
        delay(2000L)  // non-blocking coroutine bị delay 2s
        println("World")      // print từ World ra sau khi hết delay
    }
    println("Hello")          // main thread vẫn tiếp tục chạy xuống dòng code này trong khi coroutine vẫn đang bị delay 10s
    Thread.sleep(4000L) // block main thread 4s
    println("Kotlin")


}