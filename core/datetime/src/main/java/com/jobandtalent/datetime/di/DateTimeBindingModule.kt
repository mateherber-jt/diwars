package com.jobandtalent.datetime.di

import com.jobandtalent.datetime.DateTimeProvider
import com.jobandtalent.datetime.DateTimeProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface DateTimeBindingModule {
    @Binds
    fun bindDateTimeProvider(provider: DateTimeProviderImpl): DateTimeProvider
}
