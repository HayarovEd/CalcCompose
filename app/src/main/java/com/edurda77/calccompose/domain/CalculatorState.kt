package com.edurda77.calccompose.domain

import com.edurda77.calccompose.domain.Operation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: Operation? = null
)
