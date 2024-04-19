package com.jobandtalent.datetime

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

class DateTimeProviderImpl @Inject constructor() : DateTimeProvider {
    private val formatter by lazy {
        DateTimeFormatter.ISO_DATE_TIME
    }

    override fun now(): String = formatter.format(LocalDateTime.now())
}