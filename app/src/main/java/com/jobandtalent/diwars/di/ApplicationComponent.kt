package com.jobandtalent.diwars.di

import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.MergeComponent
import com.squareup.anvil.annotations.optional.SingleIn

@SingleIn(AppScope::class)
@MergeComponent(AppScope::class)
interface ApplicationComponent