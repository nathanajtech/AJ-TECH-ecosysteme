package com.aistudio.ajtech.ecosystem

import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookLanguage
import com.aistudio.ajtech.ecosystem.data.model.PartType
import com.aistudio.ajtech.ecosystem.data.repository.BookRepository
import com.aistudio.ajtech.ecosystem.data.repository.EcosystemRepository
import com.aistudio.ajtech.ecosystem.data.repository.Part1Data
import com.aistudio.ajtech.ecosystem.data.repository.Part2Data
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun verifyPart1_has12ChaptersAndValidContent() {
        val part1 = Part1Data.part1
        assertEquals("part_1", part1.id)
        assertEquals(1, part1.partNumber)
        assertEquals(12, part1.chapters.size)

        part1.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 1
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_1", chapter.partId)
            assertTrue("Chapter $expectedNum title FR must not be blank", chapter.titleFr.isNotBlank())
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart2_hasExact12ChaptersAndMasterContent() {
        val part2 = Part2Data.part2
        assertEquals("part_2", part2.id)
        assertEquals(2, part2.partNumber)
        assertEquals(12, part2.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part2.status)
        assertTrue(part2.plannedPages.contains("31–46") || part2.plannedPages.contains("31-46"))

        val expectedTitlesFr = listOf(
            "Chapitre 13 — La philosophie d'AJ-TECH",
            "Chapitre 14 — L'innovation haïtienne au service du monde",
            "Chapitre 15 — La mission",
            "Chapitre 16 — La vision 2035",
            "Chapitre 17 — L'accessibilité technologique",
            "Chapitre 18 — La souveraineté numérique",
            "Chapitre 19 — L'éthique technologique",
            "Chapitre 20 — Le travail avant le prestige",
            "Chapitre 21 — L'apprentissage permanent",
            "Chapitre 22 — La jeunesse haïtienne",
            "Chapitre 23 — Construire avec les Haïtiens",
            "Chapitre 24 — Les valeurs fondamentales"
        )

        part2.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 13
            assertEquals("ch_2_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_2", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart2_SearchKeywords() {
        // « souveraineté » / « souverènte »
        val frSouverainete = BookRepository.searchBook("souveraineté", BookLanguage.FRENCH)
        assertTrue("FR search should find souveraineté", frSouverainete.any { it.chapterNumber == 18 })

        val htSouverente = BookRepository.searchBook("souverènte", BookLanguage.KREYOL)
        assertTrue("HT search should find souverènte", htSouverente.any { it.chapterNumber == 18 })

        // « transparence » / « transparans »
        val frTransparence = BookRepository.searchBook("transparence", BookLanguage.FRENCH)
        assertTrue("FR search should find transparence", frTransparence.any { it.chapterNumber in 13..24 })

        val htTransparans = BookRepository.searchBook("transparans", BookLanguage.KREYOL)
        assertTrue("HT search should find transparans", htTransparans.any { it.chapterNumber in 13..24 })

        // « jeunesse » / « jèn »
        val frJeunesse = BookRepository.searchBook("jeunesse", BookLanguage.FRENCH)
        assertTrue("FR search should find jeunesse", frJeunesse.any { it.chapterNumber == 22 })

        val htJen = BookRepository.searchBook("jèn", BookLanguage.KREYOL)
        assertTrue("HT search should find jèn", htJen.any { it.chapterNumber == 22 })

        // « innovation » / « inovasyon »
        val frInnovation = BookRepository.searchBook("innovation", BookLanguage.FRENCH)
        assertTrue("FR search should find innovation", frInnovation.any { it.chapterNumber == 14 })

        val htInovasyon = BookRepository.searchBook("inovasyon", BookLanguage.KREYOL)
        assertTrue("HT search should find inovasyon", htInovasyon.any { it.chapterNumber == 14 })
    }

    @Test
    fun verifyPart4_hasExact15ChaptersAndMasterContent() {
        val part4 = com.aistudio.ajtech.ecosystem.data.repository.Part4Data.part4
        assertEquals("part_4", part4.id)
        assertEquals(4, part4.partNumber)
        assertEquals(15, part4.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part4.status)
        assertTrue(part4.plannedPages.contains("75–94") || part4.plannedPages.contains("75-94"))

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

        part4.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 47
            assertEquals("ch_4_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_4", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart4_SearchKeywords() {
        // Offline-First
        val frOffline = BookRepository.searchBook("Offline-First", BookLanguage.FRENCH)
        assertTrue("FR search should find Offline-First", frOffline.any { it.chapterNumber in 47..61 })

        val htOffline = BookRepository.searchBook("Offline-First", BookLanguage.KREYOL)
        assertTrue("HT search should find Offline-First in HT", htOffline.any { it.chapterNumber in 47..61 })

        // PWA
        val frPwa = BookRepository.searchBook("PWA", BookLanguage.FRENCH)
        assertTrue("FR search should find PWA", frPwa.any { it.chapterNumber in 47..61 })

        // IndexedDB
        val frIndexedDB = BookRepository.searchBook("IndexedDB", BookLanguage.FRENCH)
        assertTrue("FR search should find IndexedDB", frIndexedDB.any { it.chapterNumber in 47..61 })

        val htIndexedDB = BookRepository.searchBook("IndexedDB", BookLanguage.KREYOL)
        assertTrue("HT search should find IndexedDB in HT", htIndexedDB.any { it.chapterNumber in 47..61 })

        // API REST
        val frApiRest = BookRepository.searchBook("API REST", BookLanguage.FRENCH)
        assertTrue("FR search should find API REST", frApiRest.any { it.chapterNumber in 47..61 })

        // cloud souverain
        val frCloudSouverain = BookRepository.searchBook("cloud souverain", BookLanguage.FRENCH)
        assertTrue("FR search should find cloud souverain", frCloudSouverain.any { it.chapterNumber == 56 })

        // sécurité
        val frSecurite = BookRepository.searchBook("sécurité", BookLanguage.FRENCH)
        assertTrue("FR search should find sécurité", frSecurite.any { it.chapterNumber in 47..61 })

        // Jetpack Compose
        val frCompose = BookRepository.searchBook("Jetpack Compose", BookLanguage.FRENCH)
        assertTrue("FR search should find Jetpack Compose", frCompose.any { it.chapterNumber in 47..61 })

        // synchronisation
        val frSynchro = BookRepository.searchBook("synchronisation", BookLanguage.FRENCH)
        assertTrue("FR search should find synchronisation", frSynchro.any { it.chapterNumber in 47..61 })

        // pèfòmans
        val htPeformans = BookRepository.searchBook("pèfòmans", BookLanguage.KREYOL)
        assertTrue("HT search should find pèfòmans", htPeformans.any { it.chapterNumber in 47..61 })

        // sekirite
        val htSekirite = BookRepository.searchBook("sekirite", BookLanguage.KREYOL)
        assertTrue("HT search should find sekirite", htSekirite.any { it.chapterNumber in 47..61 })
    }

    @Test
    fun verifyTotalMainChaptersAndNavigation() {
        val allChapters = BookRepository.allChapters
        // 7 sections liminaires + 166 chapitres officiels (Parties I à XI) + 2 annexes = 175 sections au total
        assertEquals(175, allChapters.size)

        // Verify Part 1 to Part 2 navigation sequence: 12 -> 13 -> 14 ... -> 24 -> 25
        val ch12 = BookRepository.getChapterById("ch_1_12")
        assertNotNull(ch12)
        assertEquals(12, ch12?.chapterNumber)

        val nextAfterCh12 = BookRepository.getNextChapter("ch_1_12")
        assertEquals("ch_2_13", nextAfterCh12?.id)

        for (num in 13..23) {
            val next = BookRepository.getNextChapter("ch_2_$num")
            val nextExpected = if (num < 24) "ch_2_${num + 1}" else "ch_3_25"
            assertEquals(nextExpected, next?.id)

            val current = BookRepository.getChapterById("ch_2_${num + 1}")
            val prev = BookRepository.getPreviousChapter(current!!.id)
            assertEquals("ch_2_$num", prev?.id)
        }

        val nextAfterCh24 = BookRepository.getNextChapter("ch_2_24")
        assertEquals("ch_3_25", nextAfterCh24?.id)

        val prevBeforeCh13 = BookRepository.getPreviousChapter("ch_2_13")
        assertEquals("ch_1_12", prevBeforeCh13?.id)

        // Verify Part 3 sequence: 25 -> 26 -> ... -> 46
        val nextAfterCh46 = BookRepository.getNextChapter("ch_3_46")
        assertEquals("ch_4_47", nextAfterCh46?.id)

        val prevBeforeCh47 = BookRepository.getPreviousChapter("ch_4_47")
        assertEquals("ch_3_46", prevBeforeCh47?.id)

        // Verify Part 4 sequence: 47 -> 48 -> ... -> 61
        for (num in 47..60) {
            val next = BookRepository.getNextChapter("ch_4_$num")
            assertEquals("ch_4_${num + 1}", next?.id)

            val current = BookRepository.getChapterById("ch_4_${num + 1}")
            val prev = BookRepository.getPreviousChapter(current!!.id)
            assertEquals("ch_4_$num", prev?.id)
        }

        val nextAfterCh61 = BookRepository.getNextChapter("ch_4_61")
        assertEquals("ch_5_62", nextAfterCh61?.id)

        val prevBeforeCh62 = BookRepository.getPreviousChapter("ch_5_62")
        assertEquals("ch_4_61", prevBeforeCh62?.id)

        // Verify Part 5 sequence: 62 -> 63 -> ... -> 76
        for (num in 62..75) {
            val next = BookRepository.getNextChapter("ch_5_$num")
            assertEquals("ch_5_${num + 1}", next?.id)

            val current = BookRepository.getChapterById("ch_5_${num + 1}")
            val prev = BookRepository.getPreviousChapter(current!!.id)
            assertEquals("ch_5_$num", prev?.id)
        }

        // Verify Transition Part 5 -> Part 6
        val nextAfterCh76 = BookRepository.getNextChapter("ch_5_76")
        assertEquals("ch_6_77", nextAfterCh76?.id)

        val prevBeforeCh77 = BookRepository.getPreviousChapter("ch_6_77")
        assertEquals("ch_5_76", prevBeforeCh77?.id)

        // Verify Part 6 sequence: 77 -> 78 -> ... -> 91
        for (num in 77..90) {
            val next = BookRepository.getNextChapter("ch_6_$num")
            assertEquals("ch_6_${num + 1}", next?.id)

            val current = BookRepository.getChapterById("ch_6_${num + 1}")
            val prev = BookRepository.getPreviousChapter(current!!.id)
            assertEquals("ch_6_$num", prev?.id)
        }

        // Verify Transition Part 6 -> Part 7
        val nextAfterCh91 = BookRepository.getNextChapter("ch_6_91")
        assertEquals("ch_7_92", nextAfterCh91?.id)

        val prevBeforeCh92 = BookRepository.getPreviousChapter("ch_7_92")
        assertEquals("ch_6_91", prevBeforeCh92?.id)

        // Verify Part 7 sequence: 92 -> 93 -> ... -> 106
        for (num in 92..105) {
            val next = BookRepository.getNextChapter("ch_7_$num")
            assertEquals("ch_7_${num + 1}", next?.id)

            val current = BookRepository.getChapterById("ch_7_${num + 1}")
            val prev = BookRepository.getPreviousChapter(current!!.id)
            assertEquals("ch_7_$num", prev?.id)
        }

        // Verify Transition Part 7 -> Part 8
        val nextAfterCh106 = BookRepository.getNextChapter("ch_7_106")
        assertEquals("ch_8_107", nextAfterCh106?.id)

        val prevBeforePart8 = BookRepository.getPreviousChapter("ch_8_107")
        assertEquals("ch_7_106", prevBeforePart8?.id)

        // Verify Part 8 sequential navigation: 107 -> ... -> 121
        for (num in 107..120) {
            val next = BookRepository.getNextChapter("ch_8_$num")
            assertEquals("ch_8_${num + 1}", next?.id)

            val current = BookRepository.getChapterById("ch_8_${num + 1}")
            val prev = BookRepository.getPreviousChapter(current!!.id)
            assertEquals("ch_8_$num", prev?.id)
        }

        // Verify Transition Part 8 -> Part 9
        val nextAfterCh121 = BookRepository.getNextChapter("ch_8_121")
        assertEquals("ch_9_122", nextAfterCh121?.id)

        val prevBeforePart9 = BookRepository.getPreviousChapter("ch_9_122")
        assertEquals("ch_8_121", prevBeforePart9?.id)
    }

    @Test
    fun verifyPart8_hasExact15ChaptersAndMasterContent() {
        val part8 = com.aistudio.ajtech.ecosystem.data.repository.Part8Data.part8
        assertEquals("part_8", part8.id)
        assertEquals(8, part8.partNumber)
        assertEquals(15, part8.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part8.status)
        assertTrue(part8.plannedPages.contains("151–166") || part8.plannedPages.contains("151-166"))
        assertTrue(part8.titleFr.contains("INTELLIGENCE ARTIFICIELLE, INNOVATION ET AVENIR"))
        assertTrue(part8.titleHt.contains("ENTÈLIJANS ATIFISYÈL, INOVASYON AK LAVNI"))

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

        part8.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 107
            assertEquals("ch_8_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_8", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart8_SearchKeywords() {
        // Machine Learning
        val frMachineLearning = BookRepository.searchBook("Machine Learning", BookLanguage.FRENCH)
        assertTrue("FR search should find Machine Learning", frMachineLearning.any { it.chapterNumber in 107..121 })

        // Transformer
        val frTransformer = BookRepository.searchBook("Transformer", BookLanguage.FRENCH)
        assertTrue("FR search should find Transformer", frTransformer.any { it.chapterNumber in 107..121 })

        // On-Device
        val frOnDevice = BookRepository.searchBook("On-Device", BookLanguage.FRENCH)
        assertTrue("FR search should find On-Device", frOnDevice.any { it.chapterNumber in 107..121 })

        // Kreyòl search: "entèlijans atifisyèl"
        val htAi = BookRepository.searchBook("entèlijans atifisyèl", BookLanguage.KREYOL)
        assertTrue("HT search should find entèlijans atifisyèl", htAi.any { it.chapterNumber in 107..121 })
    }

    @Test
    fun verifyPart9_hasExact15ChaptersAndMasterContent() {
        val part9 = com.aistudio.ajtech.ecosystem.data.repository.Part9Data.part9
        assertEquals("part_9", part9.id)
        assertEquals(9, part9.partNumber)
        assertEquals(15, part9.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part9.status)
        assertTrue(part9.plannedPages.contains("167–182") || part9.plannedPages.contains("167-182"))
        assertTrue(part9.titleFr.contains("INNOVATION, PRODUITS NUMÉRIQUES ET TRANSFORMATION DES SECTEURS"))
        assertTrue(part9.titleHt.contains("INOVASYON, PWODUI NIMERIK AK TRANSFÒMASYON SEKTÈ YO"))

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

        part9.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 122
            assertEquals("ch_9_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_9", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }

        // Navigation ch_8_121 -> ch_9_122 -> ch_9_136 -> ch_10_137
        val nextAfter121 = BookRepository.getNextChapter("ch_8_121")
        assertEquals("ch_9_122", nextAfter121?.id)

        val prevBefore122 = BookRepository.getPreviousChapter("ch_9_122")
        assertEquals("ch_8_121", prevBefore122?.id)

        val nextAfter136 = BookRepository.getNextChapter("ch_9_136")
        assertEquals("ch_10_137", nextAfter136?.id)

        val prevBefore137 = BookRepository.getPreviousChapter("ch_10_137")
        assertEquals("ch_9_136", prevBefore137?.id)
    }

    @Test
    fun verifyPart9_SearchKeywords() {
        // Innovation numérique
        val frInno = BookRepository.searchBook("innovation numérique", BookLanguage.FRENCH)
        assertTrue("FR search should find innovation numérique", frInno.any { it.chapterNumber in 122..136 })

        // Expérience utilisateur
        val frUx = BookRepository.searchBook("expérience utilisateur", BookLanguage.FRENCH)
        assertTrue("FR search should find expérience utilisateur", frUx.any { it.chapterNumber in 122..136 })

        // Commerce numérique
        val frCommerce = BookRepository.searchBook("commerce numérique", BookLanguage.FRENCH)
        assertTrue("FR search should find commerce numérique", frCommerce.any { it.chapterNumber in 122..136 })

        // Inclusion financière
        val frFinance = BookRepository.searchBook("inclusion financière", BookLanguage.FRENCH)
        assertTrue("FR search should find inclusion financière", frFinance.any { it.chapterNumber in 122..136 })

        // Interopérabilité
        val frInterop = BookRepository.searchBook("interopérabilité", BookLanguage.FRENCH)
        assertTrue("FR search should find interopérabilité", frInterop.any { it.chapterNumber in 122..136 })

        // Impact
        val frImpact = BookRepository.searchBook("impact", BookLanguage.FRENCH)
        assertTrue("FR search should find impact", frImpact.any { it.chapterNumber in 122..136 })

        // Transformation numérique
        val frTransfo = BookRepository.searchBook("transformation numérique", BookLanguage.FRENCH)
        assertTrue("FR search should find transformation numérique", frTransfo.any { it.chapterNumber in 122..136 })

        // Kreyol terms
        val htIno = BookRepository.searchBook("inovasyon", BookLanguage.KREYOL)
        assertTrue("HT search should find inovasyon", htIno.any { it.chapterNumber in 122..136 })

        val htUx = BookRepository.searchBook("eksperyans itilizatè", BookLanguage.KREYOL)
        assertTrue("HT search should find eksperyans itilizatè", htUx.any { it.chapterNumber in 122..136 })

        val htKomes = BookRepository.searchBook("komès nimerik", BookLanguage.KREYOL)
        assertTrue("HT search should find komès nimerik", htKomes.any { it.chapterNumber in 122..136 })

        val htFinans = BookRepository.searchBook("finans", BookLanguage.KREYOL)
        assertTrue("HT search should find finans", htFinans.any { it.chapterNumber in 122..136 })

        val htInterop = BookRepository.searchBook("entèoperabilite", BookLanguage.KREYOL)
        assertTrue("HT search should find entèoperabilite", htInterop.any { it.chapterNumber in 122..136 })

        val htEnpak = BookRepository.searchBook("enpak", BookLanguage.KREYOL)
        assertTrue("HT search should find enpak", htEnpak.any { it.chapterNumber in 122..136 })

        val htTransfo = BookRepository.searchBook("transfòmasyon nimerik", BookLanguage.KREYOL)
        assertTrue("HT search should find transfòmasyon nimerik", htTransfo.any { it.chapterNumber in 122..136 })
    }

    @Test
    fun verifyPart7_hasExact15ChaptersAndMasterContent() {
        val part7 = com.aistudio.ajtech.ecosystem.data.repository.Part7Data.part7
        assertEquals("part_7", part7.id)
        assertEquals(7, part7.partNumber)
        assertEquals(15, part7.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part7.status)
        assertTrue(part7.plannedPages.contains("135–150") || part7.plannedPages.contains("135-150"))
        assertTrue(part7.titleFr.contains("Sécurité, souveraineté numérique et confiance"))
        assertTrue(part7.titleHt.contains("Sekirite, Souvènte Nimerik ak Konfyans"))

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

        part7.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 92
            assertEquals("ch_7_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_7", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart7_SearchKeywords() {
        // OWASP
        val frOwasp = BookRepository.searchBook("OWASP", BookLanguage.FRENCH)
        assertTrue("FR search should find OWASP", frOwasp.any { it.chapterNumber in 92..106 })

        // Security by Design
        val frSecurityDesign = BookRepository.searchBook("Security by Design", BookLanguage.FRENCH)
        assertTrue("FR search should find Security by Design", frSecurityDesign.any { it.chapterNumber in 92..106 })

        // Offline-First
        val frOfflineFirst = BookRepository.searchBook("Offline-First", BookLanguage.FRENCH)
        assertTrue("FR search should find Offline-First", frOfflineFirst.any { it.chapterNumber in 92..106 })

        // Souveraineté
        val frSouverainete = BookRepository.searchBook("souveraineté", BookLanguage.FRENCH)
        assertTrue("FR search should find souveraineté", frSouverainete.any { it.chapterNumber in 92..106 })

        // Haitian Creole terms
        val htSekirite = BookRepository.searchBook("sekirite", BookLanguage.KREYOL)
        assertTrue("HT search should find sekirite", htSekirite.any { it.chapterNumber in 92..106 })

        val htSouvrenete = BookRepository.searchBook("souvènte", BookLanguage.KREYOL)
        assertTrue("HT search should find souvènte", htSouvrenete.any { it.chapterNumber in 92..106 })

        val htPhishing = BookRepository.searchBook("phishing", BookLanguage.KREYOL)
        assertTrue("HT search should find phishing in HT", htPhishing.any { it.chapterNumber in 92..106 })
    }

    @Test
    fun verifyPart6_hasExact15ChaptersAndMasterContent() {
        val part6 = com.aistudio.ajtech.ecosystem.data.repository.Part6Data.part6
        assertEquals("part_6", part6.id)
        assertEquals(6, part6.partNumber)
        assertEquals(15, part6.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part6.status)
        assertTrue(part6.plannedPages.contains("115–134") || part6.plannedPages.contains("115-134"))

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

        part6.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 77
            assertEquals("ch_6_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_6", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart5_hasExact15ChaptersAndMasterContent() {
        val part5 = com.aistudio.ajtech.ecosystem.data.repository.Part5Data.part5
        assertEquals("part_5", part5.id)
        assertEquals(5, part5.partNumber)
        assertEquals(15, part5.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part5.status)
        assertTrue(part5.plannedPages.contains("95–114") || part5.plannedPages.contains("95-114"))

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

        part5.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 62
            assertEquals("ch_5_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_5", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }
    }

    @Test
    fun verifyPart5_SearchKeywords() {
        // Bootstrapping
        val frBootstrap = BookRepository.searchBook("Bootstrapping", BookLanguage.FRENCH)
        assertTrue("FR search should find Bootstrapping", frBootstrap.any { it.chapterNumber in 62..76 })

        val htBootstrap = BookRepository.searchBook("Bootstrapping", BookLanguage.KREYOL)
        assertTrue("HT search should find Bootstrapping in HT", htBootstrap.any { it.chapterNumber in 62..76 })

        // Freemium
        val frFreemium = BookRepository.searchBook("Freemium", BookLanguage.FRENCH)
        assertTrue("FR search should find Freemium", frFreemium.any { it.chapterNumber in 62..76 })

        // AJ-Biz
        val frAjBiz = BookRepository.searchBook("AJ-Biz", BookLanguage.FRENCH)
        assertTrue("FR search should find AJ-Biz", frAjBiz.any { it.chapterNumber in 62..76 })

        // AJ-Commerce
        val frAjCommerce = BookRepository.searchBook("AJ-Commerce", BookLanguage.FRENCH)
        assertTrue("FR search should find AJ-Commerce", frAjCommerce.any { it.chapterNumber in 62..76 })

        // inclusion financière
        val frInclusion = BookRepository.searchBook("inclusion financière", BookLanguage.FRENCH)
        assertTrue("FR search should find inclusion financière", frInclusion.any { it.chapterNumber in 62..76 })

        // monétisation éthique
        val frEtiq = BookRepository.searchBook("éthique", BookLanguage.FRENCH)
        assertTrue("FR search should find éthique", frEtiq.any { it.chapterNumber in 62..76 })

        // antreprenarya
        val htAntreprenarya = BookRepository.searchBook("antreprenarya", BookLanguage.KREYOL)
        assertTrue("HT search should find antreprenarya", htAntreprenarya.any { it.chapterNumber in 62..76 })

        // dyaspora
        val htDyaspora = BookRepository.searchBook("dyaspora", BookLanguage.KREYOL)
        assertTrue("HT search should find dyaspora", htDyaspora.any { it.chapterNumber in 62..76 })
    }

    @Test
    fun verify22EntitiesUnchanged() {
        val entities = EcosystemRepository.entities
        assertEquals(22, entities.size)

        val expectedIds = listOf(
            "aj_tech", "aj_task", "aj_te", "aj_learn", "aj_pay", "aj_wallet",
            "aj_chat", "aj_cloud", "aj_meet", "aj_mail", "aj_studio", "aj_dev",
            "aj_maps", "aj_fondation", "aj_biz", "aj_commerce", "aj_mathquest", "aj_bioklin",
            "aj_fitness", "aj_assistant", "eduka", "edh"
        )

        val actualIds = entities.map { it.id }
        assertEquals(expectedIds, actualIds)
    }

    @Test
    fun verifyPart10_hasExact15ChaptersAndIntegrity() {
        val part10 = com.aistudio.ajtech.ecosystem.data.repository.Part10Data.part10
        assertEquals("part_10", part10.id)
        assertEquals(10, part10.partNumber)
        assertEquals(15, part10.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part10.status)
        assertEquals("pp. 183–198", part10.plannedPages)
        assertEquals("PARTIE X — DIASPORA, RAYONNEMENT INTERNATIONAL ET EXPANSION", part10.titleFr)
        assertEquals("PATI X — DYASPORA, RAYONNMAN ENTÈNASYONAL AK EKSPANSYON", part10.titleHt)

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

        part10.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 137
            assertEquals("ch_10_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_10", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertTrue("Chapter $expectedNum title HT must not be blank", chapter.titleHt.isNotBlank())
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }

        // Vérification des 4 phases et devises
        val ch151 = part10.chapters.last()
        assertTrue(ch151.contentFr.contains("Phase 1 (2026–2027)"))
        assertTrue(ch151.contentFr.contains("Phase 2 (2028–2030)"))
        assertTrue(ch151.contentFr.contains("Phase 3 (2031–2033)"))
        assertTrue(ch151.contentFr.contains("Phase 4 (2034–2035)"))
        assertTrue(ch151.contentFr.contains("L’innovation haïtienne au service du monde"))
        assertTrue(ch151.contentFr.contains("Vision, Technologie et Avenir"))
        assertTrue(ch151.contentHt.contains("Inovasyon ayisyen an nan sèvis lemonn"))
        assertTrue(ch151.contentHt.contains("Vizyon, Teknoloji ak Lavni"))
    }

    @Test
    fun verifyPart11_hasExact15ChaptersAndIntegrity() {
        val part11 = com.aistudio.ajtech.ecosystem.data.repository.Part11Data.part11
        assertEquals("part_11", part11.id)
        assertEquals(11, part11.partNumber)
        assertEquals(15, part11.chapters.size)
        assertEquals(BookContentStatus.IN_PROGRESS, part11.status)
        assertEquals("pp. 199–214", part11.plannedPages)
        assertEquals("PARTIE XI — HORIZON 2035 : CONSTRUIRE L’AVENIR NUMÉRIQUE HAÏTIEN", part11.titleFr)
        assertEquals("PATI XI — ORIZON 2035 : KONSTWI LAVNI NIMERIK AYITI", part11.titleHt)
        assertEquals("Vision, héritage, gouvernance et feuille de route vers un écosystème technologique durable", part11.subtitleFr)
        assertEquals("Vizyon, eritaj, gouvènans ak plan estratejik pou yon ekosistèm teknolojik dirab", part11.subtitleHt)

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

        val expectedTitlesHt = listOf(
            "Chapit 152 — Vizyon AJ-TECH pou 2035",
            "Chapit 153 — Konstwi sou fondasyon 2026 yo",
            "Chapit 154 — Yon teknoloji ki fèt pou reyalite ayisyen yo",
            "Chapit 155 — Frigalite, efikasite ak inovasyon dirab",
            "Chapit 156 — Gouvène yon ekosistèm teknolojik",
            "Chapit 157 — Konfyans kòm enfrastrikti envizib",
            "Chapit 158 — Kapital imen an nan sant pwojè a",
            "Chapit 159 — Fòme, transmèt konesans epi prepare jenerasyon k ap vini an",
            "Chapit 160 — Yon ekonomi nimerik nan sèvis sosyete a",
            "Chapit 161 — Ayiti nan konpetisyon teknolojik mondyal la",
            "Chapit 162 — Dyaspora a ak jenerasyon k ap vini yo",
            "Chapit 163 — Eritaj teknolojik nou vle kite",
            "Chapit 164 — Risk, echèk ak leson ki sou wout la",
            "Chapit 165 — Plan estratejik AJ-TECH 2026–2035",
            "Chapit 166 — Lavni an toujou rete pou konstwi"
        )

        part11.chapters.forEachIndexed { index, chapter ->
            val expectedNum = index + 152
            assertEquals("ch_11_$expectedNum", chapter.id)
            assertEquals(expectedNum, chapter.chapterNumber)
            assertEquals("part_11", chapter.partId)
            assertEquals(BookContentStatus.IN_PROGRESS, chapter.status)
            assertEquals(expectedTitlesFr[index], chapter.titleFr)
            assertEquals(expectedTitlesHt[index], chapter.titleHt)
            assertTrue("Chapter $expectedNum summary FR must not be blank", chapter.summaryFr.isNotBlank())
            assertTrue("Chapter $expectedNum summary HT must not be blank", chapter.summaryHt.isNotBlank())
            assertTrue("Chapter $expectedNum content FR must not be blank", chapter.contentFr.isNotBlank())
            assertTrue("Chapter $expectedNum content HT must not be blank", chapter.contentHt.isNotBlank())
        }

        // Vérification des 4 phases dans la feuille de route ch165
        val ch165 = part11.chapters[13]
        assertTrue(ch165.contentFr.contains("Phase 1 (2026–2027)"))
        assertTrue(ch165.contentFr.contains("Phase 2 (2028–2030)"))
        assertTrue(ch165.contentFr.contains("Phase 3 (2031–2033)"))
        assertTrue(ch165.contentFr.contains("Phase 4 (2034–2035)"))
        assertTrue(ch165.contentFr.contains("Vision, Technologie et Avenir"))
        assertTrue(ch165.contentFr.contains("L’innovation haïtienne au service du monde"))
        assertTrue(ch165.contentHt.contains("Vizyon, Teknoloji ak Lavni"))
        assertTrue(ch165.contentHt.contains("Inovasyon ayisyen an nan sèvis lemonn"))

        // Vérification du message jeunesse dans ch166
        val ch166 = part11.chapters[14]
        assertTrue(ch166.contentFr.contains("Nous sommes forts, nous avons beaucoup de capacités. Continuons de lutter pour arriver au sommet. Rien n'est facile sans le travail. Merci aux jeunes Haïtiens."))
        assertTrue(ch166.contentHt.contains("Nou fò, nou gen anpil kapasite. Ann kontinye goumen pou n rive nan somè a. Anyen pa fasil san travay. Mèsi ak jèn Ayisyen yo."))

        // Vérification de la navigation séquentielle
        val nextAfter151 = BookRepository.getNextChapter("ch_10_151")
        assertNotNull(nextAfter151)
        assertEquals("ch_11_152", nextAfter151?.id)

        val prevBefore152 = BookRepository.getPreviousChapter("ch_11_152")
        assertNotNull(prevBefore152)
        assertEquals("ch_10_151", prevBefore152?.id)

        for (num in 152..165) {
            val currId = "ch_11_$num"
            val expectedNextId = "ch_11_${num + 1}"
            val next = BookRepository.getNextChapter(currId)
            assertNotNull("Next of $currId should not be null", next)
            assertEquals(expectedNextId, next?.id)

            val prevOfNext = BookRepository.getPreviousChapter(expectedNextId)
            assertNotNull("Prev of $expectedNextId should not be null", prevOfNext)
            assertEquals(currId, prevOfNext?.id)
        }

        val nextAfter166 = BookRepository.getNextChapter("ch_11_166")
        assertNotNull("Le chapitre 166 doit mener à l'annexe 1", nextAfter166)
        assertEquals("annex_1_fiche_technique", nextAfter166?.id)

        // Vérification recherche bilingue Part 11
        val frSearchFrugalite = BookRepository.searchBook("frugalité", BookLanguage.FRENCH)
        assertTrue(frSearchFrugalite.any { it.id == "ch_11_155" })

        val htSearchFrigalite = BookRepository.searchBook("frigalite", BookLanguage.KREYOL)
        assertTrue(htSearchFrigalite.any { it.id == "ch_11_155" })

        val frSearchConfiance = BookRepository.searchBook("confiance", BookLanguage.FRENCH)
        assertTrue(frSearchConfiance.any { it.id == "ch_11_157" })

        val htSearchKonfyans = BookRepository.searchBook("konfyans", BookLanguage.KREYOL)
        assertTrue(htSearchKonfyans.any { it.id == "ch_11_157" })

        val frSearchHeritage = BookRepository.searchBook("héritage", BookLanguage.FRENCH)
        assertTrue(frSearchHeritage.any { it.id == "ch_11_163" })

        val htSearchEritaj = BookRepository.searchBook("eritaj", BookLanguage.KREYOL)
        assertTrue(htSearchEritaj.any { it.id == "ch_11_163" })
    }

    @Test
    fun verifyFinalStructureAndAnnexes_Objectives25And26() {
        // 1. Vérifier les 7 sections liminaires
        val frontPart = requireNotNull(BookRepository.parts.find { it.id == "part_front" })
        assertEquals(PartType.FRONT_MATTER, frontPart.type)
        assertEquals(7, frontPart.chapters.size)
        assertTrue("Pagination liminaires doit couvrir pp. 1–14", frontPart.plannedPages.contains("1–14"))
        assertEquals(3, frontPart.chapters.first().plannedStartPage)
        assertEquals(14, frontPart.chapters.last().plannedEndPage)

        // 2. Vérifier les 166 chapitres officiels des Parties I à XI
        val mainParts = BookRepository.parts.filter { it.type == PartType.MAIN_PART }
        assertEquals(11, mainParts.size)
        val allMainChapters = mainParts.flatMap { it.chapters }
        assertEquals(166, allMainChapters.size)
        assertEquals("ch_1_1", allMainChapters.first().id)
        assertEquals(1, allMainChapters.first().chapterNumber)
        assertEquals(15, allMainChapters.first().plannedStartPage)
        assertEquals("ch_11_166", allMainChapters.last().id)
        assertEquals(166, allMainChapters.last().chapterNumber)
        assertEquals(214, allMainChapters.last().plannedEndPage)

        // 3. Vérifier les 2 annexes
        val annexPart = requireNotNull(BookRepository.parts.find { it.id == "part_annexes" })
        assertEquals(PartType.BACK_MATTER, annexPart.type)
        assertEquals(2, annexPart.chapters.size)
        assertEquals("pp. 215–218", annexPart.plannedPages)

        val annex1 = annexPart.chapters[0]
        assertEquals("annex_1_fiche_technique", annex1.id)
        assertEquals(1, annex1.chapterNumber)
        assertEquals(215, annex1.plannedStartPage)
        assertEquals(216, annex1.plannedEndPage)
        assertEquals("Annexe 1 — Fiche Technique de l'Écosystème et de l'Application", annex1.titleFr)
        assertEquals("Anèks 1 — Fich Teknik Ekosistèm ak Aplikasyon an", annex1.titleHt)
        assertTrue(annex1.contentFr.contains("Clean Architecture"))
        assertTrue(annex1.contentFr.contains("Jetpack Compose"))
        assertTrue(annex1.contentFr.contains("218 pages"))
        assertTrue(annex1.contentFr.contains("175 sections"))
        assertTrue(annex1.contentFr.contains("AJ-Task"))
        assertTrue(annex1.contentHt.contains("Clean Architecture"))
        assertTrue(annex1.contentHt.contains("Jetpack Compose"))
        assertTrue(annex1.contentHt.contains("218 paj"))
        assertTrue(annex1.contentHt.contains("175 seksyon"))

        val annex2 = annexPart.chapters[1]
        assertEquals("annex_2_glossaire", annex2.id)
        assertEquals(2, annex2.chapterNumber)
        assertEquals(217, annex2.plannedStartPage)
        assertEquals(218, annex2.plannedEndPage)
        assertEquals("Annexe 2 — Glossaire Technologique Bilingue", annex2.titleFr)
        assertEquals("Anèks 2 — Glosè Teknololojik Bileng", annex2.titleHt)
        assertTrue(annex2.contentFr.contains("Offline-First"))
        assertTrue(annex2.contentFr.contains("PWA"))
        assertTrue(annex2.contentFr.contains("API"))
        assertTrue(annex2.contentFr.contains("Cloud Souverain"))
        assertTrue(annex2.contentFr.contains("IndexedDB"))
        assertTrue(annex2.contentHt.contains("Offline-First"))
        assertTrue(annex2.contentHt.contains("PWA"))
        assertTrue(annex2.contentHt.contains("API"))
        assertTrue(annex2.contentHt.contains("Cloud Nasyonal"))

        // 4. Structure finale exacte : 7 + 166 + 2 = 175 sections au total
        val allChapters = BookRepository.allChapters
        assertEquals(175, allChapters.size)

        // 5. Vérifier la pagination complète
        // liminaires : pp. 1–14
        // Parties I–XI : pp. 15–214
        // Fiche technique : pp. 215–216
        // Glossaire : pp. 217–218
        assertEquals(3, allChapters.first().plannedStartPage)
        assertEquals(218, allChapters.last().plannedEndPage)

        // 6. Chapitre 166 est le dernier chapitre principal
        assertEquals("ch_11_166", allMainChapters.last().id)

        // 7. Les annexes commencent après le chapitre 166
        val nextAfter166FromRepo = BookRepository.getNextChapter("ch_11_166")
        assertNotNull(nextAfter166FromRepo)
        assertEquals("annex_1_fiche_technique", nextAfter166FromRepo?.id)

        val prevBeforeAnnex1 = BookRepository.getPreviousChapter("annex_1_fiche_technique")
        assertNotNull(prevBeforeAnnex1)
        assertEquals("ch_11_166", prevBeforeAnnex1?.id)

        // 13. Navigation entre annexes et fin du livre
        val nextAfterAnnex1 = BookRepository.getNextChapter("annex_1_fiche_technique")
        assertNotNull(nextAfterAnnex1)
        assertEquals("annex_2_glossaire", nextAfterAnnex1?.id)

        val prevBeforeAnnex2 = BookRepository.getPreviousChapter("annex_2_glossaire")
        assertNotNull(prevBeforeAnnex2)
        assertEquals("annex_1_fiche_technique", prevBeforeAnnex2?.id)

        val nextAfterAnnex2 = BookRepository.getNextChapter("annex_2_glossaire")
        assertNull("Le livre doit impérativement se terminer à la page 218 après le glossaire", nextAfterAnnex2)

        // 19. Aucun chapitre 167+ n'existe
        assertFalse(allChapters.any { it.chapterNumber >= 167 })
        assertFalse(allChapters.any { it.id.contains("167") })

        // 9. Recherche FR et HT sur les annexes
        val searchCleanArchFr = BookRepository.searchBook("Clean Architecture", BookLanguage.FRENCH)
        assertTrue(searchCleanArchFr.any { it.id == "annex_1_fiche_technique" })

        val searchCleanArchHt = BookRepository.searchBook("Clean Architecture", BookLanguage.KREYOL)
        assertTrue(searchCleanArchHt.any { it.id == "annex_1_fiche_technique" })

        val searchIndexedDbFr = BookRepository.searchBook("IndexedDB", BookLanguage.FRENCH)
        assertTrue(searchIndexedDbFr.any { it.id == "annex_2_glossaire" })

        val searchIndexedDbHt = BookRepository.searchBook("IndexedDB", BookLanguage.KREYOL)
        assertTrue(searchIndexedDbHt.any { it.id == "annex_2_glossaire" })

        // 14 & 15. Vérifier les 22 entités officielles sans aucune entité supplémentaire
        val allEntities = EcosystemRepository.allEntities
        assertEquals(22, allEntities.size)
        val allEntityIds = allEntities.map { it.id }.toSet()
        val expectedOfficialIds = setOf(
            "aj_task", "eduka", "edh", "aj_cloud", "aj_bioklin", "aj_fitness",
            "aj_pay", "aj_wallet", "aj_commerce", "aj_biz", "aj_chat", "aj_meet",
            "aj_mail", "aj_studio", "aj_dev", "aj_learn", "aj_mathquest",
            "aj_te", "aj_maps", "aj_assistant", "aj_fondation", "aj_tech"
        )
        assertEquals(expectedOfficialIds, allEntityIds)
    }
}

