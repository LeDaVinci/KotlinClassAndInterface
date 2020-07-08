package com.example.lib.example

interface Focusable {
    fun setFocus(b: Boolean) =
        //根据b来输出不同的字段
        println("this is ${if (b) "got" else "lost"} focus.")

    fun showoff() =  println("this is focusable showoff")
}