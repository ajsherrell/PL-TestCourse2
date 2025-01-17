package com.plcoding.testingcourse.part1.data

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase
import com.plcoding.testingcourse.part1.domain.AnalyticsLogger
import com.plcoding.testingcourse.part1.domain.LogParams

class FirebaseAnalyticsLogger(
    private val analytics: FirebaseAnalytics = Firebase.analytics
) : AnalyticsLogger {
    override fun logEvent(event: String, vararg params: LogParams<Any>) {
        analytics.logEvent("save_profile") {
            params.forEach { parameter ->
                param(parameter.key, parameter.value.toString())
            }
        }
    }
}