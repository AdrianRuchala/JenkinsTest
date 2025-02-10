package com.droidcode.apps.jenkinstest

import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.droidcode.apps.jenkinstest", appContext.packageName)
    }

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun buttonClickChangesText() {
        composeTestRule.setContent {
            Greeting(name = "Android")
        }

        composeTestRule.onNodeWithText("Hello Android!").assertExists()

        composeTestRule.onNodeWithText("naciśnij").performClick()

        composeTestRule.onNodeWithText("Hello siuu!").assertExists()
    }
}
