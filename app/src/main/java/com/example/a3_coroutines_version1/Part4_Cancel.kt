package com.example.a3_coroutines_version1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val job = GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    Thread.sleep(1300L)
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    println("main: Now I can quit.")
    // Result : I'm sleeping 0 ...
    //I'm sleeping 1 ...
    //I'm sleeping 2 ...
    //main: I'm tired of waiting!
    //main: Now I can quit.

    
}