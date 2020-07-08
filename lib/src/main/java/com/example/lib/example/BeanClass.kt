package com.example.lib.example

open class BeanClass constructor(name: String) {


    init {
        // 初始化语句块，每个构造方法都会走这个方法
    }
}

class Son(_name: String = "name") : BeanClass(_name) {

}