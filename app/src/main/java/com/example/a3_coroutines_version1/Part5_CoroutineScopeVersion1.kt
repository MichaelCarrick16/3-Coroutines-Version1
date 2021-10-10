package com.example.a3_coroutines_version1

import kotlinx.coroutines.*

fun main() {
    CoroutineScope(Dispatchers.Unconfined+Job()).launch {
        launch {
            println("Launch 1 Thread before : "+Thread.currentThread().name)
            withContext(Dispatchers.IO){
                println("Launch 1 Thread after : "+Thread.currentThread().name)
            }
        }

        launch {
            println("Launch 2")
        }

        val str = async {
            return@async "Pham Dinh Hiep"
        }.await()
        println(str)
    }
    Thread.sleep(3000)

}