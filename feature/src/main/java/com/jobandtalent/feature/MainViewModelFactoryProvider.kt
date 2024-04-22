package com.jobandtalent.feature

import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.ContributesTo

@ContributesTo(AppScope::class)
interface MainViewModelFactoryProvider {
    fun mainViewModelFactory(): MainViewModel.Factory
}