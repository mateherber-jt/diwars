package com.jobandtalent.feature

import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.MergeComponent
import com.squareup.anvil.annotations.optional.SingleIn

@SingleIn(AppScope::class)
@MergeComponent(AppScope::class)
interface MainApplicationComponent