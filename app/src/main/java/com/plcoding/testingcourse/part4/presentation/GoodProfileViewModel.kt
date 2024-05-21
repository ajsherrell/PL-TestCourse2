package com.plcoding.testingcourse.part4.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.plcoding.testingcourse.R
import com.plcoding.testingcourse.part1.domain.AnalyticsLogger
import com.plcoding.testingcourse.part1.domain.LogParams

class GoodProfileViewModel(
    private val analytics: AnalyticsLogger
) : ViewModel() {

    var state by mutableStateOf(GoodProfileState())
        private set

    fun saveProfile() {
        analytics.logEvent("save_profile",
            LogParams("profile_id", state.profileId),
            LogParams("username", state.username)
        )
        state = state.copy(
            infoMessage = UiText.StringResource(R.string.successfully_saved_profile)
        )
    }
}

@Composable
fun Test(infoMessage: UiText?) { // This is how you can add the string in a UiText class in a UI.
    infoMessage?.let {
        Text(text = it.asString())
    }
}