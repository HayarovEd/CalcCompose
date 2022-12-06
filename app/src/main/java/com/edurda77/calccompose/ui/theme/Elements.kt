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

@Composable
fun CreateRowButton(){
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
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "C"
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
                nameButton = "7"
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
                nameButton = "4"
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
                nameButton = "1"
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
                nameButton = "%"
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
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "/"
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
                nameButton = "8"
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
                nameButton = "5"
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
                nameButton = "2"
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
                nameButton = "0"
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
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "*"
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
                nameButton = "9"
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
                nameButton = "6"
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
                nameButton = "3"
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
                nameButton = ","
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
                colorButton = md_theme_dark_onTertiaryContainer,
                colorTextButton = md_theme_light_surfaceTint,
                nameButton = "BC"
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
                nameButton = "-"
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
                nameButton = "+"
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
                nameButton = "="
            )
        }
    }
}


@Composable
fun CreateButton(colorButton: Color, colorTextButton: Color, nameButton: String) {
    Button(
        modifier = Modifier
            .clip(
                shape = RoundedCornerShape(0.dp)
            )
            .fillMaxSize(),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorButton),
        border = BorderStroke(1.dp, color = Color.Gray),
        onClick = { /*TODO*/ }) {
        Text(
            text = nameButton,
            color = colorTextButton,
            fontSize = 24.sp
        )
    }
}