package com.jobandtalent.feature

import com.jobandtalent.datetime.DateTimeProvider
import com.jobandtalent.datetime.DateTimeProviderImpl
import com.jobandtalent.di.AppScope
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

@ContributesBinding(scope = AppScope::class, replaces = [DateTimeProviderImpl::class])
class FakeDateTimeProvider @Inject constructor() : DateTimeProvider {
    override fun now(): String {
        return MainTest.ANY_DATE_TIME
    }
}