package com.jobandtalent.feature

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.jobandtalent.datetime.DateTimeProvider
import com.jobandtalent.datetime.Decorator
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel @AssistedInject constructor(
    dateTimeProvider: DateTimeProvider,
    decorator: Decorator,
    @Assisted savedStateHandle: SavedStateHandle
) : ViewModel(), Decorator by decorator {

    private val _uiState = MutableStateFlow(dateTimeProvider.now().decorate())
    val uiState = _uiState.asStateFlow()

    @AssistedFactory
    interface Factory {
        fun create(savedStateHandle: SavedStateHandle): MainViewModel
    }
}