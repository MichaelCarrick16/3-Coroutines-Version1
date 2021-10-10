package com.example.a3_coroutines_version1

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Hello")
        delay(3000L)
    }
    println("World")
}