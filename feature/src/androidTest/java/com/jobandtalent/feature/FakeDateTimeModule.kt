package com.jobandtalent.feature

import com.jobandtalent.datetime.DateTimeProvider
import dagger.Module
import dagger.Provides
import org.mockito.Mockito

@Module
open class FakeDateTimeModule {
    @Provides
    open fun dateTimeProvider(): DateTimeProvider = Mockito.mock()
}
