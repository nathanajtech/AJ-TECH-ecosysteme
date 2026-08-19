package com.aistudio.ajtech.ecosystem.data.model

import androidx.compose.ui.graphics.Color
import com.aistudio.ajtech.ecosystem.ui.theme.StatusGreen
import com.aistudio.ajtech.ecosystem.ui.theme.StatusWhite
import com.aistudio.ajtech.ecosystem.ui.theme.StatusYellow

enum class BookLanguage(val label: String, val code: String) {
    FRENCH("Français", "FR"),
    KREYOL("Kreyòl Ayisyen", "HT")
}

enum class BookContentStatus(val labelFr: String, val labelHt: String, val color: Color, val symbol: String) {
    AVAILABLE("Extrait disponible", "Ekstrè disponib", StatusGreen, "🟢"),
    IN_PROGRESS("En cours de rédaction", "An kou redaksyon", StatusYellow, "🟡"),
    PLANNED("Planifié", "Planifye", StatusWhite, "⚪")
}

enum class PartType {
    FRONT_MATTER,
    MAIN_PART,
    BACK_MATTER
}

data class SubChapter(
    val id: String,
    val sectionNumber: String,
    val titleFr: String,
    val titleHt: String,
    val contentFr: String,
    val contentHt: String,
    val plannedPage: Int,
    val status: BookContentStatus = BookContentStatus.AVAILABLE
)

data class BookChapter(
    val id: String,
    val chapterNumber: Int,
    val partId: String,
    val titleFr: String,
    val titleHt: String,
    val subtitleFr: String,
    val subtitleHt: String,
    val summaryFr: String,
    val summaryHt: String,
    val contentFr: String,
    val contentHt: String,
    val subChapters: List<SubChapter> = emptyList(),
    val plannedStartPage: Int,
    val plannedEndPage: Int,
    val estimatedReadMinutes: Int,
    val status: BookContentStatus = BookContentStatus.AVAILABLE
) {
    fun title(language: BookLanguage): String = if (language == BookLanguage.FRENCH) titleFr else titleHt
    fun subtitle(language: BookLanguage): String = if (language == BookLanguage.FRENCH) subtitleFr else subtitleHt
    fun summary(language: BookLanguage): String = if (language == BookLanguage.FRENCH) summaryFr else summaryHt
    fun content(language: BookLanguage): String = if (language == BookLanguage.FRENCH) contentFr else contentHt
    fun statusLabel(language: BookLanguage): String = if (language == BookLanguage.FRENCH) status.labelFr else status.labelHt
}

data class BookPart(
    val id: String,
    val partNumber: Int?,
    val type: PartType,
    val titleFr: String,
    val titleHt: String,
    val subtitleFr: String,
    val subtitleHt: String,
    val plannedPages: String,
    val chapters: List<BookChapter>,
    val status: BookContentStatus = BookContentStatus.AVAILABLE
) {
    fun title(language: BookLanguage): String = if (language == BookLanguage.FRENCH) titleFr else titleHt
    fun subtitle(language: BookLanguage): String = if (language == BookLanguage.FRENCH) subtitleFr else subtitleHt
}

data class BookBookmark(
    val partId: String,
    val chapterId: String,
    val chapterTitleFr: String,
    val chapterTitleHt: String,
    val pageNumber: Int,
    val timestampMs: Long = System.currentTimeMillis()
)
