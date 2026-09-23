package com.aistudio.ajtech.ecosystem.ui.screens

import android.content.Intent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.data.model.*
import com.aistudio.ajtech.ecosystem.data.repository.BookRepository
import com.aistudio.ajtech.ecosystem.ui.cover.BookCoverView
import com.aistudio.ajtech.ecosystem.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookReaderScreen(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var selectedTab by rememberSaveable { mutableStateOf(0) } // 0: Couverture, 1: Sommaire, 2: Lecture, 3: Recherche, 4: Signets & Progression
    var selectedChapterId by rememberSaveable { mutableStateOf("front_dedicace") }
    var currentLanguage by rememberSaveable { mutableStateOf(BookLanguage.FRENCH.name) }
    var searchQuery by rememberSaveable { mutableStateOf("") }
    var fontSizeSp by rememberSaveable { mutableStateOf(16) }
    var bookmarkedChapterIds by rememberSaveable { mutableStateOf(setOf<String>()) }

    val activeLanguage = if (currentLanguage == BookLanguage.KREYOL.name) BookLanguage.KREYOL else BookLanguage.FRENCH
    val activeChapter = remember(selectedChapterId) {
        BookRepository.getChapterById(selectedChapterId) ?: BookRepository.allChapters.first()
    }
    val activePart = remember(activeChapter.id) {
        BookRepository.getPartByChapterId(activeChapter.id)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(DeepBlueCanvas)
    ) {
        // Top Toolbar: Sub-tabs & Language Toggle
        Surface(
            color = DeepBlueDark,
            shadowElevation = 4.dp
        ) {
            Column {
                // Secondary Bar with Quick Language Switcher & Active Indicator
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.MenuBook,
                            contentDescription = null,
                            tint = GoldAccent,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "OUVRAGE OFFICIEL COMPAGNON",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = GoldAccent,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 0.5.sp
                            )
                        )
                    }

                    // Language Toggle Pill
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = DeepBlueContainer,
                        border = BorderStroke(1.dp, DeepBlueLighter)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Translate,
                                contentDescription = "Changer de langue",
                                tint = ElectricBlueGlow,
                                modifier = Modifier
                                    .padding(start = 4.dp, end = 2.dp)
                                    .size(14.dp)
                            )
                            FilterChip(
                                selected = activeLanguage == BookLanguage.FRENCH,
                                onClick = { currentLanguage = BookLanguage.FRENCH.name },
                                label = { Text("FR", fontSize = 11.sp, fontWeight = FontWeight.Bold) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = ElectricBlue,
                                    selectedLabelColor = PureWhite,
                                    containerColor = Color.Transparent,
                                    labelColor = PureWhite.copy(alpha = 0.7f)
                                ),
                                border = null,
                                modifier = Modifier.height(28.dp).testTag("book_lang_fr")
                            )
                            FilterChip(
                                selected = activeLanguage == BookLanguage.KREYOL,
                                onClick = { currentLanguage = BookLanguage.KREYOL.name },
                                label = { Text("HT", fontSize = 11.sp, fontWeight = FontWeight.Bold) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = HaitianRed,
                                    selectedLabelColor = PureWhite,
                                    containerColor = Color.Transparent,
                                    labelColor = PureWhite.copy(alpha = 0.7f)
                                ),
                                border = null,
                                modifier = Modifier.height(28.dp).testTag("book_lang_ht")
                            )
                        }
                    }
                }

                // Companion Tabs
                ScrollableTabRow(
                    selectedTabIndex = selectedTab,
                    containerColor = DeepBlueDark,
                    contentColor = ElectricBlueGlow,
                    edgePadding = 12.dp
                ) {
                    val tabLabels = if (activeLanguage == BookLanguage.FRENCH) {
                        listOf("Couverture", "Sommaire", "Lecture", "Recherche", "Progression")
                    } else {
                        listOf("Kouvèti", "Somè", "Lekti", "Chèche", "Pwogresyon")
                    }

                    tabLabels.forEachIndexed { index, label ->
                        Tab(
                            selected = selectedTab == index,
                            onClick = { selectedTab = index },
                            modifier = Modifier
                                .heightIn(min = 44.dp)
                                .testTag("book_tab_$index")
                        ) {
                            Text(
                                text = label,
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp),
                                style = MaterialTheme.typography.labelMedium.copy(
                                    color = if (selectedTab == index) ElectricBlueGlow else PureWhite.copy(alpha = 0.7f),
                                    fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Normal
                                )
                            )
                        }
                    }
                }
            }
        }

        Box(modifier = Modifier.fillMaxSize()) {
            when (selectedTab) {
                0 -> {
                    // 3D Cover View
                    BookCoverView(modifier = Modifier.fillMaxSize())
                }

                1 -> {
                    // Sommaire / Table des Matières Structurée
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = if (activeLanguage == BookLanguage.FRENCH) "Table des Matières" else "Tab Matyè yo",
                                    style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                                )
                                Text(
                                    text = if (activeLanguage == BookLanguage.FRENCH)
                                        "${BookRepository.parts.size} grandes sections • ${BookRepository.allChapters.size} chapitres structurés"
                                    else
                                        "${BookRepository.parts.size} gwo seksyon • ${BookRepository.allChapters.size} chapit estriktire",
                                    style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.7f))
                                )
                            }
                        }

                        // Parts Iteration
                        BookRepository.parts.forEach { part ->
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(14.dp),
                                colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
                                border = BorderStroke(1.dp, DeepBlueLighter.copy(alpha = 0.5f))
                            ) {
                                Column(
                                    modifier = Modifier.padding(14.dp),
                                    verticalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    // Part Header
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = part.title(activeLanguage),
                                                style = MaterialTheme.typography.titleMedium.copy(
                                                    color = if (part.type == PartType.MAIN_PART) ElectricBlueGlow else GoldAccent,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            )
                                            Text(
                                                text = part.subtitle(activeLanguage),
                                                style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.7f))
                                            )
                                        }
                                        Surface(
                                            color = DeepBlueDark,
                                            shape = RoundedCornerShape(6.dp),
                                            modifier = Modifier.padding(start = 8.dp)
                                        ) {
                                            Text(
                                                text = part.plannedPages,
                                                style = MaterialTheme.typography.labelSmall.copy(
                                                    color = PureWhite.copy(alpha = 0.8f),
                                                    fontSize = 10.sp
                                                ),
                                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)
                                            )
                                        }
                                    }

                                    HorizontalDivider(color = DeepBlueDark, thickness = 1.dp)

                                    // Chapters in Part
                                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                        part.chapters.forEach { chapter ->
                                            val isSelected = chapter.id == selectedChapterId
                                            Surface(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .testTag("toc_chapter_${chapter.id}")
                                                    .clickable {
                                                        selectedChapterId = chapter.id
                                                        selectedTab = 2
                                                    },
                                                shape = RoundedCornerShape(10.dp),
                                                color = if (isSelected) DeepBlueLighter else DeepBlueDark,
                                                border = if (isSelected) BorderStroke(1.dp, ElectricBlueGlow) else null
                                            ) {
                                                Row(
                                                    modifier = Modifier.padding(12.dp),
                                                    verticalAlignment = Alignment.CenterVertically,
                                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                                ) {
                                                    Box(
                                                        modifier = Modifier
                                                            .size(28.dp)
                                                            .clip(CircleShape)
                                                            .background(if (isSelected) ElectricBlue else DeepBlueContainer),
                                                        contentAlignment = Alignment.Center
                                                    ) {
                                                        Text(
                                                            text = "${chapter.chapterNumber}",
                                                            style = MaterialTheme.typography.labelMedium.copy(
                                                                color = PureWhite,
                                                                fontWeight = FontWeight.Bold
                                                            )
                                                        )
                                                    }

                                                    Column(modifier = Modifier.weight(1f)) {
                                                        Text(
                                                            text = chapter.title(activeLanguage),
                                                            style = MaterialTheme.typography.bodyMedium.copy(
                                                                color = PureWhite,
                                                                fontWeight = FontWeight.SemiBold
                                                            ),
                                                            maxLines = 1,
                                                            overflow = TextOverflow.Ellipsis
                                                        )
                                                        Text(
                                                            text = chapter.summary(activeLanguage),
                                                            style = MaterialTheme.typography.bodySmall.copy(
                                                                color = PureWhite.copy(alpha = 0.6f),
                                                                fontSize = 11.sp
                                                            ),
                                                            maxLines = 1,
                                                            overflow = TextOverflow.Ellipsis
                                                        )
                                                    }

                                                    // Status Chip
                                                    Surface(
                                                        color = chapter.status.color.copy(alpha = 0.15f),
                                                        shape = RoundedCornerShape(4.dp)
                                                    ) {
                                                        Text(
                                                            text = "${chapter.status.symbol} ${chapter.statusLabel(activeLanguage)}",
                                                            style = MaterialTheme.typography.labelSmall.copy(
                                                                color = chapter.status.color,
                                                                fontSize = 9.sp,
                                                                fontWeight = FontWeight.Bold
                                                            ),
                                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                        )
                                                    }

                                                    Icon(
                                                        imageVector = Icons.Default.ChevronRight,
                                                        contentDescription = "Lire",
                                                        tint = ElectricBlueGlow,
                                                        modifier = Modifier.size(18.dp)
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                2 -> {
                    // Reader View (Bilingual, Resizable, Chapters Navigation)
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        // Reader Controls Card
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 4.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Font Size Controls
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    IconButton(
                                        onClick = { if (fontSizeSp > 12) fontSizeSp -= 2 },
                                        modifier = Modifier.size(40.dp)
                                    ) {
                                        Text(text = "A-", color = PureWhite, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                                    }
                                    Text(text = "${fontSizeSp}sp", color = ElectricBlueGlow, fontSize = 12.sp)
                                    IconButton(
                                        onClick = { if (fontSizeSp < 24) fontSizeSp += 2 },
                                        modifier = Modifier.size(40.dp)
                                    ) {
                                        Text(text = "A+", color = PureWhite, fontWeight = FontWeight.Bold, fontSize = 15.sp)
                                    }
                                }

                                // Chapter Page Pill
                                Surface(
                                    color = DeepBlueContainer,
                                    shape = RoundedCornerShape(6.dp)
                                ) {
                                    Text(
                                        text = "pp. ${activeChapter.plannedStartPage}–${activeChapter.plannedEndPage}",
                                        style = MaterialTheme.typography.labelSmall.copy(color = PureWhite, fontSize = 10.sp),
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }

                                // Bookmark Toggle
                                val isBookmarked = bookmarkedChapterIds.contains(activeChapter.id)
                                IconButton(
                                    onClick = {
                                        bookmarkedChapterIds = if (isBookmarked) {
                                            bookmarkedChapterIds - activeChapter.id
                                        } else {
                                            bookmarkedChapterIds + activeChapter.id
                                        }
                                    },
                                    modifier = Modifier
                                        .size(40.dp)
                                        .testTag("book_bookmark_button")
                                ) {
                                    Icon(
                                        imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                                        contentDescription = "Signet",
                                        tint = if (isBookmarked) HaitianRed else PureWhite
                                    )
                                }

                                // Native Android Share Extrait
                                IconButton(
                                    onClick = {
                                        val summaryText = if (activeLanguage == BookLanguage.KREYOL) activeChapter.summaryHt else activeChapter.summaryFr
                                        val shareText = """
                                            « ${activeChapter.titleFr} »
                                            « ${activeChapter.titleHt} »
                                            
                                            $summaryText
                                            
                                            ${activeChapter.content(activeLanguage)}
                                            
                                            — Extrait officiel du livre : AJ-TECH — L'Écosystème Numérique Haïtien (Jonathan Germain)
                                            « L’innovation haïtienne au service du monde »
                                        """.trimIndent()
                                        val sendIntent = Intent().apply {
                                            action = Intent.ACTION_SEND
                                            putExtra(Intent.EXTRA_TEXT, shareText)
                                            type = "text/plain"
                                        }
                                        val shareIntent = Intent.createChooser(sendIntent, "Partager cet extrait")
                                        context.startActivity(shareIntent)
                                    },
                                    modifier = Modifier
                                        .size(40.dp)
                                        .testTag("book_share_button")
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Share,
                                        contentDescription = "Partager l'extrait",
                                        tint = ElectricBlueGlow
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // Part Context Header
                        if (activePart != null) {
                            Surface(
                                color = DeepBlueContainer,
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = activePart.title(activeLanguage),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = GoldAccent,
                                            fontWeight = FontWeight.Bold
                                        ),
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.weight(1f)
                                    )
                                    Text(
                                        text = "~${activeChapter.estimatedReadMinutes} min",
                                        style = MaterialTheme.typography.labelSmall.copy(color = PureWhite.copy(alpha = 0.7f))
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                        }

                        // Chapter Content Card
                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
                            border = BorderStroke(1.dp, DeepBlueLighter.copy(alpha = 0.4f))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .verticalScroll(rememberScrollState())
                                    .padding(20.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                // Chapter Title
                                Text(
                                    text = activeChapter.title(activeLanguage),
                                    style = MaterialTheme.typography.titleLarge.copy(
                                        color = PureWhite,
                                        fontWeight = FontWeight.Bold
                                    )
                                )

                                // Subtitle
                                Text(
                                    text = activeChapter.subtitle(activeLanguage),
                                    style = MaterialTheme.typography.titleSmall.copy(
                                        color = ElectricBlueGlow,
                                        fontWeight = FontWeight.Medium
                                    )
                                )

                                // Status indicator banner
                                Surface(
                                    color = activeChapter.status.color.copy(alpha = 0.12f),
                                    shape = RoundedCornerShape(6.dp),
                                    border = BorderStroke(1.dp, activeChapter.status.color.copy(alpha = 0.3f))
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                                    ) {
                                        Text(text = activeChapter.status.symbol, fontSize = 10.sp)
                                        Text(
                                            text = "${activeChapter.statusLabel(activeLanguage)} • Version ${activeLanguage.label}",
                                            style = MaterialTheme.typography.labelSmall.copy(
                                                color = activeChapter.status.color,
                                                fontWeight = FontWeight.Bold
                                            )
                                        )
                                    }
                                }

                                HorizontalDivider(color = DeepBlueDark, thickness = 1.dp)

                                // Main Text Content
                                Text(
                                    text = activeChapter.content(activeLanguage),
                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = PureWhite.copy(alpha = 0.92f),
                                        fontSize = fontSizeSp.sp,
                                        lineHeight = (fontSizeSp * 1.6).sp
                                    )
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                // Editorial Notice
                                Surface(
                                    color = DeepBlueDark.copy(alpha = 0.6f),
                                    shape = RoundedCornerShape(8.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(12.dp)) {
                                        Text(
                                            text = if (activeLanguage == BookLanguage.FRENCH)
                                                "Ouvrage en cours de finalisation éditoriale. Le texte intégral des 200 pages sera intégré lors des prochaines éditions officielles."
                                            else
                                                "Liv la an kou finalizasyon editoryal. Tèks konplè 200 paj la ap disponib nan pwochen edisyon ofisyèl yo.",
                                            style = MaterialTheme.typography.bodySmall.copy(
                                                color = PureWhite.copy(alpha = 0.6f),
                                                fontSize = 11.sp
                                            )
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // Navigation Buttons (Prev / Next Chapter)
                        val prevChapter = BookRepository.getPreviousChapter(activeChapter.id)
                        val nextChapter = BookRepository.getNextChapter(activeChapter.id)

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Button(
                                onClick = {
                                    if (prevChapter != null) selectedChapterId = prevChapter.id
                                },
                                enabled = prevChapter != null,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = DeepBlueDark,
                                    disabledContainerColor = DeepBlueDark.copy(alpha = 0.4f)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .heightIn(min = 48.dp)
                                    .testTag("book_prev_chapter_button")
                            ) {
                                Icon(imageVector = Icons.Default.ChevronLeft, contentDescription = "Précédent", modifier = Modifier.size(20.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(text = if (activeLanguage == BookLanguage.FRENCH) "Précédent" else "Presedan")
                            }

                            Button(
                                onClick = {
                                    if (nextChapter != null) selectedChapterId = nextChapter.id
                                },
                                enabled = nextChapter != null,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = ElectricBlue,
                                    disabledContainerColor = ElectricBlue.copy(alpha = 0.3f)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .heightIn(min = 48.dp)
                                    .testTag("book_next_chapter_button")
                            ) {
                                Text(text = if (activeLanguage == BookLanguage.FRENCH) "Suivant" else "Swivan")
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "Suivant", modifier = Modifier.size(20.dp))
                            }
                        }
                    }
                }

                3 -> {
                    // Search Tab (Bilingual Search)
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("book_search_field"),
                            placeholder = {
                                Text(
                                    text = if (activeLanguage == BookLanguage.FRENCH) "Rechercher dans l'ouvrage officiel..." else "Chèche nan liv ofisyèl la...",
                                    color = PureWhite.copy(alpha = 0.5f)
                                )
                            },
                            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = ElectricBlueGlow) },
                            trailingIcon = {
                                if (searchQuery.isNotEmpty()) {
                                    IconButton(onClick = { searchQuery = "" }) {
                                        Icon(imageVector = Icons.Default.Close, contentDescription = "Effacer", tint = PureWhite.copy(alpha = 0.7f))
                                    }
                                }
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = ElectricBlueGlow,
                                unfocusedBorderColor = DeepBlueContainer,
                                focusedTextColor = PureWhite,
                                unfocusedTextColor = PureWhite,
                                focusedContainerColor = DeepBlueDark,
                                unfocusedContainerColor = DeepBlueDark
                            ),
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true
                        )

                        val results = remember(searchQuery, activeLanguage) {
                            BookRepository.searchBook(searchQuery, activeLanguage)
                        }
                        Text(
                            text = if (activeLanguage == BookLanguage.FRENCH)
                                "${results.size} chapitre(s) trouvé(s)"
                            else
                                "${results.size} chapit jwenn",
                            style = MaterialTheme.typography.labelMedium.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                        )

                        if (results.isEmpty()) {
                            // Empty State
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 24.dp),
                                colors = CardDefaults.cardColors(containerColor = DeepBlueContainer)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(24.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = null,
                                        tint = PureWhite.copy(alpha = 0.4f),
                                        modifier = Modifier.size(36.dp)
                                    )
                                    Text(
                                        text = if (activeLanguage == BookLanguage.FRENCH) "Aucun résultat trouvé pour « $searchQuery »" else "Pa gen rezilta pou « $searchQuery »",
                                        style = MaterialTheme.typography.bodyMedium.copy(color = PureWhite.copy(alpha = 0.7f))
                                    )
                                }
                            }
                        } else {
                            LazyColumn(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                items(results, key = { it.id }) { chapter ->
                                    Card(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .testTag("search_result_chapter_${chapter.id}")
                                            .clickable {
                                                selectedChapterId = chapter.id
                                                selectedTab = 2
                                            },
                                        shape = RoundedCornerShape(12.dp),
                                        colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
                                        border = BorderStroke(1.dp, DeepBlueLighter.copy(alpha = 0.4f))
                                    ) {
                                        Column(
                                            modifier = Modifier.padding(16.dp),
                                            verticalArrangement = Arrangement.spacedBy(6.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalArrangement = Arrangement.SpaceBetween,
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Text(
                                                    text = chapter.title(activeLanguage),
                                                    style = MaterialTheme.typography.titleMedium.copy(
                                                        color = PureWhite,
                                                        fontWeight = FontWeight.Bold
                                                    ),
                                                    modifier = Modifier.weight(1f)
                                                )
                                                Surface(
                                                    color = DeepBlueDark,
                                                    shape = RoundedCornerShape(4.dp)
                                                ) {
                                                    Text(
                                                        text = "pp. ${chapter.plannedStartPage}–${chapter.plannedEndPage}",
                                                        style = MaterialTheme.typography.labelSmall.copy(
                                                            color = ElectricBlueGlow,
                                                            fontSize = 10.sp
                                                        ),
                                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                    )
                                                }
                                            }

                                            Text(
                                                text = chapter.summary(activeLanguage),
                                                style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.8f))
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                4 -> {
                    // Bookmarks & Reading Progress
                    val totalChapters = BookRepository.allChapters.size
                    val currentIndex = BookRepository.allChapters.indexOfFirst { it.id == selectedChapterId }.coerceAtLeast(0)
                    val progressPercent = ((currentIndex + 1).toFloat() / totalChapters.toFloat())

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text(
                            text = if (activeLanguage == BookLanguage.FRENCH) "Progression & Signets" else "Pwogresyon & Mak-paj",
                            style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                        )

                        // Reading Progress Card
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(14.dp),
                            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
                            border = BorderStroke(1.dp, DeepBlueLighter.copy(alpha = 0.5f))
                        ) {
                            Column(
                                modifier = Modifier.padding(18.dp),
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = if (activeLanguage == BookLanguage.FRENCH) "Progression Globale" else "Nivo Pwogresyon",
                                        style = MaterialTheme.typography.titleMedium.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                                    )
                                    Text(
                                        text = "${(progressPercent * 100).toInt()}%",
                                        style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                                    )
                                }

                                LinearProgressIndicator(
                                    progress = { progressPercent },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(8.dp)
                                        .clip(RoundedCornerShape(4.dp)),
                                    color = ElectricBlue,
                                    trackColor = DeepBlueDark
                                )

                                Text(
                                    text = if (activeLanguage == BookLanguage.FRENCH)
                                        "Chapitre ${currentIndex + 1} sur $totalChapters consultés • Page ${activeChapter.plannedStartPage}/210"
                                    else
                                        "Chapit ${currentIndex + 1} sou $totalChapters • Paj ${activeChapter.plannedStartPage}/210",
                                    style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.7f))
                                )
                            }
                        }

                        // Bookmarks Section
                        Text(
                            text = if (activeLanguage == BookLanguage.FRENCH)
                                "Vos Signets Enregistrés (${bookmarkedChapterIds.size})"
                            else
                                "Mak-paj Ou Sove (${bookmarkedChapterIds.size})",
                            style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                        )

                        if (bookmarkedChapterIds.isEmpty()) {
                            // Empty State
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                colors = CardDefaults.cardColors(containerColor = DeepBlueContainer)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(20.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.BookmarkBorder,
                                        contentDescription = null,
                                        tint = PureWhite.copy(alpha = 0.4f),
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Text(
                                        text = if (activeLanguage == BookLanguage.FRENCH)
                                            "Aucun signet enregistré. Utilisez l'icône de marque-page en haut de l'écran de lecture."
                                        else
                                            "Pa gen okenn mak-paj sove. Klike sou ikòn mak-paj la nan ekran lekti a pou ajoute youn.",
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            color = PureWhite.copy(alpha = 0.6f),
                                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                                        )
                                    )
                                }
                            }
                        } else {
                            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                                bookmarkedChapterIds.forEach { chapterId ->
                                    val chapter = BookRepository.getChapterById(chapterId)
                                    if (chapter != null) {
                                        Card(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable {
                                                    selectedChapterId = chapter.id
                                                    selectedTab = 2
                                                },
                                            shape = RoundedCornerShape(12.dp),
                                            colors = CardDefaults.cardColors(containerColor = DeepBlueDark),
                                            border = BorderStroke(1.dp, DeepBlueLighter)
                                        ) {
                                            Row(
                                                modifier = Modifier.padding(14.dp),
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Default.Bookmark,
                                                    contentDescription = "Signet",
                                                    tint = HaitianRed
                                                )

                                                Column(modifier = Modifier.weight(1f)) {
                                                    Text(
                                                        text = chapter.title(activeLanguage),
                                                        style = MaterialTheme.typography.bodyMedium.copy(
                                                            color = PureWhite,
                                                            fontWeight = FontWeight.Bold
                                                        )
                                                    )
                                                    Text(
                                                        text = "pp. ${chapter.plannedStartPage}–${chapter.plannedEndPage}",
                                                        style = MaterialTheme.typography.bodySmall.copy(
                                                            color = ElectricBlueGlow,
                                                            fontSize = 11.sp
                                                        )
                                                    )
                                                }

                                                IconButton(
                                                    onClick = { bookmarkedChapterIds = bookmarkedChapterIds - chapter.id },
                                                    modifier = Modifier.size(36.dp)
                                                ) {
                                                    Icon(
                                                        imageVector = Icons.Default.Close,
                                                        contentDescription = "Supprimer signet",
                                                        tint = PureWhite.copy(alpha = 0.5f),
                                                        modifier = Modifier.size(16.dp)
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
