package com.ahmetensarbesir.hilt

import javax.inject.Inject


class InterfaceImplementor
    @Inject constructor()
    : MyInterface {
    override fun myPrintFun(): String {
        return "My Interface Implementor"
    }
}