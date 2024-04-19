package com.jobandtalent.feature

import com.jobandtalent.datetime.DateTimeProvider
import dagger.Component
import javax.inject.Singleton

@Component(modules = [FakeDateTimeModule::class])
@Singleton
interface MainApplicationComponent : MainViewModelFactoryProvider {
    val dateTimeProvider: DateTimeProvider
}