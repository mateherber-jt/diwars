package com.jobandtalent.feature

import com.jobandtalent.datetime.DateTimeProvider
import com.jobandtalent.datetime.di.DecoratorModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [FakeDateTimeModule::class, DecoratorModule::class])
@Singleton
interface MainApplicationComponent : MainViewModelFactoryProvider {
    val dateTimeProvider: DateTimeProvider
}