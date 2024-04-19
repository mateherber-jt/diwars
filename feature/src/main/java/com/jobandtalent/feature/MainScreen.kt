package com.jobandtalent.feature

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.jobandtalent.design.DIWarsTheme

@Composable
fun MainScreen(viewModel: MainViewModel, modifier: Modifier = Modifier) {
    val content by viewModel.uiState.collectAsStateWithLifecycle()
    MainScreen(text = content, modifier = modifier)
}

@Composable
private fun MainScreen(text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = TextUnit(24f, TextUnitType.Sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DIWarsTheme {
        MainScreen("Android")
    }
}