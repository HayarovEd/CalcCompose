package com.edurda77.calccompose.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edurda77.calccompose.domain.CalculatorAction
import com.edurda77.calccompose.domain.Operation
import com.edurda77.calccompose.domain.OperationOneNumber

@Composable
fun CreateRowButton() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            CreateColumnButton1()
        }
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            CreateColumnButton2()
        }
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            CreateColumnButton3()
        }
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            CreateColumnButton4()
        }
    }
}

@Composable
fun CreateColumnButton1() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_light_surfaceTint,
                colorTextButton = Color.White,
                nameButton = "%",
                calculationAction = CalculatorAction.CalculatePercent
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "C",
                calculationAction = CalculatorAction.Clear
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "7",
                calculationAction = CalculatorAction.Number(7)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "4",
                calculationAction = CalculatorAction.Number(4)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "1",
                calculationAction = CalculatorAction.Number(1)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "+/-",
                calculationAction = CalculatorAction.Negative
            )
        }
    }
}

@Composable
fun CreateColumnButton2() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_light_surfaceTint,
                colorTextButton = Color.White,
                nameButton = "1/x",
                calculationAction = CalculatorAction.OpOne(OperationOneNumber.DivideUnit)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "/",
                calculationAction = CalculatorAction.Op(Operation.Divide)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "8",
                calculationAction = CalculatorAction.Number(8)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "5",
                calculationAction = CalculatorAction.Number(5)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "2",
                calculationAction = CalculatorAction.Number(2)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "0",
                calculationAction = CalculatorAction.Number(0)
            )
        }
    }
}

@Composable
fun CreateColumnButton3() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_light_surfaceTint,
                colorTextButton = Color.White,
                nameButton = "x\u00B2",
                calculationAction = CalculatorAction.OpOne(OperationOneNumber.Qrt)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "x",
                calculationAction = CalculatorAction.Op(Operation.Multiply)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "9",
                calculationAction = CalculatorAction.Number(9)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "6",
                calculationAction = CalculatorAction.Number(6)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = "3",
                calculationAction = CalculatorAction.Number(3)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = Color.White,
                colorTextButton = Color.Black,
                nameButton = ",",
                calculationAction = CalculatorAction.Decimal
            )
        }
    }
}

@Composable
fun CreateColumnButton4() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_light_surfaceTint,
                colorTextButton = Color.White,
                nameButton = "\u221Ax",
                calculationAction = CalculatorAction.OpOne(OperationOneNumber.Sqrt)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "BC",
                calculationAction = CalculatorAction.Delete
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "-",
                calculationAction = CalculatorAction.Op(Operation.Subtract)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "+",
                calculationAction = CalculatorAction.Op(Operation.Add)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
        ) {
            CreateButton(
                colorButton = md_theme_light_surfaceTint,
                colorTextButton = Color.White,
                nameButton = "=",
                calculationAction = CalculatorAction.Calculate
            )
        }
    }
}


@Composable
fun CreateButton(
    colorButton: Color,
    colorTextButton: Color,
    nameButton: String,
    calculationAction: CalculatorAction,
    viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    Button(
        modifier = Modifier
            .clip(
                shape = RoundedCornerShape(0.dp)
            )
            .fillMaxSize(),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorButton),
        border = BorderStroke(1.dp, color = Color.Gray),
        onClick = {
            viewModel.onAction(calculationAction)
        }) {
        Text(
            text = nameButton,
            color = colorTextButton,
            fontSize = 24.sp
        )
    }
}