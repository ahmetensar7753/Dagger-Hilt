package com.ahmetensarbesir.hilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample

    @Inject constructor(@FirstImplementor private val myInterfaceImplementor : MyInterface, private val gson : Gson,@SecondImplementor private val mySecondInterfaceImplementor: MyInterface) {

        fun myFunction () : String {
            return "Working: ${myInterfaceImplementor.myPrintFun()}"
        }
    fun secFun() : String {
        return "Working : ${mySecondInterfaceImplementor.myPrintFun()}"
    }

    }

