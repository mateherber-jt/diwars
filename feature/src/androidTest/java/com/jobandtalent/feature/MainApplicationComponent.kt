package com.jobandtalent.feature

import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@Singleton
@MergeComponent(AppScope::class)
interface MainApplicationComponent