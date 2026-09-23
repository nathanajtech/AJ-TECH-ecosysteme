package com.aistudio.ajtech.ecosystem

import android.content.Intent
import android.os.Build
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.aistudio.ajtech.ecosystem.data.model.*
import com.aistudio.ajtech.ecosystem.data.repository.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34], qualifiers = "w411dp-h891dp-xxhdpi")
class FilterAndShareRobolectricTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testFilters_matchRepositoryStatusCounts() {
        // 1. Vérification des comptes exacts dans le Repository
        val allEntities = EcosystemRepository.allEntities
        assertEquals(22, allEntities.size)

        val operationalCount = allEntities.count { it.status == EntityStatus.OPERATIONAL }
        val devCount = allEntities.count { it.status == EntityStatus.IN_DEVELOPMENT }
        val conceptCount = allEntities.count { it.status == EntityStatus.CONCEPT }
        val plannedCount = allEntities.count { it.status == EntityStatus.PLANNED }

        assertEquals(22, operationalCount + devCount + conceptCount + plannedCount)

        composeTestRule.waitForIdle()

        // 2. Navigation vers l'onglet Écosystème
        composeTestRule.onNodeWithTag("home_nav_ecosystem")
            .performScrollTo()
            .assertIsDisplayed()
            .performClick()
        composeTestRule.waitForIdle()

        // 3. Clic sur le filtre "Toutes" : les entités du début de liste sont présentes
        composeTestRule.onNodeWithTag("filter_status_all")
            .performScrollTo()
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("entity_card_aj_tech").assertExists()
        composeTestRule.onNodeWithTag("entity_card_aj_task").assertExists()

        // 4. Clic sur le filtre "Opérationnel" : aucune entité opérationnelle actuellement
        composeTestRule.onNodeWithTag("filter_status_operational")
            .performScrollTo()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("filter_status_operational")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("entity_card_aj_tech").assertDoesNotExist()
        composeTestRule.onNodeWithTag("entity_card_aj_task").assertDoesNotExist()
        composeTestRule.onNodeWithTag("entity_card_aj_pay").assertDoesNotExist()

        // 5. Clic sur le filtre "En développement" : seules les entités IN_DEVELOPMENT doivent être affichées
        composeTestRule.onNodeWithTag("filter_status_in_development")
            .performScrollTo()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("filter_status_in_development")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("entity_card_aj_task").assertExists()
        composeTestRule.onNodeWithTag("entity_card_eduka").assertExists()
        composeTestRule.onNodeWithTag("entity_card_aj_tech").assertDoesNotExist()
        composeTestRule.onNodeWithTag("entity_card_aj_pay").assertDoesNotExist()

        // 6. Clic sur le filtre "Concept" : seules les entités CONCEPT doivent être affichées
        composeTestRule.onNodeWithTag("filter_status_concept")
            .performScrollTo()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("filter_status_concept")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("entity_card_aj_tech").assertExists()
        composeTestRule.onNodeWithTag("entity_card_aj_te").assertExists()
        composeTestRule.onNodeWithTag("entity_card_aj_task").assertDoesNotExist()
        composeTestRule.onNodeWithTag("entity_card_aj_pay").assertDoesNotExist()

