package com.edurda77.calccompose.domain

sealed class OperationOneNumber (val symbol: String) {
    object DivideUnit: OperationOneNumber("1/x")
    object Qrt: OperationOneNumber("x²")
    object Sqrt: OperationOneNumber("√x")
}
