package com.jobandtalent.feature

import android.app.Application
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.core.app.ApplicationProvider
import com.jobandtalent.datetime.DateTimeProvider
import it.cosenonjaviste.daggermock.DaggerMock
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock

class MainTest {
    @get:Rule(order = 10)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @get:Rule
    val rule = DaggerMock.rule<MainApplicationComponent>(FakeDateTimeModule()) {
        set {
            val mainTestApplication =
                ApplicationProvider.getApplicationContext<Application>() as MainTestApplication
            mainTestApplication.component = it
            Mockito.`when`(dateTimeProvider.now()).thenReturn(ANY_DATE_TIME)
        }
    }

    private val dateTimeProvider: DateTimeProvider = mock()

    @Test
    fun whenMainScreenIsOpenedTheScreenShouldHaveDateTimeText() {
        composeTestRule.onNodeWithText(ANY_DATE_TIME).assertExists()
    }

    companion object {
        private const val ANY_DATE_TIME = "2022-01-01T00:00:00Z"
    }
}
