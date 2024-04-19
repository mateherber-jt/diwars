package com.jobandtalent.datetime.di

import com.jobandtalent.datetime.Decorator
import dagger.Module
import dagger.Provides

@Module
object DecoratorModule {
    @Provides
    fun decorator(): Decorator = object : Decorator {
        override fun String.decorate(): String {
            return "⏳$this⏳"
        }
    }
}