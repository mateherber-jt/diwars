package com.jobandtalent.datetime.di

import com.jobandtalent.datetime.Decorator
import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides

@ContributesTo(AppScope::class)
@Module
object DecoratorModule {
    @Provides
    fun decorator(): Decorator = object : Decorator {
        override fun String.decorate(): String {
            return "⏳$this⏳"
        }
    }
}