        // 7. Clic sur le filtre "Planifié" : seules les entités PLANNED doivent être affichées
        composeTestRule.onNodeWithTag("filter_status_planned")
            .performScrollTo()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("filter_status_planned")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("entity_card_aj_pay").assertExists()
        composeTestRule.onNodeWithTag("entity_card_aj_cloud").assertExists()
        composeTestRule.onNodeWithTag("entity_card_aj_tech").assertDoesNotExist()
        composeTestRule.onNodeWithTag("entity_card_aj_task").assertDoesNotExist()


    }

    @Test
    fun testAjTe_existsInRepositoryWithCorrectStatus() {
        val ajTe = EcosystemRepository.getEntityById("aj_te")
        assertNotNull("AJ-Tè doit exister dans l'écosystème", ajTe)
        assertEquals("AJ-Tè", ajTe!!.name)
        assertEquals(EntityStatus.CONCEPT, ajTe.status)

        // Validation de la complétude des 18 rubriques normalisées
        assertTrue("taglineFr non vide", ajTe.taglineFr.isNotBlank())
        assertTrue("taglineHt non vide", ajTe.taglineHt.isNotBlank())
        assertTrue("originFr non vide", ajTe.originFr.isNotBlank())
        assertTrue("originHt non vide", ajTe.originHt.isNotBlank())
        assertTrue("missionFr non vide", ajTe.missionFr.isNotBlank())
        assertTrue("missionHt non vide", ajTe.missionHt.isNotBlank())
        assertTrue("visionFr non vide", ajTe.visionFr.isNotBlank())
        assertTrue("visionHt non vide", ajTe.visionHt.isNotBlank())
        assertTrue("problemFr non vide", ajTe.problemFr.isNotBlank())
        assertTrue("problemHt non vide", ajTe.problemHt.isNotBlank())
        assertTrue("solutionFr non vide", ajTe.solutionFr.isNotBlank())
        assertTrue("solutionHt non vide", ajTe.solutionHt.isNotBlank())
        assertTrue("targetAudienceFr non vide", ajTe.targetAudienceFr.isNotBlank())
        assertTrue("targetAudienceHt non vide", ajTe.targetAudienceHt.isNotBlank())
        assertTrue("featuresFr non vide", ajTe.featuresFr.isNotEmpty())
        assertTrue("featuresHt non vide", ajTe.featuresHt.isNotEmpty())
        assertTrue("architectureFr non vide", ajTe.architectureFr.isNotBlank())
        assertTrue("architectureHt non vide", ajTe.architectureHt.isNotBlank())
        assertTrue("techStackFr non vide", ajTe.techStackFr.isNotEmpty())
        assertTrue("techStackHt non vide", ajTe.techStackHt.isNotEmpty())
        assertTrue("aiRoleFr non vide", ajTe.aiRoleFr.isNotBlank())
        assertTrue("aiRoleHt non vide", ajTe.aiRoleHt.isNotBlank())
        assertTrue("securityFr non vide", ajTe.securityFr.isNotBlank())
        assertTrue("securityHt non vide", ajTe.securityHt.isNotBlank())
        assertTrue("businessModelFr non vide", ajTe.businessModelFr.isNotBlank())
        assertTrue("businessModelHt non vide", ajTe.businessModelHt.isNotBlank())
        assertTrue("ajTechIntegrationFr non vide", ajTe.ajTechIntegrationFr.isNotBlank())
        assertTrue("ajTechIntegrationHt non vide", ajTe.ajTechIntegrationHt.isNotBlank())
        assertTrue("relatedEntitiesFr non vide", ajTe.relatedEntitiesFr.isNotBlank())
        assertTrue("relatedEntitiesHt non vide", ajTe.relatedEntitiesHt.isNotBlank())
        assertTrue("roadmapFr non vide", ajTe.roadmapFr.isNotEmpty())
        assertTrue("roadmapHt non vide", ajTe.roadmapHt.isNotEmpty())
        assertTrue("internationalOutlooksFr non vide", ajTe.internationalOutlooksFr.isNotBlank())
        assertTrue("internationalOutlooksHt non vide", ajTe.internationalOutlooksHt.isNotBlank())
    }

    @Test
    fun testAjTe_searchOpenFicheAndBilingualToggle() {
        composeTestRule.waitForIdle()

        // 1. Navigation vers l'onglet Écosystème
        composeTestRule.onNodeWithTag("home_nav_ecosystem")
            .performScrollTo()
            .assertIsDisplayed()
            .performClick()
        composeTestRule.waitForIdle()

        // 2. Recherche ciblée "AJ-Tè"
        composeTestRule.onNodeWithTag("search_entities_field")
            .assertIsDisplayed()
            .performTextInput("AJ-Tè")
        composeTestRule.waitForIdle()

        // 3. Clic sur la carte d'AJ-Tè
        composeTestRule.onNodeWithTag("entity_card_aj_te")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 4. Vérification de l'ouverture de la fiche détaillée
        composeTestRule.onNodeWithTag("back_to_ecosystem_button").assertExists()
        composeTestRule.onNodeWithText("FICHE ENTITÉ OFFICIELLE", substring = true).assertExists()

        // 5. Bascule bilingue FR -> HT via detail_lang_ht
        composeTestRule.onNodeWithTag("detail_lang_ht")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // Vérification de la présence du texte créole
        composeTestRule.onNodeWithText("Retounen nan Ekosistèm", substring = true).assertExists()

        // 6. Bascule bilingue HT -> FR via detail_lang_fr
        composeTestRule.onNodeWithTag("detail_lang_fr")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithText("Retour Écosystème", substring = true).assertExists()

        // 7. Retour à la liste de l'écosystème
        composeTestRule.onNodeWithTag("back_to_ecosystem_button")
            .performClick()
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("search_entities_field").assertExists()
    }

    @Test
    fun testShare_realActionSendIntentIsFired() {
        composeTestRule.waitForIdle()

        // 1. Navigation vers l'onglet Livre
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

        // 3. Clic sur un chapitre dans le sommaire (ouvre le mode lecture)
        composeTestRule.onNodeWithTag("toc_chapter_front_dedicace")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 4. Clic sur le bouton de partage de l'extrait
        composeTestRule.onNodeWithTag("book_share_button")
            .assertExists()
            .performClick()
        composeTestRule.waitForIdle()

        // 5. Déballage de l'Intent système intercepté par Robolectric
        val startedIntent = Shadows.shadowOf(composeTestRule.activity).nextStartedActivity
        assertNotNull("Un Intent de partage système doit être déclenché", startedIntent)
        assertEquals(Intent.ACTION_CHOOSER, startedIntent.action)

        // Déballage de l'EXTRA_INTENT (ACTION_SEND) contenu dans le Chooser
        val targetIntent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            startedIntent.getParcelableExtra(Intent.EXTRA_INTENT, Intent::class.java)
        } else {
            @Suppress("DEPRECATION")
            startedIntent.getParcelableExtra<Intent>(Intent.EXTRA_INTENT)
        }

        assertNotNull("L'Intent cible dans le Chooser doit exister", targetIntent)
        assertEquals(Intent.ACTION_SEND, targetIntent!!.action)
        assertEquals("text/plain", targetIntent.type)

        val extraText = targetIntent.getStringExtra(Intent.EXTRA_TEXT)
        assertNotNull("Le texte partagé ne doit pas être null", extraText)
        assertTrue("Le texte partagé ne doit pas être vide", extraText!!.isNotEmpty())
        assertTrue("Le texte partagé doit mentionner AJ-TECH", extraText.contains("AJ-TECH"))
    }

    @Test
    fun testBookRepository_part1ContainsAll12ChaptersWithBilingualContent() {
        val part1 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_1" }
        assertNotNull("Partie I doit exister dans le BookRepository", part1)
        assertEquals("PARTIE I — GENÈSE ET FONDATION D'AJ-TECH", part1!!.titleFr)
        assertEquals("PATI I — JENÈZ AK FONDASYON AJ-TECH", part1.titleHt)
        assertEquals(12, part1.chapters.size)

        // Vérification de chaque chapitre de 1 à 12
        for (i in 1..12) {
            val chapter = part1.chapters[i - 1]
            assertEquals("ch_1_$i", chapter.id)
            assertEquals(i, chapter.chapterNumber)
            assertEquals("part_1", chapter.partId)
            assertTrue("Titre FR du chapitre $i non vide", chapter.titleFr.startsWith("Chapitre $i —"))
            assertTrue("Titre HT du chapitre $i non vide", chapter.titleHt.startsWith("Chapit $i —"))
            assertTrue("Contenu FR du chapitre $i non vide", chapter.contentFr.isNotBlank())
            assertTrue("Contenu HT du chapitre $i non vide", chapter.contentHt.isNotBlank())
            assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, chapter.status)
        }

        // Vérification des éléments biographiques et officiels clés
        val ch2 = part1.chapters[1]
        assertTrue(ch2.contentFr.contains("Jonathan Germain"))
        assertTrue(ch2.contentFr.contains("12 octobre 1991"))
        assertTrue(ch2.contentFr.contains("Port-au-Prince"))

        val ch6 = part1.chapters[5]
        assertTrue(ch6.contentFr.contains("2025"))
        assertTrue(ch6.contentFr.contains("Vision, Technologie et Avenir"))

        val ch9 = part1.chapters[8]
        assertTrue(ch9.contentFr.contains("mettre Haïti sur l'échelle mondiale"))
        assertTrue(ch9.contentHt.contains("mete Ayiti sou echèl mondyal"))

        val ch10 = part1.chapters[9]
        assertTrue(ch10.contentFr.contains("Devenir un géant de la technologie"))
        assertTrue(ch10.contentHt.contains("Vin tounen yon jeyan nan teknoloji"))
    }

    @Test
    fun testBookRepository_part2ContainsAll12ChaptersWithBilingualContent() {
        val part2 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_2" }
        assertNotNull("Partie II doit exister dans le BookRepository", part2)
        assertEquals("PARTIE II — PHILOSOPHIE, MISSION, VISION ET VALEURS", part2!!.titleFr)
        assertEquals("PATI II — FILOZOFI, MISYON, VIZYON AK VALÈ", part2.titleHt)
        assertEquals(12, part2.chapters.size)

        // Vérification de chaque chapitre de 13 à 24
        for (i in 13..24) {
            val chapter = part2.chapters[i - 13]
            assertEquals("ch_2_$i", chapter.id)
            assertEquals(i, chapter.chapterNumber)
            assertEquals("part_2", chapter.partId)
            assertTrue("Titre FR du chapitre $i non vide", chapter.titleFr.startsWith("Chapitre $i —"))
            assertTrue("Titre HT du chapitre $i non vide", chapter.titleHt.startsWith("Chapit $i —"))
            assertTrue("Contenu FR du chapitre $i non vide", chapter.contentFr.isNotBlank())
            assertTrue("Contenu HT du chapitre $i non vide", chapter.contentHt.isNotBlank())
            assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, chapter.status)
        }

        // Vérification du positionnement / devise (Ch 14)
        val ch14 = part2.chapters[1]
        assertTrue(ch14.contentFr.contains("L'innovation haïtienne au service du monde"))

        // Vérification de la mission officielle (Ch 15)
        val ch15 = part2.chapters[2]
        assertTrue(ch15.contentFr.contains("Mettre Haïti sur l'échelle mondiale dans la technologie et faciliter l'accès de tous à la technologie") || ch15.contentFr.contains("faciliter l'accès de tous à la technologie"))
        assertTrue(ch15.contentHt.contains("Mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji a") || ch15.contentHt.contains("fasilit"))

        // Vérification de la vision officielle (Ch 16)
        val ch16 = part2.chapters[3]
        assertTrue(ch16.contentFr.contains("Devenir un géant de la technologie"))
        assertTrue(ch16.contentHt.contains("Vin tounen yon jeyan nan teknoloji"))

        // Vérification de la posture d'ambition en construction (Ch 13)
        val ch13 = part2.chapters[0]
        assertTrue(ch13.contentFr.contains("entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet", ignoreCase = true))

        // Vérification du message d'encouragement aux jeunes (Ch 22 & Ch 24)
        val ch22 = part2.chapters[9]
        assertTrue(ch22.contentFr.contains("Vous êtes forts, vous avez d'immenses capacités") || ch22.contentFr.contains("jeunesse"))
        assertTrue(ch22.contentHt.contains("Nou fò, nou gen anpil kapasite") || ch22.contentHt.contains("jèn"))

        val ch24 = part2.chapters[11]
        assertTrue(ch24.contentFr.contains("Rien n'est facile sans le travail") && ch24.contentFr.contains("sommet"))
        assertTrue(ch24.contentHt.contains("Anyen pa fasil san travay") && ch24.contentHt.contains("somè"))
    }

    @Test
    fun testBookRepository_part3ContainsAll22EntitiesWith18RubricsBilingual() {
        val part3 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_3" }
        assertNotNull("Partie III doit exister dans le BookRepository", part3)
        assertEquals("Partie III — Les 22 entités de l'écosystème AJ-TECH", part3!!.titleFr)
        assertEquals("Pati III — 22 antite ki nan ekosistèm AJ-TECH", part3.titleHt)
        assertEquals(22, part3.chapters.size)

        val expectedNames = listOf(
            "AJ-TECH", "AJ-Task", "AJ-Tè", "AJ-Learn", "AJ-Pay", "AJ-Wallet",
            "AJ-Chat", "AJ-Cloud", "AJ-Meet", "AJ-Mail", "AJ-Studio", "AJ-Dev",
            "AJ-Maps", "AJ-Fondation", "AJ-Biz", "AJ-Commerce", "AJ-MathQuest", "AJ-Bioklin",
            "AJ-Fitness", "AJ-Assistant", "EDUKA", "EDH"
        )

        val expectedIds = listOf(
            "ch_3_25", "ch_3_26", "ch_3_27", "ch_3_28", "ch_3_29", "ch_3_30",
            "ch_3_31", "ch_3_32", "ch_3_33", "ch_3_34", "ch_3_35", "ch_3_36",
            "ch_3_37", "ch_3_38", "ch_3_39", "ch_3_40", "ch_3_41", "ch_3_42",
            "ch_3_43", "ch_3_44", "ch_3_45", "ch_3_46"
        )

        for (i in 0 until 22) {
            val chapterNumber = 25 + i
            val chapter = part3.chapters[i]
            val expectedName = expectedNames[i]
            val expectedId = expectedIds[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_3", chapter.partId)
            assertTrue("Titre FR du chapitre $chapterNumber doit contenir '$expectedName'", chapter.titleFr.contains(expectedName))
            assertTrue("Titre HT du chapitre $chapterNumber doit contenir '$expectedName'", chapter.titleHt.contains(expectedName))

            // Validation de la présence des rubriques obligatoires en FR
            val contentFr = chapter.contentFr
            assertTrue("FR: 1. Nom manquant dans $expectedName", contentFr.contains("1. Nom :"))
            assertTrue("FR: 2. Statut actuel officiel manquant dans $expectedName", contentFr.contains("2. Statut actuel officiel :"))
            assertTrue("FR: 3. Origine du concept manquant dans $expectedName", contentFr.contains("3. Origine du concept :"))
            assertTrue("FR: 4. Mission manquant dans $expectedName", contentFr.contains("4. Mission :"))
            assertTrue("FR: 5. Vision manquant dans $expectedName", contentFr.contains("5. Vision :"))
            assertTrue("FR: 6. Problème résolu manquant dans $expectedName", contentFr.contains("6. Problème résolu :"))
            assertTrue("FR: 7. Solution proposée manquant dans $expectedName", contentFr.contains("7. Solution proposée :"))
            assertTrue("FR: 8. Public cible manquant dans $expectedName", contentFr.contains("8. Public cible :"))
            assertTrue("FR: 9. Fonctionnalités principales manquant dans $expectedName", contentFr.contains("9. Fonctionnalités principales :"))
            assertTrue("FR: 10. Architecture technique manquant dans $expectedName", contentFr.contains("10. Architecture technique :"))
            assertTrue("FR: 11. Technologies envisagées manquant dans $expectedName", contentFr.contains("11. Technologies envisagées :"))
            assertTrue("FR: 12. Intelligence artificielle manquant dans $expectedName", contentFr.contains("12. Intelligence artificielle :"))
            assertTrue("FR: 13. Sécurité manquant dans $expectedName", contentFr.contains("13. Sécurité :"))
            assertTrue("FR: 14. Modèle économique manquant dans $expectedName", contentFr.contains("14. Modèle économique :"))
            assertTrue("FR: 15. Intégration AJ-TECH manquant dans $expectedName", contentFr.contains("15. Intégration avec AJ-TECH :"))
            assertTrue("FR: 16. Relations avec entités manquant dans $expectedName", contentFr.contains("16. Relations avec les autres entités :"))
            assertTrue("FR: 17. Roadmap manquant dans $expectedName", contentFr.contains("17. Feuille de route 2026–2035 :"))
            assertTrue("FR: 18. Perspectives internationales manquant dans $expectedName", contentFr.contains("18. Perspectives internationales :"))

            // Validation de la présence des rubriques obligatoires en HT
            val contentHt = chapter.contentHt
            assertTrue("HT: 1. Non manquant dans $expectedName", contentHt.contains("1. Non :"))
            assertTrue("HT: 2. Estati ofisyèl kounye a manquant dans $expectedName", contentHt.contains("2. Estati ofisyèl kounye a :"))
            assertTrue("HT: 3. Orijin konsèp la manquant dans $expectedName", contentHt.contains("3. Orijin konsèp la :"))
            assertTrue("HT: 4. Misyon manquant dans $expectedName", contentHt.contains("4. Misyon :"))
            assertTrue("HT: 5. Vizyon manquant dans $expectedName", contentHt.contains("5. Vizyon :"))
            assertTrue("HT: 6. Pwoblèm li rezoud manquant dans $expectedName", contentHt.contains("6. Pwoblèm li rezoud :"))
            assertTrue("HT: 7. Solisyon li pote manquant dans $expectedName", contentHt.contains("7. Solisyon li pote :"))
            assertTrue("HT: 8. Moun li vize manquant dans $expectedName", contentHt.contains("8. Moun li vize :"))
            assertTrue("HT: 9. Fonksyonalite prensipal yo manquant dans $expectedName", contentHt.contains("9. Fonksyonalite prensipal yo :"))
            assertTrue("HT: 10. Arkitekti teknik manquant dans $expectedName", contentHt.contains("10. Arkitekti teknik :"))
            assertTrue("HT: 11. Teknoloji yo prevwa itilize manquant dans $expectedName", contentHt.contains("11. Teknoloji yo prevwa itilize :"))
            assertTrue("HT: 12. Entèlijans atifisyèl manquant dans $expectedName", contentHt.contains("12. Entèlijans atifisyèl :"))
            assertTrue("HT: 13. Sekirite manquant dans $expectedName", contentHt.contains("13. Sekirite :"))
            assertTrue("HT: 14. Modèl ekonomik manquant dans $expectedName", contentHt.contains("14. Modèl ekonomik :"))
            assertTrue("HT: 15. Entegrasyon ak AJ-TECH manquant dans $expectedName", contentHt.contains("15. Entegrasyon ak AJ-TECH :"))
            assertTrue("HT: 16. Relasyon ak lòt antite yo manquant dans $expectedName", contentHt.contains("16. Relasyon ak lòt antite yo :"))
            assertTrue("HT: 17. Plan wout 2026–2035 manquant dans $expectedName", contentHt.contains("17. Plan wout 2026–2035 :"))
            assertTrue("HT: 18. Pèspektiv entènasyonal manquant dans $expectedName", contentHt.contains("18. Pèspektiv entènasyonal :"))
        }

        // Vérification des statuts officiels clés
        val ajTaskCh = part3.chapters[1]
        assertTrue(ajTaskCh.contentFr.contains("EN DÉVELOPPEMENT / PROTOTYPE AVANCÉ"))
        assertTrue(ajTaskCh.contentFr.contains("PWA"))

        val edukaCh = part3.chapters[20]
        assertTrue(edukaCh.contentFr.contains("CONCEPT / EN CONCEPTION"))

        val ajTeCh = part3.chapters[2]
        assertTrue(ajTeCh.contentFr.contains("CONCEPT"))
    }

    @Test
    fun testBookRepository_part4ContainsAll15ChaptersBilingualAndArchitectureValidation() {
        val part4 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_4" }
        assertNotNull("Partie IV doit exister dans le BookRepository", part4)
        assertEquals("PARTIE IV — ARCHITECTURE TECHNOLOGIQUE", part4!!.titleFr)
        assertEquals("PATI IV — ACHITEKTI TEKNOLOJIK AJ-TECH", part4.titleHt)
        assertEquals(15, part4.chapters.size)

        val expectedIds = (47..61).map { "ch_4_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 47 — L'architecture comme fondation",
            "Chapitre 48 — Progressive Web Apps et accessibilité",
            "Chapitre 49 — L'approche Offline-First",
            "Chapitre 50 — Stockage local et IndexedDB",
            "Chapitre 51 — Synchronisation et gestion des conflits",
            "Chapitre 52 — API REST et services numériques",
            "Chapitre 53 — Architecture modulaire de l'écosystème",
            "Chapitre 54 — Applications Android et Jetpack Compose",
            "Chapitre 55 — Cloud et infrastructure numérique",
            "Chapitre 56 — Vers un cloud souverain haïtien",
            "Chapitre 57 — Sécurité dès la conception",
            "Chapitre 58 — Protection des données et vie privée",
            "Chapitre 59 — Performance et optimisation",
            "Chapitre 60 — Qualité logicielle et tests",
            "Chapitre 61 — Une architecture prête pour l'avenir"
        )

        for (i in 0 until 15) {
            val chapterNumber = 47 + i
            val chapter = part4.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_4", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
        }

        // Vérifications spécifiques de contenu technique
        val ch47 = part4.chapters[0]
        assertTrue(ch47.contentFr.contains("modulaire"))
        assertTrue(ch47.contentFr.contains("haïtiennes"))

        val ch48 = part4.chapters[1]
        assertTrue(ch48.contentFr.contains("Progressive Web App"))
        assertTrue(ch48.contentFr.contains("PWA"))

        val ch49 = part4.chapters[2]
        assertTrue(ch49.contentFr.contains("Offline-First"))

        val ch50 = part4.chapters[3]
        assertTrue(ch50.contentFr.contains("IndexedDB"))

        val ch52 = part4.chapters[5]
        assertTrue(ch52.contentFr.contains("API REST"))

        val ch54 = part4.chapters[7]
        assertTrue(ch54.contentFr.contains("Kotlin"))
        assertTrue(ch54.contentFr.contains("Jetpack Compose"))
        assertTrue(ch54.contentFr.contains("MVVM"))

        val ch56 = part4.chapters[9]
        assertTrue(ch56.contentFr.contains("cloud souverain"))
        assertTrue(ch56.contentFr.contains("AJ-Cloud"))

        val ch57 = part4.chapters[10]
        assertTrue(ch57.contentFr.contains("Security by Design"))
        assertTrue(ch57.contentFr.contains("chiffrement"))

        val ch59 = part4.chapters[12]
        assertTrue(ch59.contentFr.contains("drawLine()"))
        assertTrue(ch59.contentFr.contains("remember"))

        val ch60 = part4.chapters[13]
        assertTrue(ch60.contentFr.contains("Robolectric"))

        val ch61 = part4.chapters[14]
        assertTrue(ch61.contentFr.contains("2026–2035"))
        assertTrue(ch61.contentFr.contains("L'innovation haïtienne au service du monde"))
    }

    @Test
    fun testBookRepository_part5ContainsAll15ChaptersBilingualAndEconomicTransparency() {
        val part5 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_5" }
        assertNotNull("Partie V doit exister dans le BookRepository", part5)
        assertEquals("PARTIE V — ÉCONOMIE, ENTREPRENEURIAT ET MODÈLE D'AFFAIRES", part5!!.titleFr)
        assertEquals("PATI V — EKONOMI, ANTREPRENARYA AK MODÈL BIZNIS", part5.titleHt)
        assertEquals(15, part5.chapters.size)

        val expectedIds = (62..76).map { "ch_5_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 62 — Construire une économie numérique durable",
            "Chapitre 63 — L'entrepreneuriat technologique haïtien",
            "Chapitre 64 — Transformer une idée en produit",
            "Chapitre 65 — Le bootstrapping et la construction avec peu de moyens",
            "Chapitre 66 — Modèles économiques numériques",
            "Chapitre 67 — Monétisation éthique",
            "Chapitre 68 — AJ-TECH et la création de valeur",
            "Chapitre 69 — AJ-Commerce et le commerce numérique",
            "Chapitre 70 — AJ-Biz et l'accompagnement des entreprises",
            "Chapitre 71 — Paiements numériques et inclusion financière",
            "Chapitre 72 — Investissement et financement responsable",
            "Chapitre 73 — Diaspora et capital international",
            "Chapitre 74 — Mesurer la performance d'une entreprise technologique",
            "Chapitre 75 — Croissance, scalabilité et expansion",
            "Chapitre 76 — Vers un modèle économique AJ-TECH 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 62 + i
            val chapter = part5.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_5", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
        }

        // Vérifications de transparence économique stricte
        val ch62 = part5.chapters[0]
        assertEquals("ch_5_62", ch62.id)
        assertTrue("ch62 doit parler de saut technologique", ch62.contentFr.contains("Leapfrogging"))
        assertTrue("ch62 doit parler d'économie haïtienne", ch62.contentFr.contains("L'économie haïtienne"))

        val ch65 = part5.chapters[3]
        assertEquals("ch_5_65", ch65.id)
        assertTrue("ch65 doit contenir Bootstrapping", ch65.contentFr.contains("Bootstrapping"))

        val ch68 = part5.chapters[6]
        assertEquals("ch_5_68", ch68.id)
        assertTrue("ch68 doit mentionner aucun produit commercialisé", ch68.contentFr.contains("aucun produit commercialisé"))

        val ch69 = part5.chapters[7]
        assertEquals("ch_5_69", ch69.id)
        assertTrue("ch69 doit mentionner Non commercialisé", ch69.contentFr.contains("Non commercialisé"))

        val ch70 = part5.chapters[8]
        assertEquals("ch_5_70", ch70.id)
        assertTrue("ch70 doit mentionner AJ-Biz", ch70.contentFr.contains("AJ-Biz"))
        assertTrue("ch70 doit mentionner AJ-Fondation", ch70.contentFr.contains("AJ-Fondation"))

        val ch71 = part5.chapters[9]
        assertEquals("ch_5_71", ch71.id)
        assertTrue("ch71 doit mentionner BRH", ch71.contentFr.contains("Banque de la République d'Haïti"))
        assertTrue("ch71 doit mentionner MonCash", ch71.contentFr.contains("MonCash"))

        val ch72 = part5.chapters[10]
        assertEquals("ch_5_72", ch72.id)
        assertTrue("ch72 doit mentionner autofinancé ou ressources personnelles", ch72.contentFr.contains("autofinancé") || ch72.contentFr.contains("ressources personnelles"))

        val ch75 = part5.chapters[13]
        assertEquals("ch_5_75", ch75.id)
        assertTrue("ch75 doit mentionner cercles concentriques", ch75.contentFr.contains("cercles concentriques"))

        val ch76 = part5.chapters[14]
        assertEquals("ch_5_76", ch76.id)
        assertTrue("ch76 doit mentionner phase 1", ch76.contentFr.contains("2026–2027"))
        assertTrue("ch76 doit mentionner phase 4", ch76.contentFr.contains("2034–2035"))
    }

    @Test
    fun testBookRepository_part6ContainsAll15ChaptersBilingualAndEducationIntegrity() {
        val part6 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_6" }
        assertNotNull("Partie VI doit exister dans le BookRepository", part6)
        assertTrue(part6!!.titleFr.contains("Éducation, compétences et capital humain") || part6.titleFr.contains("ÉDUCATION, COMPÉTENCES ET CAPITAL HUMAIN"))
        assertTrue(part6.titleHt.contains("Edikasyon, Konpetans ak Kapital Imèn") || part6.titleHt.contains("EDIKASYON, KONPETANS AK KAPITAL IMEN"))
        assertEquals(15, part6.chapters.size)
        assertEquals("pp. 115–134", part6.plannedPages)

        val expectedIds = (77..91).map { "ch_6_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 77 — L'éducation comme fondation du développement numérique",
            "Chapitre 78 — L'autodidaxie et l'apprentissage continu",
            "Chapitre 79 — Former une nouvelle génération de développeurs haïtiens",
            "Chapitre 80 — Les compétences numériques essentielles",
            "Chapitre 81 — Apprendre à programmer avec des ressources limitées",
            "Chapitre 82 — L'intelligence artificielle comme outil d'apprentissage",
            "Chapitre 83 — AJ-EDU et les plateformes éducatives numériques",
            "Chapitre 84 — EDUKA et la transformation de l'éducation",
            "Chapitre 85 — EDH et la formation technologique en Haïti",
            "Chapitre 86 — Former au-delà du code",
            "Chapitre 87 — Certification, portfolio et employabilité",
            "Chapitre 88 — La transmission des connaissances",
            "Chapitre 89 — Former pour entreprendre et innover",
            "Chapitre 90 — Le capital humain haïtien face au monde",
            "Chapitre 91 — Une stratégie éducative AJ-TECH pour 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 77 + i
            val chapter = part6.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_6", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
        }

        // Vérification d'AJ-EDU
        val ch83 = part6.chapters[6]
        assertEquals("ch_6_83", ch83.id)
        assertTrue(ch83.titleFr.contains("AJ-EDU"))
        assertTrue(ch83.contentFr.contains("CONCEPT / EN DÉVELOPPEMENT INITIAL"))

        // Vérification de la stricte dénomination d'EDUKA et EDH
        val ch84 = part6.chapters[7]
        assertEquals("ch_6_84", ch84.id)
        assertTrue(ch84.titleFr.contains("EDUKA"))
        assertFalse("EDUKA ne doit jamais avoir de préfixe AJ-", ch84.titleFr.contains("AJ-EDUKA"))
        assertTrue(ch84.contentFr.contains("CONCEPT / PROTOTYPE EN CONCEPTION"))

        val ch85 = part6.chapters[8]
        assertEquals("ch_6_85", ch85.id)
        assertTrue(ch85.titleFr.contains("EDH"))
        assertFalse("EDH ne doit jamais avoir de préfixe AJ-", ch85.titleFr.contains("AJ-EDH"))
        assertTrue(ch85.contentFr.contains("CONCEPT"))

        // Vérification du trilinguisme et de la devise
        val ch90 = part6.chapters[13]
        assertEquals("ch_6_90", ch90.id)
        assertTrue(ch90.contentFr.contains("L'innovation haïtienne au service du monde"))
        assertTrue(ch90.contentHt.contains("Inovasyon ayisyen nan sèvis lemonn"))

        // Vérification de la feuille de route décennale
        val ch91 = part6.chapters[14]
        assertEquals("ch_6_91", ch91.id)
        assertTrue(ch91.contentFr.contains("2026–2027"))
        assertTrue(ch91.contentFr.contains("2034–2035"))
    }

    @Test
    fun testBookRepository_part7ContainsAll15ChaptersBilingualAndSecurityIntegrity() {
        val part7 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_7" }
        assertNotNull("Partie VII doit exister dans le BookRepository", part7)
        assertEquals("PARTIE VII — Sécurité, souveraineté numérique et confiance", part7!!.titleFr)
        assertEquals("PATI VII — Sekirite, Souvènte Nimerik ak Konfyans", part7.titleHt)
        assertEquals(15, part7.chapters.size)

        val expectedIds = (92..106).map { "ch_7_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 92 — La sécurité comme fondation de la confiance",
            "Chapitre 93 — Comprendre les menaces numériques",
            "Chapitre 94 — La sécurité dès la conception",
            "Chapitre 95 — Protection des données personnelles",
            "Chapitre 96 — Vie privée et responsabilité numérique",
            "Chapitre 97 — Authentification et gestion des identités",
            "Chapitre 98 — Chiffrement et protection des communications",
            "Chapitre 99 — Sécurité des applications et des API",
            "Chapitre 100 — Résilience face aux réseaux instables",
            "Chapitre 101 — Sécurité dans une architecture Offline-First",
            "Chapitre 102 — Souveraineté des données et infrastructures",
            "Chapitre 103 — Vers une souveraineté numérique haïtienne",
            "Chapitre 104 — Éthique, confiance et gouvernance numérique",
            "Chapitre 105 — Préparer AJ-TECH aux risques futurs",
            "Chapitre 106 — Une culture de sécurité pour 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 92 + i
            val chapter = part7.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_7", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
        }

        // Vérifications de souveraineté et transparence
        val ch101 = part7.chapters.find { it.id == "ch_7_101" }!!
        assertTrue(ch101.contentFr.contains("Offline-First"))

        val ch102 = part7.chapters.find { it.id == "ch_7_102" }!!
        assertTrue(ch102.contentFr.contains("AJ-Cloud"))
        assertTrue(ch102.contentFr.contains("ne possède actuellement aucun centre de données"))

        val ch104 = part7.chapters.find { it.id == "ch_7_104" }!!
        assertTrue(ch104.contentFr.contains("Responsible Disclosure"))
        assertTrue(ch104.contentFr.contains("🟢 Opérationnel"))

        val ch106 = part7.chapters.find { it.id == "ch_7_106" }!!
        assertTrue(ch106.contentFr.contains("2026–2027"))
        assertTrue(ch106.contentFr.contains("2031–2035"))
    }

    @Test
    fun testBookRepository_part8ContainsAll15ChaptersBilingualAndAiIntegrity() {
        val part8 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_8" }
        assertNotNull("Partie VIII doit exister dans le BookRepository", part8)
        assertEquals("PARTIE VIII — INTELLIGENCE ARTIFICIELLE, INNOVATION ET AVENIR", part8!!.titleFr)
        assertEquals("PATI VIII — ENTÈLIJANS ATIFISYÈL, INOVASYON AK LAVNI", part8.titleHt)
        assertEquals(15, part8.chapters.size)

        val expectedIds = (107..121).map { "ch_8_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 107 — L’intelligence artificielle au service d’Haïti",
            "Chapitre 108 — Comprendre l’intelligence artificielle",
            "Chapitre 109 — IA générative et création numérique",
            "Chapitre 110 — IA et automatisation des tâches",
            "Chapitre 111 — Données, modèles et qualité des résultats",
            "Chapitre 112 — Éthique et responsabilité de l’intelligence artificielle",
            "Chapitre 113 — IA, éducation et apprentissage",
            "Chapitre 114 — IA et développement des entreprises",
            "Chapitre 115 — IA dans l’écosystème AJ-TECH",
            "Chapitre 116 — AJ-Assistant et les assistants intelligents",
            "Chapitre 117 — IA, santé et innovation responsable",
            "Chapitre 118 — IA et inclusion numérique",
            "Chapitre 119 — Les limites et les risques de l’IA",
            "Chapitre 120 — Préparer Haïti à l’économie de l’IA",
            "Chapitre 121 — Stratégie IA AJ-TECH 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 107 + i
            val chapter = part8.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_8", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
        }

        // Vérification de la souveraineté et frugalité
        val ch115 = part8.chapters[8]
        assertTrue(ch115.contentFr.contains("On-Device") || ch115.contentFr.contains("Edge AI"))

        val ch116 = part8.chapters[9]
        assertTrue(ch116.contentFr.contains("AJ-Assistant"))

        val ch117 = part8.chapters[10]
        assertTrue(ch117.contentFr.contains("AJ-Bioklin"))

        val ch120 = part8.chapters[13]
        assertTrue(ch120.contentFr.contains("EDH"))

        // Vérification de la feuille de route 2026-2035
        val ch121 = part8.chapters[14]
        assertTrue(ch121.contentFr.contains("2026–2027"))
        assertTrue(ch121.contentFr.contains("2028–2030"))
        assertTrue(ch121.contentFr.contains("2031–2033"))
        assertTrue(ch121.contentFr.contains("2034–2035"))
    }

    @Test
    fun testBookRepository_part9ContainsAll15ChaptersBilingualAndInnovationIntegrity() {
        val part9 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_9" }
        assertNotNull("Partie IX doit exister dans le BookRepository", part9)
        assertEquals("PARTIE IX — INNOVATION, PRODUITS NUMÉRIQUES ET TRANSFORMATION DES SECTEURS", part9!!.titleFr)
        assertEquals("PATI IX — INOVASYON, PWODUI NIMERIK AK TRANSFÒMASYON SEKTÈ YO", part9.titleHt)
        assertEquals("Créer des solutions adaptées aux réalités haïtiennes et transformer les usages par la technologie", part9.subtitleFr)
        assertEquals("Kreye solisyon ki adapte ak reyalite Ayiti epi transfòme fason moun sèvi ak teknoloji", part9.subtitleHt)
        assertEquals("pp. 167–182", part9.plannedPages)
        assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, part9.status)
        assertEquals(15, part9.chapters.size)

        val expectedIds = (122..136).map { "ch_9_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 122 — Transformer les problèmes en solutions numériques",
            "Chapitre 123 — Concevoir des produits adaptés à Haïti",
            "Chapitre 124 — L’expérience utilisateur au cœur de l’innovation",
            "Chapitre 125 — Le mobile comme plateforme de transformation",
            "Chapitre 126 — Le commerce numérique et les nouveaux usages",
            "Chapitre 127 — Les services financiers numériques",
            "Chapitre 128 — La santé numérique et l’innovation responsable",
            "Chapitre 129 — L’éducation numérique comme levier de transformation",
            "Chapitre 130 — Les villes, les cartes et les données territoriales",
            "Chapitre 131 — Les médias, la culture et la création numérique",
            "Chapitre 132 — L’entrepreneuriat numérique et les petites entreprises",
            "Chapitre 133 — Les plateformes et les effets de réseau",
            "Chapitre 134 — Interopérabilité et écosystèmes numériques",
            "Chapitre 135 — Mesurer l’impact réel de l’innovation",
            "Chapitre 136 — Construire l’innovation AJ-TECH 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 122 + i
            val chapter = part9.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_9", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
            assertTrue("Sous-titre FR non vide ch $chapterNumber", chapter.subtitleFr.isNotBlank())
            assertTrue("Sous-titre HT non vide ch $chapterNumber", chapter.subtitleHt.isNotBlank())
            assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, chapter.status)
        }

        // Vérification pagination globale
        assertEquals(167, part9.chapters.first().plannedStartPage)
        assertEquals(182, part9.chapters.last().plannedEndPage)

        // Vérification indépendance EDH et EDUKA (sans préfixe AJ-)
        val ch129 = part9.chapters.first { it.id == "ch_9_129" }
        assertTrue(ch129.contentFr.contains("EDUKA"))
        assertTrue(ch129.contentFr.contains("EDH"))
        assertFalse(ch129.contentFr.contains("AJ-EDUKA"))
        assertFalse(ch129.contentFr.contains("AJ-EDH"))

        // Vérification santé responsable AJ-Bioklin (non substitut au médecin)
        val ch128 = part9.chapters.first { it.id == "ch_9_128" }
        assertTrue(ch128.contentFr.contains("AJ-Bioklin"))
        assertTrue(ch128.contentFr.contains("ne pose aucun diagnostic clinique automatisé"))

        // Vérification transparence services financiers et cartographiques
        val ch127 = part9.chapters.first { it.id == "ch_9_127" }
        assertTrue(ch127.contentFr.contains("AJ-Pay") && ch127.contentFr.contains("AJ-Wallet"))
        assertTrue(ch127.contentFr.contains("ne prétend en aucun cas opérer comme un établissement de crédit"))

        val ch130 = part9.chapters.first { it.id == "ch_9_130" }
        assertTrue(ch130.contentFr.contains("AJ-Maps"))
        assertTrue(ch130.contentFr.contains("projet en phase d'étude méthodologique"))

        // Vérification feuille de route innovation 2026–2035 avec les 4 phases
        val ch136 = part9.chapters.first { it.id == "ch_9_136" }
        assertTrue(ch136.contentFr.contains("Phase 1 (2026–2027)"))
        assertTrue(ch136.contentFr.contains("Phase 2 (2028–2030)"))
        assertTrue(ch136.contentFr.contains("Phase 3 (2031–2033)"))
        assertTrue(ch136.contentFr.contains("Phase 4 (2034–2035)"))
        assertTrue(ch136.contentFr.contains("L'innovation haïtienne au service du monde"))
        assertTrue(ch136.contentFr.contains("Vision, Technologie et Avenir"))
    }

    @Test
    fun testBookRepository_part9NavigationContinuity() {
        val repo = com.aistudio.ajtech.ecosystem.data.repository.BookRepository

        // Transition ch_8_121 -> ch_9_122
        val nextAfter121 = repo.getNextChapter("ch_8_121")
        assertNotNull("Chapitre suivant de ch_8_121 doit exister", nextAfter121)
        assertEquals("ch_9_122", nextAfter121!!.id)

        val prevBefore122 = repo.getPreviousChapter("ch_9_122")
        assertNotNull("Chapitre précédent de ch_9_122 doit exister", prevBefore122)
        assertEquals("ch_8_121", prevBefore122!!.id)

        // Navigation séquentielle interne ch_9_122 -> ... -> ch_9_136
        for (i in 122 until 136) {
            val currentId = "ch_9_$i"
            val nextExpectedId = "ch_9_${i + 1}"

            val nextCh = repo.getNextChapter(currentId)
            assertNotNull("Suivant de $currentId doit exister", nextCh)
            assertEquals("Suivant de $currentId doit être $nextExpectedId", nextExpectedId, nextCh!!.id)

            val prevCh = repo.getPreviousChapter(nextExpectedId)
            assertNotNull("Précédent de $nextExpectedId doit exister", prevCh)
            assertEquals("Précédent de $nextExpectedId doit être $currentId", currentId, prevCh!!.id)
        }

        // Transition ch_9_136 -> ch_10_137
        val nextAfter136 = repo.getNextChapter("ch_9_136")
        assertNotNull("Chapitre suivant de ch_9_136 doit exister", nextAfter136)
        assertEquals("ch_10_137", nextAfter136!!.id)

        val prevBefore137 = repo.getPreviousChapter("ch_10_137")
        assertNotNull("Chapitre précédent de ch_10_137 doit exister", prevBefore137)
        assertEquals("ch_9_136", prevBefore137!!.id)
    }

    @Test
    fun testBookRepository_part9SearchKeywordsFrenchAndCreole() {
        val repo = com.aistudio.ajtech.ecosystem.data.repository.BookRepository

        val frenchKeywords = listOf(
            "innovation numérique",
            "expérience utilisateur",
            "commerce numérique",
            "inclusion financière",
            "interopérabilité",
            "impact",
            "transformation numérique"
        )

        val creoleKeywords = listOf(
            "inovasyon",
            "eksperyans itilizatè",
            "komès nimerik",
            "finans",
            "entèoperabilite",
            "enpak",
            "transfòmasyon nimerik"
        )

        for (kw in frenchKeywords) {
            val results = repo.searchBook(kw, com.aistudio.ajtech.ecosystem.data.model.BookLanguage.FRENCH)
            assertTrue("Recherche FR pour '$kw' doit retourner au moins un résultat", results.isNotEmpty())
            val foundInPart9 = results.any { it.partId == "part_9" }
            assertTrue("Recherche FR pour '$kw' doit trouver un chapitre de part_9", foundInPart9)
        }

        for (kw in creoleKeywords) {
            val results = repo.searchBook(kw, com.aistudio.ajtech.ecosystem.data.model.BookLanguage.KREYOL)
            assertTrue("Recherche HT pou '$kw' dwe bay omwen yon rezilta", results.isNotEmpty())
            val foundInPart9 = results.any { it.partId == "part_9" }
            assertTrue("Recherche HT pou '$kw' dwe jwenn yon chapit nan part_9", foundInPart9)
        }
    }

    @Test
    fun testBookRepository_part10ContainsAll15ChaptersBilingualAndInternationalIntegrity() {
        val repo = com.aistudio.ajtech.ecosystem.data.repository.BookRepository
        val part10 = repo.parts.find { it.id == "part_10" }
        assertNotNull("Partie X doit exister dans le BookRepository", part10)
        assertEquals("PARTIE X — DIASPORA, RAYONNEMENT INTERNATIONAL ET EXPANSION", part10!!.titleFr)
        assertEquals("PATI X — DYASPORA, RAYONNMAN ENTÈNASYONAL AK EKSPANSYON", part10.titleHt)
        assertEquals("Construire des ponts entre Haïti, sa diaspora et le monde par la technologie", part10.subtitleFr)
        assertEquals("Konstwi pon ant Ayiti, dyaspora li ak lemonn atravè teknoloji", part10.subtitleHt)
        assertEquals("pp. 183–198", part10.plannedPages)
        assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, part10.status)
        assertEquals(15, part10.chapters.size)

        val expectedIds = (137..151).map { "ch_10_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 137 — Haïti et le potentiel d’un écosystème numérique ouvert",
            "Chapitre 138 — La diaspora haïtienne comme force technologique",
            "Chapitre 139 — Connecter les talents haïtiens du monde",
            "Chapitre 140 — Le travail numérique sans frontières",
            "Chapitre 141 — Exporter le savoir-faire technologique haïtien",
            "Chapitre 142 — Construire des produits pensés pour plusieurs marchés",
            "Chapitre 143 — Le bilinguisme et le multilinguisme comme avantage",
            "Chapitre 144 — Coopération technologique et partenariats responsables",
            "Chapitre 145 — Capital, financement et croissance internationale",
            "Chapitre 146 — Souveraineté et ouverture au monde",
            "Chapitre 147 — Standards internationaux et identité haïtienne",
            "Chapitre 148 — La marque AJ-TECH au-delà d’Haïti",
            "Chapitre 149 — Construire une communauté technologique haïtienne mondiale",
            "Chapitre 150 — Vers un écosystème numérique haïtien connecté au monde",
            "Chapitre 151 — Vision internationale AJ-TECH 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 137 + i
            val chapter = part10.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_10", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
            assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, chapter.status)
        }

        // Vérification des entités d'éducation sans préfixe AJ-
        val ch138 = part10.chapters[1]
        assertTrue(ch138.contentFr.contains("EDH et la plateforme éducative EDUKA"))
        assertFalse(ch138.contentFr.contains("AJ-EDUKA"))
        assertFalse(ch138.contentFr.contains("AJ-EDH"))

        val ch149 = part10.chapters[12]
        assertTrue(ch149.contentFr.contains("EDH et de la plateforme EDUKA"))
        assertFalse(ch149.contentFr.contains("AJ-EDUKA"))
        assertFalse(ch149.contentFr.contains("AJ-EDH"))

        // Vérification Chapitre 151 (4 phases, slogan, devise, posture)
        val ch151 = part10.chapters[14]
        assertTrue(ch151.contentFr.contains("Phase 1 (2026–2027)"))
        assertTrue(ch151.contentFr.contains("Phase 2 (2028–2030)"))
        assertTrue(ch151.contentFr.contains("Phase 3 (2031–2033)"))
        assertTrue(ch151.contentFr.contains("Phase 4 (2034–2035)"))
        assertTrue(ch151.contentHt.contains("Faz 1 (2026–2027)"))
        assertTrue(ch151.contentHt.contains("Faz 2 (2028–2030)"))
        assertTrue(ch151.contentHt.contains("Faz 3 (2031–2033)"))
        assertTrue(ch151.contentHt.contains("Faz 4 (2034–2035)"))

        assertTrue(ch151.contentFr.contains("Vision, Technologie et Avenir"))
        assertTrue(ch151.contentFr.contains("L’innovation haïtienne au service du monde"))
        assertTrue(ch151.contentFr.contains("Une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet"))
        assertTrue(ch151.contentHt.contains("Vizyon, Teknoloji ak Lavni"))
        assertTrue(ch151.contentHt.contains("Inovasyon ayisyen an nan sèvis lemonn"))
        assertTrue(ch151.contentHt.contains("Yon antrepriz ki gen gwo anbisyon k ap bati ti pa ti pa epi k ap ekri tout verite sou wout li pou rive nan somè a"))

        // Navigation bidirectionnelle
        val prev137 = repo.getPreviousChapter("ch_10_137")
        assertNotNull("ch_10_137 doit avoir un précédent", prev137)
        assertEquals("ch_9_136", prev137!!.id)

        val next136 = repo.getNextChapter("ch_9_136")
        assertNotNull("ch_9_136 doit mener à ch_10_137", next136)
        assertEquals("ch_10_137", next136!!.id)

        for (i in 137..150) {
            val currId = "ch_10_$i"
            val nextExpectedId = "ch_10_${i + 1}"
            val next = repo.getNextChapter(currId)
            assertNotNull("$currId doit avoir un suivant", next)
            assertEquals(nextExpectedId, next!!.id)

            val prevOfNext = repo.getPreviousChapter(nextExpectedId)
            assertNotNull("$nextExpectedId doit avoir un précédent", prevOfNext)
            assertEquals(currId, prevOfNext!!.id)
        }

        val next151 = repo.getNextChapter("ch_10_151")
        assertNotNull("ch_10_151 doit mener à ch_11_152", next151)
        assertEquals("ch_11_152", next151!!.id)

        val prev152 = repo.getPreviousChapter("ch_11_152")
        assertNotNull("ch_11_152 doit avoir pour précédent ch_10_151", prev152)
        assertEquals("ch_10_151", prev152!!.id)

        // Recherche multilingue (FR et HT)
        val frKeywords = listOf(
            "diaspora",
            "international",
            "travail numérique",
            "exportation",
            "multilinguisme",
            "souveraineté",
            "standards",
            "communauté technologique"
        )
        for (kw in frKeywords) {
            val results = repo.searchBook(kw, com.aistudio.ajtech.ecosystem.data.model.BookLanguage.FRENCH)
            assertTrue("Recherche FR pour '$kw' doit retourner au moins un résultat", results.isNotEmpty())
            val foundInPart10 = results.any { it.partId == "part_10" }
            assertTrue("Recherche FR pour '$kw' doit trouver un chapitre de part_10", foundInPart10)
        }

        val htKeywords = listOf(
            "dyaspora",
            "entènasyonal",
            "travay nimerik",
            "ekspòte",
            "miltilengwis",
            "souvènte",
            "nòm",
            "kominote teknolojik"
        )
        for (kw in htKeywords) {
            val results = repo.searchBook(kw, com.aistudio.ajtech.ecosystem.data.model.BookLanguage.KREYOL)
            assertTrue("Recherche HT pou '$kw' dwe bay omwen yon rezilta", results.isNotEmpty())
            val foundInPart10 = results.any { it.partId == "part_10" }
            assertTrue("Recherche HT pou '$kw' dwe jwenn yon chapit nan part_10", foundInPart10)
        }

        // Test format de partage conforme
        val shareSample = """
            « ${ch151.titleFr} »
            « ${ch151.titleHt} »
            
            ${ch151.summaryFr}
            
            ${ch151.contentFr}
            
            — Extrait officiel du livre : AJ-TECH — L'Écosystème Numérique Haïtien (Jonathan Germain)
            « L’innovation haïtienne au service du monde »
        """.trimIndent()
        assertTrue(shareSample.contains(ch151.titleFr))
        assertTrue(shareSample.contains(ch151.titleHt))
        assertTrue(shareSample.contains(ch151.summaryFr))
        assertTrue(shareSample.contains("AJ-TECH — L'Écosystème Numérique Haïtien"))
        assertTrue(shareSample.contains("« L’innovation haïtienne au service du monde »"))
    }

    @Test
    fun testBookRepository_part11ContainsAll15RemainingChaptersBilingualAndVisionIntegrity() {
        val part11 = requireNotNull(com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_11" }) {
            "Partie XI doit exister dans le BookRepository"
        }
        assertEquals("PARTIE XI — HORIZON 2035 : CONSTRUIRE L’AVENIR NUMÉRIQUE HAÏTIEN", part11.titleFr)
        assertEquals("PATI XI — ORIZON 2035 : KONSTWI LAVNI NIMERIK AYITI", part11.titleHt)
        assertEquals("Vision, héritage, gouvernance et feuille de route vers un écosystème technologique durable", part11.subtitleFr)
        assertEquals("Vizyon, eritaj, gouvènans ak plan estratejik pou yon ekosistèm teknolojik dirab", part11.subtitleHt)
        assertEquals("pp. 199–214", part11.plannedPages)
        assertEquals(com.aistudio.ajtech.ecosystem.data.model.BookContentStatus.IN_PROGRESS, part11.status)
        assertEquals(15, part11.chapters.size)

        val expectedIds = (152..166).map { "ch_11_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 152 — La vision AJ-TECH à l’horizon 2035",
            "Chapitre 153 — Construire sur les fondations de 2026",
            "Chapitre 154 — Une technologie pensée pour les réalités haïtiennes",
            "Chapitre 155 — Frugalité, efficacité et innovation durable",
            "Chapitre 156 — Gouverner un écosystème technologique",
            "Chapitre 157 — La confiance comme infrastructure invisible",
            "Chapitre 158 — Le capital humain au centre du projet",
            "Chapitre 159 — Former, transmettre et créer une relève",
            "Chapitre 160 — Une économie numérique au service de la société",
            "Chapitre 161 — Haïti dans la compétition technologique mondiale",
            "Chapitre 162 — La diaspora et les générations futures",
            "Chapitre 163 — L’héritage technologique que nous voulons laisser",
            "Chapitre 164 — Les risques, les échecs et les leçons du chemin",
            "Chapitre 165 — Feuille de route AJ-TECH 2026–2035",
            "Chapitre 166 — L’avenir reste à construire"
        )

        for (i in 0 until 15) {
            val chapterNumber = 152 + i
            val chapter = part11.chapters[i]
            val expectedId = expectedIds[i]
            val expectedTitleFr = expectedTitlesFr[i]

            assertEquals("Chapter ID mismatch at index $i", expectedId, chapter.id)
            assertEquals("Chapter number mismatch at index $i", chapterNumber, chapter.chapterNumber)
            assertEquals("part_11", chapter.partId)
            assertEquals(expectedTitleFr, chapter.titleFr)
            assertTrue("Titre HT du chapitre $chapterNumber doit débuter par 'Chapit $chapterNumber'", chapter.titleHt.startsWith("Chapit $chapterNumber"))

            // Validation de la non-vacuité du contenu bilingue
            assertTrue("FR non vide ch $chapterNumber", chapter.contentFr.isNotBlank())
            assertTrue("HT non vide ch $chapterNumber", chapter.contentHt.isNotBlank())
            assertTrue("Résumé FR non vide ch $chapterNumber", chapter.summaryFr.isNotBlank())
            assertTrue("Résumé HT non vide ch $chapterNumber", chapter.summaryHt.isNotBlank())
        }

        // Vérification entités formation dans ch159
        val ch159 = part11.chapters[7]
        assertTrue(ch159.contentFr.contains("EDH") && ch159.contentFr.contains("EDUKA"))
        assertFalse(ch159.contentFr.contains("AJ-EDUKA"))
        assertFalse(ch159.contentFr.contains("AJ-EDH"))

        // Vérification jalons 2035 dans ch165
        val ch165 = part11.chapters[13]
        assertTrue(ch165.contentFr.contains("2026–2027"))
        assertTrue(ch165.contentFr.contains("2028–2030"))
        assertTrue(ch165.contentFr.contains("2031–2033"))
        assertTrue(ch165.contentFr.contains("2034–2035"))
        assertTrue(ch165.contentFr.contains("entreprise ambitieuse en construction", ignoreCase = true))

        // Vérification devise et slogan dans ch152 et ch165
        val ch152 = part11.chapters[0]
        assertTrue(ch152.contentFr.contains("L'innovation haïtienne au service du monde"))
        assertTrue(ch152.contentHt.contains("Inovasyon ayisyen an nan sèvis lemonn"))

        // Vérification conclusion et message jeunesse dans ch166
        val ch166 = part11.chapters[14]
        assertTrue(ch166.contentFr.contains("Nous sommes forts, nous avons beaucoup de capacités. Continuons de lutter pour arriver au sommet. Rien n'est facile sans le travail. Merci aux jeunes Haïtiens."))
        assertTrue(ch166.contentHt.contains("Nou fò, nou gen anpil kapasite. Ann kontinye goumen pou n rive nan somè a. Anyen pa fasil san travay. Mèsi ak jèn Ayisyen yo."))

        // Vérification du nombre total de chapitres principaux (166 chapitres dans les Parties I à XI)
        val allMainChapters = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts
            .filter { it.type == com.aistudio.ajtech.ecosystem.data.model.PartType.MAIN_PART }
            .flatMap { it.chapters }
        assertEquals(166, allMainChapters.size)

        // Vérification de la navigation : ch_10_151 -> ch_11_152 -> ... -> ch_11_166 -> null
        val nextAfter151 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.getNextChapter("ch_10_151")
        assertNotNull(nextAfter151)
        assertEquals("ch_11_152", nextAfter151?.id)

        val prevBefore152 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.getPreviousChapter("ch_11_152")
        assertNotNull(prevBefore152)
        assertEquals("ch_10_151", prevBefore152?.id)

        val nextAfter166 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.getNextChapter("ch_11_166")
        assertNotNull("Le chapitre 166 doit être suivi de l'annexe 1", nextAfter166)
        assertEquals("annex_1_fiche_technique", nextAfter166?.id)

        val nextAfterAnnex1 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.getNextChapter("annex_1_fiche_technique")
        assertNotNull("L'annexe 1 doit être suivie du glossaire", nextAfterAnnex1)
        assertEquals("annex_2_glossaire", nextAfterAnnex1?.id)

        val nextAfterAnnex2 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.getNextChapter("annex_2_glossaire")
        assertNull("L'annexe 2 est la dernière section du livre (p. 218)", nextAfterAnnex2)

        // Structure globale : 7 liminaires + 166 chapitres principaux + 2 annexes = 175 sections
        assertEquals(175, com.aistudio.ajtech.ecosystem.data.repository.BookRepository.allChapters.size)
    }
}

