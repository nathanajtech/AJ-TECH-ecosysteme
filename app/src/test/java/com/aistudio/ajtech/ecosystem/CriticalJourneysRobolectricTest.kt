package com.aistudio.ajtech.ecosystem

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.aistudio.ajtech.ecosystem.ui.hub.MainHubScreen
import com.aistudio.ajtech.ecosystem.ui.theme.AJTechTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Tests UI automatisés pour les deux parcours critiques (CUJs) :
 *
 * Parcours 1 :
 * Accueil → Écosystème → recherche → fiche → FR/HT
 *
 * Parcours 2 :
 * Accueil → Livre → chapitre → FR/HT → recherche → signet → navigation → partage
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34], qualifiers = "w411dp-h891dp-xxhdpi")
class CriticalJourneysRobolectricTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testCriticalJourney1_EcosystemSearchAndDetailBilingual() {
        composeTestRule.setContent {
            AJTechTheme(darkTheme = true) {
                MainHubScreen()
            }
        }
        composeTestRule.waitForIdle()

        // 1. Accueil : Vérification et clic sur la tuile ou l'onglet Écosystème
        composeTestRule.onNodeWithTag("home_nav_ecosystem")
            .performScrollTo()
            .assertIsDisplayed()
            .performClick()
        composeTestRule.waitForIdle()

        // 2. Recherche dans l'écosystème (ex: "EDUKA")
        composeTestRule.onNodeWithTag("search_entities_field")
            .assertIsDisplayed()
            .performTextInput("EDUKA")
        composeTestRule.waitForIdle()

        // 3. Sélection de la carte de l'entité EDUKA (filtrée dans la LazyColumn)
        composeTestRule.onNodeWithTag("entity_card_eduka")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 4. Consultation de la fiche détaillée normalisée (18 rubriques)
        composeTestRule.onNodeWithTag("back_to_ecosystem_button").assertExists()
        composeTestRule.onNodeWithText("FICHE ENTITÉ OFFICIELLE", substring = true).assertExists()

        // 5. Bascule linguistique FR -> HT dans la fiche détaillée
        composeTestRule.onNodeWithTag("detail_lang_ht")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Retounen nan Ekosistèm", substring = true).assertExists()

        // 6. Bascule linguistique HT -> FR dans la fiche détaillée
        composeTestRule.onNodeWithTag("detail_lang_fr")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Retour Écosystème", substring = true).assertExists()

        // 7. Retour à la liste de l'écosystème
        composeTestRule.onNodeWithTag("back_to_ecosystem_button").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("search_entities_field").assertExists()
    }

    @Test
    fun testCriticalJourney2_BookReaderChapterBilingualSearchBookmarkNavigationAndShare() {
        composeTestRule.setContent {
            AJTechTheme(darkTheme = true) {
                MainHubScreen()
            }
        }
        composeTestRule.waitForIdle()

        // 1. Accueil : Navigation vers le Livre compagnon officiel
        composeTestRule.onNodeWithTag("home_nav_book")
            .performScrollTo()
            .assertIsDisplayed()
            .performClick()
        composeTestRule.waitForIdle()

        // 2. Accès au Sommaire / Table des matières
        composeTestRule.onNodeWithTag("book_tab_1")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 3. Sélection d'un chapitre dans le sommaire (ex: front_dedicace ou ch_1_1)
        composeTestRule.onNodeWithTag("toc_chapter_front_dedicace")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 4. Lecture du chapitre & Bascule linguistique FR <-> HT
        composeTestRule.onNodeWithTag("book_lang_ht")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("book_lang_fr")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 5. Recherche plein texte bilingue dans le livre
        composeTestRule.onNodeWithTag("book_tab_3")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("book_search_field")
            .assertExists()
            .performTextInput("Souveraineté")
        composeTestRule.waitForIdle()

        // Sélection du résultat de recherche pour ouvrir le chapitre
        composeTestRule.onNodeWithTag("search_result_chapter_front_manifesto")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 6. Gestion du Signet (Bookmark toggle)
        composeTestRule.onNodeWithTag("book_bookmark_button")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 7. Navigation inter-chapitres (Suivant / Précédent)
        composeTestRule.onNodeWithTag("book_next_chapter_button")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("book_prev_chapter_button")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 8. Déclenchement du Partage d'extrait
        composeTestRule.onNodeWithTag("book_share_button")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
    }
}
