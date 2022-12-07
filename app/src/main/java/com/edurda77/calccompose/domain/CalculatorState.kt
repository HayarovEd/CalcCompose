package com.edurda77.calccompose.domain

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: Operation? = null,
    val operationOne: OperationOneNumber? = null
)
