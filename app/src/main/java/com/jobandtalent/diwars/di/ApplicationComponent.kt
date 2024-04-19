package com.jobandtalent.diwars.di

import dagger.Component
import com.jobandtalent.datetime.di.DateTimeBindingModule
import com.jobandtalent.feature.MainViewModelFactoryProvider
import javax.inject.Singleton

@Component(modules = [DateTimeBindingModule::class])
@Singleton
interface ApplicationComponent : MainViewModelFactoryProvider