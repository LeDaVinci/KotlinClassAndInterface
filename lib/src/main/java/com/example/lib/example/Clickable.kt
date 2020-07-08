package com.example.lib.example

interface Clickable {
    val isClickable : Boolean

    //普通方法声明
    fun click()
    //带默认的实现方法
    fun showoff() = println("this is clickable showoff")
}