package com.jobandtalent.diwars.di

import com.jobandtalent.datetime.di.DateTimeBindingModule
import com.jobandtalent.datetime.di.DecoratorModule
import com.jobandtalent.feature.MainViewModelFactoryProvider
import dagger.Component
import javax.inject.Singleton

@Component(modules = [DateTimeBindingModule::class, DecoratorModule::class])
@Singleton
interface ApplicationComponent : MainViewModelFactoryProvider