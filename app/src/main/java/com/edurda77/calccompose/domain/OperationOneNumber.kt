package com.edurda77.calccompose.domain

sealed interface OperationOneNumber {
    object DivideUnit: OperationOneNumber
    object Qrt: OperationOneNumber
    object Sqrt: OperationOneNumber
}
