package com.jobandtalent.feature

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class MainTest {
    @get:Rule(order = 10)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun whenMainScreenIsOpenedTheScreenShouldHaveDateTimeText() {
        composeTestRule.onNodeWithText("⏳$ANY_DATE_TIME⏳").assertExists()
    }

    companion object {
        const val ANY_DATE_TIME = "2022-01-01T00:00:00Z"
    }
}
