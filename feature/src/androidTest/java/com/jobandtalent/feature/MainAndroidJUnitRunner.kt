package com.jobandtalent.feature

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

class MainAndroidJUnitRunner : AndroidJUnitRunner() {
    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, MainTestApplication::class.java.name, context)
    }
}