package com.edurda77.calccompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun buttonOfCalc(color: Color) {
    Button(
        modifier = Modifier.size(30.dp, 25.dp).background(color = color),
        shape = MaterialTheme.shapes.medium,
        onClick = { /*TODO*/ }) {
        Text(text = "Click", fontSize = 20.sp)
    }
}