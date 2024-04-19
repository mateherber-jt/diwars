package com.jobandtalent.diwars

import android.app.Application
import com.jobandtalent.di.ComponentHolder
import com.jobandtalent.diwars.di.ApplicationComponent
import com.jobandtalent.diwars.di.DaggerApplicationComponent

@Suppress("UNCHECKED_CAST")
class DiApplication : Application(), ComponentHolder {
    private val component: ApplicationComponent = DaggerApplicationComponent.create()

    override fun <T> getComponent(): T {
        return component as T
    }
}
