package com.jobandtalent.feature

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.jobandtalent.design.DIWarsTheme
import com.jobandtalent.di.lazyViewModel
import com.jobandtalent.di.provide

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by lazyViewModel { stateHandle ->
        provide<MainViewModelFactoryProvider>().mainViewModelFactory().create(stateHandle)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DIWarsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

