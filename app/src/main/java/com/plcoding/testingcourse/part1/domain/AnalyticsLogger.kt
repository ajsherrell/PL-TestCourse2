package com.plcoding.testingcourse.part1.domain

interface AnalyticsLogger {
    fun logEvent(event: String, vararg params: LogParams<Any>)
}

data class LogParams<T>(
    val key: String,
    val value: T
)