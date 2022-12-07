package com.edurda77.calccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edurda77.calccompose.ui.theme.CreateRowButton
import com.edurda77.calccompose.ui.theme.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateScreen()
        }
    }
}

@Composable
fun CreateScreen(viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val state = viewModel.state
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
    ) {
        Text(
            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
            fontSize = 45.sp,
            textAlign = TextAlign.End,
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CreateRowButton()
    }
}