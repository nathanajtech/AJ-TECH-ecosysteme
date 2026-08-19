package com.aistudio.ajtech.ecosystem

import android.content.Intent
import android.os.Build
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.aistudio.ajtech.ecosystem.data.model.EntityStatus
import com.aistudio.ajtech.ecosystem.data.repository.EcosystemRepository
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
        assertEquals(21, allEntities.size)

        val operationalCount = allEntities.count { it.status == EntityStatus.OPERATIONAL }
        val devCount = allEntities.count { it.status == EntityStatus.IN_DEVELOPMENT }
        val conceptCount = allEntities.count { it.status == EntityStatus.CONCEPT }
        val plannedCount = allEntities.count { it.status == EntityStatus.PLANNED }

        assertEquals(21, operationalCount + devCount + conceptCount + plannedCount)

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

        // Vérification de la mission officielle (Ch 14)
        val ch14 = part2.chapters[1]
        assertTrue(ch14.contentFr.contains("mettre Haïti sur l'échelle mondiale dans la technologie et de faciliter l'accès de tous à la technologie"))
        assertTrue(ch14.contentHt.contains("mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji a"))

        // Vérification de la vision officielle (Ch 15)
        val ch15 = part2.chapters[2]
        assertTrue(ch15.contentFr.contains("Devenir un géant de la technologie"))
        assertTrue(ch15.contentHt.contains("Vin tounen yon jeyan nan teknoloji"))

        // Vérification du positionnement / devise (Ch 19)
        val ch19 = part2.chapters[6]
        assertTrue(ch19.contentFr.contains("L'innovation haïtienne au service du monde"))

        // Vérification de la posture d'ambition en construction (Ch 22)
        val ch22 = part2.chapters[9]
        assertTrue(ch22.contentFr.contains("entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet", ignoreCase = true))

        // Vérification du message d'encouragement aux jeunes (Ch 24)
        val ch24 = part2.chapters[11]
        assertTrue(ch24.contentFr.contains("Nous sommes forts, nous avons beaucoup de capacités. Continuons de lutter pour arriver au sommet. Rien n'est facile sans le travail. Merci aux jeunes Haïtiens."))
        assertTrue(ch24.contentHt.contains("Nou fò, nou gen anpil kapasite. Ann kontinye goumen pou nou rive nan somè a. Anyen pa fasil san travay. Mèsi ak jèn Ayisyen yo."))
    }

    @Test
    fun testBookRepository_part3ContainsAll21EntitiesWith18RubricsBilingual() {
        val part3 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_3" }
        assertNotNull("Partie III doit exister dans le BookRepository", part3)
        assertEquals("PARTIE III — LES 21 ENTITÉS DE L'ÉCOSYSTÈME AJ-", part3!!.titleFr)
        assertEquals("PATI III — 21 ANTITE KI NAN EKOSISTÈM AJ- LA", part3.titleHt)
        assertEquals(21, part3.chapters.size)

        val expectedNames = listOf(
            "AJ-TECH", "AJ-Task", "AJ-Tè", "AJ-Learn", "AJ-Pay", "AJ-Wallet",
            "AJ-Chat", "AJ-Cloud", "AJ-Meet", "AJ-Mail", "AJ-Studio", "AJ-Dev",
            "AJ-Maps", "AJ-Fondation Biz", "AJ-Commerce", "AJ-MathQuest", "AJ-Bioklin",
            "AJ-Fitness", "AJ-Assistant", "EDUKA", "EDH"
        )

        val expectedIds = listOf(
            "ch_3_25", "ch_3_26", "ch_3_27", "ch_3_28", "ch_3_29", "ch_3_30",
            "ch_3_31", "ch_3_32", "ch_3_33", "ch_3_34", "ch_3_35", "ch_3_36",
            "ch_3_37", "ch_3_38", "ch_3_39", "ch_3_40", "ch_3_41", "ch_3_42",
            "ch_3_43", "ch_3_44", "ch_3_45"
        )

        for (i in 0 until 21) {
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

        val edukaCh = part3.chapters[19]
        assertTrue(edukaCh.contentFr.contains("CONCEPT / EN CONCEPTION"))

        val ajTeCh = part3.chapters[2]
        assertTrue(ajTeCh.contentFr.contains("CONCEPT"))
    }

    @Test
    fun testBookRepository_part4ContainsAll15ChaptersBilingualAndArchitectureValidation() {
        val part4 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_4" }
        assertNotNull("Partie IV doit exister dans le BookRepository", part4)
        assertEquals("PARTIE IV — ARCHITECTURE TECHNOLOGIQUE", part4!!.titleFr)
        assertEquals("PATI IV — ACHITEKTI TEKNOLOJIK", part4.titleHt)
        assertEquals(15, part4.chapters.size)

        val expectedIds = (46..60).map { "ch_4_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 46 — L'architecture globale d'AJ-TECH",
            "Chapitre 47 — Kotlin et Jetpack Compose",
            "Chapitre 48 — Architecture MVVM",
            "Chapitre 49 — Données, modèles et repositories",
            "Chapitre 50 — Applications PWA et applications mobiles",
            "Chapitre 51 — Cloud, serveurs et infrastructure",
            "Chapitre 52 — Bases de données et persistance",
            "Chapitre 53 — API et interopérabilité",
            "Chapitre 54 — Intelligence artificielle dans l'écosystème",
            "Chapitre 55 — Sécurité applicative",
            "Chapitre 56 — Performance et optimisation",
            "Chapitre 57 — Accessibilité et expérience utilisateur",
            "Chapitre 58 — Tests, qualité et maintenance",
            "Chapitre 59 — Architecture évolutive 2026–2035",
            "Chapitre 60 — Vers une infrastructure technologique haïtienne"
        )

        for (i in 0 until 15) {
            val chapterNumber = 46 + i
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
        val ch46 = part4.chapters[0]
        assertTrue(ch46.contentFr.contains("com.aistudio.ajtech.ecosystem"))
        assertTrue(ch46.contentFr.contains("Kotlin"))
        assertTrue(ch46.contentFr.contains("Jetpack Compose"))
        assertTrue(ch46.contentFr.contains("MVVM"))

        val ch50 = part4.chapters[4]
        assertTrue(ch50.contentFr.contains("Progressive Web App"))
        assertTrue(ch50.contentFr.contains("AJ-Task"))

        val ch56 = part4.chapters[10]
        assertTrue(ch56.contentFr.contains("drawLine()"))
        assertTrue(ch56.contentFr.contains("LazyColumn"))
        assertTrue(ch56.contentFr.contains("remember"))

        val ch57 = part4.chapters[11]
        assertTrue(ch57.contentFr.contains("48dp"))
        assertTrue(ch57.contentFr.contains("contentDescription"))
        assertTrue(ch57.contentFr.contains("TalkBack"))

        val ch58 = part4.chapters[12]
        assertTrue(ch58.contentFr.contains("Robolectric"))

        val ch59 = part4.chapters[13]
        assertTrue(ch59.contentFr.contains("2026"))
        assertTrue(ch59.contentFr.contains("2035"))

        val ch60 = part4.chapters[14]
        assertTrue(ch60.contentFr.contains("haïtienne"))
    }

    @Test
    fun testBookRepository_part5ContainsAll15ChaptersBilingualAndEconomicTransparency() {
        val part5 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_5" }
        assertNotNull("Partie V doit exister dans le BookRepository", part5)
        assertEquals("PARTIE V — ÉCONOMIE, ENTREPRENEURIAT ET MODÈLE D'AFFAIRES", part5!!.titleFr)
        assertEquals("PATI V — EKONOMI, ANTREPRENARYA AK MODÈL BIZNIS", part5.titleHt)
        assertEquals(15, part5.chapters.size)

        val expectedIds = (61..75).map { "ch_5_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 61 — L'économie numérique et Haïti",
            "Chapitre 62 — Pourquoi créer des entreprises technologiques en Haïti",
            "Chapitre 63 — Le modèle économique d'AJ-TECH",
            "Chapitre 64 — Produits, services et modèles de revenus",
            "Chapitre 65 — AJ-Commerce et le commerce numérique",
            "Chapitre 66 — AJ-Pay et les paiements numériques",
            "Chapitre 67 — AJ-Wallet et les services financiers numériques",
            "Chapitre 68 — L'entrepreneuriat technologique haïtien",
            "Chapitre 69 — La diaspora comme force économique",
            "Chapitre 70 — Emploi, compétences et création de valeur",
            "Chapitre 71 — Financement et croissance",
            "Chapitre 72 — Partenariats et écosystème d'affaires",
            "Chapitre 73 — Confiance, transparence et gouvernance",
            "Chapitre 74 — Expansion régionale et internationale",
            "Chapitre 75 — La stratégie économique 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 61 + i
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
        val ch63 = part5.chapters[2]
        assertTrue(ch63.contentFr.contains("Bootstrapping"))
        assertTrue(ch63.contentFr.contains("aucun produit commercialisé"))

        val ch65 = part5.chapters[4]
        assertTrue(ch65.contentFr.contains("Non commercialisé"))

        val ch66 = part5.chapters[5]
        assertTrue(ch66.contentFr.contains("Banque de la République d'Haïti"))
        assertTrue(ch66.contentFr.contains("MonCash"))

        val ch67 = part5.chapters[6]
        assertTrue(ch67.contentFr.contains("n'est pas une banque"))

        val ch71 = part5.chapters[10]
        assertTrue(ch71.contentFr.contains("fonds propres"))

        val ch74 = part5.chapters[13]
        assertTrue(ch74.contentFr.contains("ambition stratégique"))

        val ch75 = part5.chapters[14]
        assertTrue(ch75.contentFr.contains("2026–2027"))
        assertTrue(ch75.contentFr.contains("2034–2035"))
    }

    @Test
    fun testBookRepository_part6ContainsAll15ChaptersBilingualAndEducationIntegrity() {
        val part6 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_6" }
        assertNotNull("Partie VI doit exister dans le BookRepository", part6)
        assertEquals("PARTIE VI — ÉDUCATION, COMPÉTENCES ET CAPITAL HUMAIN", part6!!.titleFr)
        assertEquals("PATI VI — EDIKASYON, KONPETANS AK KAPITAL IMEN", part6.titleHt)
        assertEquals(15, part6.chapters.size)

        val expectedIds = (76..90).map { "ch_6_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 76 — L'éducation numérique en Haïti",
            "Chapitre 77 — EDUKA : une vision pour l'éducation",
            "Chapitre 78 — EDH : l'École Du Digital d'Haïti",
            "Chapitre 79 — Apprendre à programmer",
            "Chapitre 80 — La formation professionnelle numérique",
            "Chapitre 81 — L'autodidaxie et l'apprentissage par la pratique",
            "Chapitre 82 — Intelligence artificielle et éducation",
            "Chapitre 83 — La jeunesse haïtienne et le numérique",
            "Chapitre 84 — La diaspora et le transfert de compétences",
            "Chapitre 85 — Former les créateurs de demain",
            "Chapitre 86 — Inclusion numérique et égalité des chances",
            "Chapitre 87 — Langues, culture et technologie",
            "Chapitre 88 — Créer une génération de développeurs haïtiens",
            "Chapitre 89 — Éducation, innovation et entrepreneuriat",
            "Chapitre 90 — La stratégie éducative 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 76 + i
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

        // Vérification de la stricte dénomination d'EDUKA et EDH
        val ch77 = part6.chapters[1]
        assertTrue(ch77.titleFr.contains("EDUKA"))
        assertFalse("EDUKA ne doit jamais avoir de préfixe AJ-", ch77.titleFr.contains("AJ-EDUKA"))
        assertTrue(ch77.contentFr.contains("CONCEPT / EN CONCEPTION"))

        val ch78 = part6.chapters[2]
        assertTrue(ch78.titleFr.contains("EDH"))
        assertFalse("EDH ne doit jamais avoir de préfixe AJ-", ch78.titleFr.contains("AJ-EDH"))
        assertTrue(ch78.contentFr.contains("CONCEPT"))

        // Vérification du message pour la jeunesse haïtienne
        val ch83 = part6.chapters[7]
        assertTrue(ch83.contentFr.contains("Nous sommes forts, nous avons beaucoup de capacités"))
        assertTrue(ch83.contentFr.contains("Merci aux jeunes Haïtiens"))
        assertTrue(ch83.contentHt.contains("Nou fò, nou gen anpil kapasite"))
        assertTrue(ch83.contentHt.contains("Mèsi ak jèn Ayisyen yo"))

        // Vérification du trilinguisme et de la feuille de route
        val ch87 = part6.chapters[11]
        assertTrue(ch87.contentFr.contains("Kreyòl Ayisyen"))
        assertTrue(ch87.contentFr.contains("Français"))
        assertTrue(ch87.contentFr.contains("Anglais"))

        val ch90 = part6.chapters[14]
        assertTrue(ch90.contentFr.contains("2026–2027"))
        assertTrue(ch90.contentFr.contains("2034–2035"))
    }

    @Test
    fun testBookRepository_part7ContainsAll15ChaptersBilingualAndSecurityIntegrity() {
        val part7 = com.aistudio.ajtech.ecosystem.data.repository.BookRepository.parts.find { it.id == "part_7" }
        assertNotNull("Partie VII doit exister dans le BookRepository", part7)
        assertEquals("PARTIE VII — SÉCURITÉ, SOUVERAINETÉ NUMÉRIQUE ET CONFIANCE", part7!!.titleFr)
        assertEquals("PATI VII — SEKIRITE, SOUVRENETE NIMERIK AK KONFYANS", part7.titleHt)
        assertEquals(15, part7.chapters.size)

        val expectedIds = (91..105).map { "ch_7_$it" }
        val expectedTitlesFr = listOf(
            "Chapitre 91 — Pourquoi la sécurité numérique est essentielle",
            "Chapitre 92 — La souveraineté numérique d'Haïti",
            "Chapitre 93 — Protection des données personnelles",
            "Chapitre 94 — Identité numérique et authentification",
            "Chapitre 95 — Cybersécurité des applications",
            "Chapitre 96 — Sécurité des infrastructures et du cloud",
            "Chapitre 97 — Sécurité des paiements numériques",
            "Chapitre 98 — Protection des utilisateurs",
            "Chapitre 99 — Vie privée et responsabilité technologique",
            "Chapitre 100 — Intelligence artificielle et sécurité",
            "Chapitre 101 — Résilience numérique",
            "Chapitre 102 — Sensibilisation et culture de cybersécurité",
            "Chapitre 103 — Gouvernance et politiques numériques",
            "Chapitre 104 — Coopération internationale en cybersécurité",
            "Chapitre 105 — La stratégie de sécurité numérique 2026–2035"
        )

        for (i in 0 until 15) {
            val chapterNumber = 91 + i
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
        val ch92 = part7.chapters[1]
        assertTrue(ch92.contentFr.contains("ne possède actuellement aucune infrastructure"))

        val ch97 = part7.chapters[6]
        assertTrue(ch97.contentFr.contains("n'est pas une institution bancaire"))
        assertTrue(ch97.contentFr.contains("Banque de la République d'Haïti"))

        val ch101 = part7.chapters[10]
        assertTrue(ch101.contentFr.contains("Offline-First"))

        val ch103 = part7.chapters[12]
        assertTrue(ch103.contentFr.contains("audit de sécurité externe"))

        val ch105 = part7.chapters[14]
        assertTrue(ch105.contentFr.contains("2026–2027"))
        assertTrue(ch105.contentFr.contains("2034–2035"))
    }
}

