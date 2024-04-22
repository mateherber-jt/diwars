package com.jobandtalent.diwars.di

import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@Singleton
@MergeComponent(AppScope::class)
interface ApplicationComponent