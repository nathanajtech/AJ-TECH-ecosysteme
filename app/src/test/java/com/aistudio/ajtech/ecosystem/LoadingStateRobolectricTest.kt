package com.aistudio.ajtech.ecosystem

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import com.aistudio.ajtech.ecosystem.ui.components.AjTechLoadingState
import com.aistudio.ajtech.ecosystem.ui.components.AjTechShimmerCard
import com.aistudio.ajtech.ecosystem.ui.theme.AJTechTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34], qualifiers = "w411dp-h891dp-xxhdpi")
class LoadingStateRobolectricTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testLoadingState_displaysIndeterminateLoading() {
        composeTestRule.setContent {
            AJTechTheme(darkTheme = true) {
                AjTechLoadingState(
                    message = "Initialisation de Firebase…",
                    subtitle = "Connexion sécurisée en cours",
                    progress = null
                )
            }
        }

        composeTestRule.onNodeWithTag("loading_state_container").assertIsDisplayed()
        composeTestRule.onNodeWithTag("loading_indicator").assertIsDisplayed()
        composeTestRule.onNodeWithTag("loading_message").assertIsDisplayed()
        composeTestRule.onNodeWithText("Initialisation de Firebase…").assertIsDisplayed()
        composeTestRule.onNodeWithText("Connexion sécurisée en cours").assertIsDisplayed()
        // Ensure determinate progress bar is absent when progress is null
        composeTestRule.onNodeWithTag("loading_progress_bar").assertDoesNotExist()
    }

    @Test
    fun testLoadingState_displaysDeterminateProgress() {
        composeTestRule.setContent {
            AJTechTheme(darkTheme = true) {
                AjTechLoadingState(
                    message = "Synchronisation de l'écosystème…",
                    subtitle = "Chargement des entités",
                    progress = 0.75f
                )
            }
        }

        composeTestRule.onNodeWithTag("loading_state_container").assertIsDisplayed()
        composeTestRule.onNodeWithTag("loading_progress_bar").assertIsDisplayed()
        composeTestRule.onNodeWithText("75%").assertIsDisplayed()
    }

    @Test
    fun testShimmerCard_rendersProperly() {
        composeTestRule.setContent {
            AJTechTheme(darkTheme = true) {
                AjTechShimmerCard()
            }
        }
        composeTestRule.waitForIdle()
    }
}
