package com.example.kotlinclassandinterface

import com.example.kotlinclassandinterface.java.JavaClass
import com.example.kotlinclassandinterface.kotlin.KotlinInterface
import com.example.lib.example.BeanClass
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


class ExampleUnitTest :
    KotlinInterface {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val beanClass = BeanClass()
        println(beanClass)
    }

}