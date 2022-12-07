package com.edurda77.calccompose.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.edurda77.calccompose.domain.CalculatorAction
import com.edurda77.calccompose.domain.Operation
import com.edurda77.calccompose.domain.CalculatorState
import com.edurda77.calccompose.domain.OperationOneNumber
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.math.sqrt

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    var state by mutableStateOf(CalculatorState())

    fun onAction(action: CalculatorAction) {
        when(action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Delete -> delete()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Op -> enterOperation(action.operation)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Calculate -> calculate()
            is CalculatorAction.CalculatePercent -> calculatePercent()
            is CalculatorAction.OpOne -> calculateOne(action.operationOne)
        }
    }

    private fun calculateOne(operationOne: OperationOneNumber) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operationOne = operationOne)
        }
        val number1 = state.number1.toDoubleOrNull()
        if(number1 != null) {
            val result = when(state.operationOne) {
                is OperationOneNumber.DivideUnit -> 1/number1
                is OperationOneNumber.Qrt -> number1*number1
                is OperationOneNumber.Sqrt -> sqrt(number1)
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operationOne = null
            )
        }
    }

    private fun calculatePercent() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operation) {
                is Operation.Add -> number1 + (number2*number1/100)
                is Operation.Subtract -> number1 - (number2*number1/100)
                is Operation.Multiply -> number1 * (number2/100)
                is Operation.Divide -> number1 / (number2/100)
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun enterOperation(operation: Operation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun calculate() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operation) {
                is Operation.Add -> number1 + number2
                is Operation.Subtract -> number1 - number2
                is Operation.Multiply -> number1 * number2
                is Operation.Divide -> number1 / number2
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun delete() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }
}