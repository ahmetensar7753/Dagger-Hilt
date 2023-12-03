package com.ahmetensarbesir.hilt

import javax.inject.Inject

class SecondInterfaceImplementor
@Inject
constructor() : MyInterface
{
    override fun myPrintFun(): String {
        return "My Second Interface Implementor"
    }

}