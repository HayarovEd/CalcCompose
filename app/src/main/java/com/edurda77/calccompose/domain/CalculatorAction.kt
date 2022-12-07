package com.edurda77.calccompose.domain

sealed interface CalculatorAction {
    data class Number(val number: Int): CalculatorAction
    data class Op(val operation: Operation): CalculatorAction
    data class OpOne(val operationOne: OperationOneNumber): CalculatorAction
    object Clear: CalculatorAction
    object Delete: CalculatorAction
    object Calculate: CalculatorAction
    object CalculatePercent: CalculatorAction
    object Decimal: CalculatorAction
}