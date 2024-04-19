package com.jobandtalent.feature

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import com.jobandtalent.datetime.DateTimeProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel @AssistedInject constructor(
    dateTimeProvider: DateTimeProvider,
    @Assisted savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(dateTimeProvider.now())
    val uiState = _uiState.asStateFlow()

    @AssistedFactory
    interface Factory {
        fun create(savedStateHandle: SavedStateHandle): MainViewModel
    }
}