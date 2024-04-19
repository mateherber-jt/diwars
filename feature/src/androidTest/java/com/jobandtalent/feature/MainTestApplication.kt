package com.jobandtalent.feature

import android.app.Application
import com.jobandtalent.di.ComponentHolder

class MainTestApplication :Application(), ComponentHolder {
    var component: MainApplicationComponent = DaggerMainApplicationComponent.create()

    @Suppress("UNCHECKED_CAST")
    override fun <T> getComponent(): T {
        return component as T
    }
}