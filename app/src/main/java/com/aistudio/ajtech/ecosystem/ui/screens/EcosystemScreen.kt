package com.aistudio.ajtech.ecosystem.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.data.model.BookLanguage
import com.aistudio.ajtech.ecosystem.data.model.EcosystemEntity
import com.aistudio.ajtech.ecosystem.data.model.EntityStatus
import com.aistudio.ajtech.ecosystem.data.repository.EcosystemRepository
import com.aistudio.ajtech.ecosystem.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EcosystemScreen(
    modifier: Modifier = Modifier
) {
    var language by remember { mutableStateOf(BookLanguage.FRENCH) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedStatusFilter by remember { mutableStateOf<EntityStatus?>(null) }
    var selectedEntityForDetail by remember { mutableStateOf<EcosystemEntity?>(null) }

    val isFr = language == BookLanguage.FRENCH

    val operationalCount = remember { EcosystemRepository.getEntitiesByStatus(EntityStatus.OPERATIONAL).size }
    val devCount = remember { EcosystemRepository.getEntitiesByStatus(EntityStatus.IN_DEVELOPMENT).size }
    val conceptCount = remember { EcosystemRepository.getEntitiesByStatus(EntityStatus.CONCEPT).size }
    val plannedCount = remember { EcosystemRepository.getEntitiesByStatus(EntityStatus.PLANNED).size }

    val filteredEntities = remember(searchQuery, selectedStatusFilter, language) {
        val baseList = if (selectedStatusFilter == null) {
            EcosystemRepository.entities
        } else {
            EcosystemRepository.getEntitiesByStatus(selectedStatusFilter)
        }
        if (searchQuery.isBlank()) {
            baseList
        } else {
            val q = searchQuery.lowercase().trim()
            baseList.filter {
                it.name.lowercase().contains(q) ||
                        it.tagline(language).lowercase().contains(q) ||
                        it.origin(language).lowercase().contains(q) ||
                        it.mission(language).lowercase().contains(q) ||
                        it.problem(language).lowercase().contains(q) ||
                        it.solution(language).lowercase().contains(q) ||
                        it.techStack(language).any { tech -> tech.lowercase().contains(q) }
            }
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DeepBlueCanvas)
    ) {
        if (selectedEntityForDetail == null) {
            // Vue Liste & Hiérarchie Écosystème
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Barre Supérieure : Hiérarchie & Sélecteur de Langue
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "AJ-TECH → ÉCOSYSTÈME",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = ElectricBlueGlow,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 1.sp
                            )
                        )
                        Text(
                            text = if (isFr) "Architecture des 22 Entités" else "Arkitekti 22 Antite yo",
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = PureWhite,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }

                    // Bouton de bascule de langue FR / HT
                    Surface(
                        color = DeepBlueDark,
                        shape = RoundedCornerShape(20.dp),
                        border = CardDefaults.outlinedCardBorder().copy(
                            brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed))
                        )
                    ) {
                        Row(modifier = Modifier.padding(4.dp)) {
                            LanguageChip(
                                text = "FR",
                                selected = language == BookLanguage.FRENCH,
                                onClick = { language = BookLanguage.FRENCH },
                                modifier = Modifier.testTag("ecosystem_lang_fr")
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            LanguageChip(
                                text = "HT",
                                selected = language == BookLanguage.KREYOL,
                                onClick = { language = BookLanguage.KREYOL },
                                modifier = Modifier.testTag("ecosystem_lang_ht")
                            )
                        }
                    }
                }

                // Carte Principale de Présentation Hiérarchique
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
                    border = CardDefaults.outlinedCardBorder().copy(
                        brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed))
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (isFr) "22 entités officielles" else "22 antite ofisyèl",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    color = PureWhite,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Surface(
                                color = ElectricBlue.copy(alpha = 0.25f),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = "Total : 22 entités",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = ElectricBlueGlow,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Text(
                            text = if (isFr) {
                                "AJ-TECH est l'entreprise mère et le noyau central. L'écosystème regroupe 22 entités standardisées selon 18 rubriques éditoriales rigoureuses."
                            } else {
                                "AJ-TECH se konpayi manman an ak nwayo santral la. Ekosistèm nan rasanble 22 antite estandadize selon 18 ribrik editoryal egzak."
                            },
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = PureWhite.copy(alpha = 0.85f),
                                lineHeight = 16.sp
                            )
                        )

                        // Visualisation du flux hiérarchique
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(DeepBlueDark.copy(alpha = 0.6f), RoundedCornerShape(8.dp))
                                .padding(8.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            HierarchyNode(title = "AJ-TECH", subtitle = if (isFr) "Noyau Mère" else "Nwayo Manman")
                            Text("↓", color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                            HierarchyNode(title = "ÉCOSYSTÈME", subtitle = if (isFr) "Fédération" else "Federasyon")
                            Text("↓", color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                            HierarchyNode(title = "22 ENTITÉS", subtitle = if (isFr) "Piliers" else "Poto Mitan")
                        }
                    }
                }

                // Barre de recherche
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("search_entities_field"),
                    placeholder = {
                        Text(
                            text = if (isFr) "Rechercher parmi les 22 entités..." else "Chèche nan 22 antite yo...",
                            color = PureWhite.copy(alpha = 0.5f),
                            fontSize = 13.sp
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = ElectricBlueGlow
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Effacer",
                                    tint = PureWhite.copy(alpha = 0.7f)
                                )
                            }
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = ElectricBlueGlow,
                        unfocusedBorderColor = DeepBlueContainer,
                        focusedTextColor = PureWhite,
                        unfocusedTextColor = PureWhite
                    ),
                    shape = RoundedCornerShape(12.dp),
                    singleLine = true
                )

                // Filtres par statuts officiels
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                        .testTag("filter_status_row"),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    FilterChip(
                        modifier = Modifier.testTag("filter_status_all"),
                        selected = selectedStatusFilter == null,
                        onClick = { selectedStatusFilter = null },
                        label = {
                            Text(
                                text = if (isFr) "Toutes (22)" else "Tout (22)",
                                fontWeight = if (selectedStatusFilter == null) FontWeight.Bold else FontWeight.Normal
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ElectricBlue.copy(alpha = 0.3f),
                            selectedLabelColor = PureWhite,
                            containerColor = DeepBlueContainer,
                            labelColor = PureWhite.copy(alpha = 0.8f)
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedStatusFilter == null,
                            borderColor = if (selectedStatusFilter == null) ElectricBlueGlow else DeepBlueContainer
                        )
                    )
                    FilterChip(
                        modifier = Modifier.testTag("filter_status_operational"),
                        selected = selectedStatusFilter == EntityStatus.OPERATIONAL,
                        onClick = { selectedStatusFilter = EntityStatus.OPERATIONAL },
                        label = {
                            Text(
                                text = "🟢 ${EntityStatus.OPERATIONAL.label(language)} ($operationalCount)",
                                color = StatusGreen
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = StatusGreen.copy(alpha = 0.2f),
                            containerColor = DeepBlueContainer
                        )
                    )
                    FilterChip(
                        modifier = Modifier.testTag("filter_status_in_development"),
                        selected = selectedStatusFilter == EntityStatus.IN_DEVELOPMENT,
                        onClick = { selectedStatusFilter = EntityStatus.IN_DEVELOPMENT },
                        label = {
                            Text(
                                text = "🟡 ${if (isFr) "Développement" else "Devlopman"} ($devCount)",
                                color = StatusYellow
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = StatusYellow.copy(alpha = 0.2f),
                            containerColor = DeepBlueContainer
                        )
                    )
                    FilterChip(
                        modifier = Modifier.testTag("filter_status_concept"),
                        selected = selectedStatusFilter == EntityStatus.CONCEPT,
                        onClick = { selectedStatusFilter = EntityStatus.CONCEPT },
                        label = {
                            Text(
                                text = "🔵 ${EntityStatus.CONCEPT.label(language)} ($conceptCount)",
                                color = StatusBlue
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = StatusBlue.copy(alpha = 0.2f),
                            containerColor = DeepBlueContainer
                        )
                    )
                    FilterChip(
                        modifier = Modifier.testTag("filter_status_planned"),
                        selected = selectedStatusFilter == EntityStatus.PLANNED,
                        onClick = { selectedStatusFilter = EntityStatus.PLANNED },
                        label = {
                            Text(
                                text = "⚪ ${EntityStatus.PLANNED.label(language)} ($plannedCount)",
                                color = StatusWhite
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = StatusWhite.copy(alpha = 0.2f),
                            containerColor = DeepBlueContainer
                        )
                    )
                }

                // Liste des cartes d'entités
                if (filteredEntities.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = if (isFr) "Aucune entité ne correspond à vos critères." else "Pa gen okenn antite ki koresponn ak rechèch sa a.",
                            color = PureWhite.copy(alpha = 0.6f),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(filteredEntities, key = { it.id }) { entity ->
                            EntityCardItem(
                                entity = entity,
                                language = language,
                                onClick = { selectedEntityForDetail = entity }
                            )
                        }
                    }
                }
            }
        } else {
            // Fiche Détaillée Normalisée en 18 Rubriques
            EntityDetailView(
                entity = selectedEntityForDetail!!,
                language = language,
                onLanguageChange = { language = it },
                onBack = { selectedEntityForDetail = null }
            )
        }
    }
}

@Composable
private fun LanguageChip(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        color = if (selected) ElectricBlue else Color.Transparent,
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .defaultMinSize(minWidth = 48.dp, minHeight = 40.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
    ) {
        Box(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = if (selected) PureWhite else PureWhite.copy(alpha = 0.6f),
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }
}

@Composable
private fun HierarchyNode(title: String, subtitle: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title, style = MaterialTheme.typography.labelMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold))
        Text(text = subtitle, style = MaterialTheme.typography.labelSmall.copy(color = PureWhite.copy(alpha = 0.6f), fontSize = 10.sp))
    }
}

@Composable
private fun EntityCardItem(
    entity: EcosystemEntity,
    language: BookLanguage,
    onClick: () -> Unit
) {
    val isCore = entity.id == "aj_tech"
    val isPwaHighlight = entity.isPwa

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .testTag("entity_card_${entity.id}"),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isCore) DeepBlueContainer else if (isPwaHighlight) DeepBlueContainer else DeepBlueDark
        ),
        border = if (isCore) {
            CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed)))
        } else if (isPwaHighlight) {
            CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(StatusYellow, ElectricBlue)))
        } else {
            null
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        text = entity.name,
                        style = MaterialTheme.typography.titleMedium.copy(
                            color = PureWhite,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    if (isCore) {
                        Surface(
                            color = HaitianRed.copy(alpha = 0.2f),
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                text = if (language == BookLanguage.FRENCH) "Noyau Mère" else "Nwayo Manman",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = HaitianRed,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp
                                ),
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                Surface(
                    color = entity.status.color.copy(alpha = 0.18f),
                    shape = RoundedCornerShape(16.dp),
                    border = CardDefaults.outlinedCardBorder().copy(
                        brush = Brush.horizontalGradient(listOf(entity.status.color, PureWhite.copy(alpha = 0.4f)))
                    )
                ) {
                    Text(
                        text = "${entity.status.symbol} ${entity.status.label(language)}",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = entity.status.color,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            Text(
                text = entity.tagline(language),
                style = MaterialTheme.typography.bodySmall.copy(
                    color = ElectricBlueGlow,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Text(
                text = entity.origin(language),
                style = MaterialTheme.typography.bodySmall.copy(
                    color = PureWhite.copy(alpha = 0.8f),
                    lineHeight = 16.sp
                ),
                maxLines = 2
            )

            if (entity.isPwa && entity.pwaDetails(language) != null) {
                Surface(
                    color = DeepBlueDark,
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "⚡ ${entity.pwaDetails(language)}",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = StatusYellow,
                            fontSize = 11.sp
                        ),
                        modifier = Modifier.padding(6.dp)
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "18 rubriques normalisées",
                    style = MaterialTheme.typography.labelSmall.copy(color = PureWhite.copy(alpha = 0.5f), fontSize = 10.sp)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = if (language == BookLanguage.FRENCH) "Consulter la fiche" else "Gade fich la",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = ElectricBlueGlow,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "Voir",
                        tint = ElectricBlueGlow,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }
        }
    }
}

/**
 * Vue Fiche Détaillée d'une Entité normalisée selon les 18 rubriques éditoriales.
 */
@Composable
private fun EntityDetailView(
    entity: EcosystemEntity,
    language: BookLanguage,
    onLanguageChange: (BookLanguage) -> Unit,
    onBack: () -> Unit
) {
    val isFr = language == BookLanguage.FRENCH
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Barre de navigation supérieure (Retour + Switch de Langue)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = onBack,
                colors = ButtonDefaults.buttonColors(containerColor = DeepBlueContainer),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.testTag("back_to_ecosystem_button")
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Retour",
                        tint = ElectricBlueGlow,
                        modifier = Modifier.size(18.dp)
                    )
                    Text(
                        text = if (isFr) "← Retour Écosystème" else "← Retounen nan Ekosistèm",
                        color = PureWhite,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Surface(
                color = DeepBlueDark,
                shape = RoundedCornerShape(20.dp),
                border = CardDefaults.outlinedCardBorder().copy(
                    brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed))
                )
            ) {
                Row(modifier = Modifier.padding(4.dp)) {
                    LanguageChip(
                        text = "FR",
                        selected = language == BookLanguage.FRENCH,
                        onClick = { onLanguageChange(BookLanguage.FRENCH) },
                        modifier = Modifier.testTag("detail_lang_fr")
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    LanguageChip(
                        text = "HT",
                        selected = language == BookLanguage.KREYOL,
                        onClick = { onLanguageChange(BookLanguage.KREYOL) },
                        modifier = Modifier.testTag("detail_lang_ht")
                    )
                }
            }
        }

        // 1. Nom & En-tête de la Fiche
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
            border = CardDefaults.outlinedCardBorder().copy(
                brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed))
            )
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "FICHE ENTITÉ OFFICIELLE",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = ElectricBlueGlow,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 1.sp
                            )
                        )
                        Text(
                            text = entity.name,
                            style = MaterialTheme.typography.headlineMedium.copy(
                                color = PureWhite,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }

                    // 2. Statut actuel officiel
                    Surface(
                        color = entity.status.color.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(12.dp),
                        border = CardDefaults.outlinedCardBorder().copy(
                            brush = Brush.horizontalGradient(listOf(entity.status.color, PureWhite.copy(alpha = 0.4f)))
                        )
                    ) {
                        Text(
                            text = "${entity.status.symbol} ${entity.status.label(language)}",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = entity.status.color,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        )
                    }
                }

                Text(
                    text = entity.tagline(language),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = ElectricBlueGlow,
                        fontWeight = FontWeight.SemiBold
                    )
                )

                if (entity.isPwa && entity.pwaDetails(language) != null) {
                    Surface(
                        color = DeepBlueDark,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "⚡ ${entity.pwaDetails(language)}",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = StatusYellow,
                                lineHeight = 16.sp
                            ),
                            modifier = Modifier.padding(10.dp)
                        )
                    }
                }
            }
        }

        // Structure Normalisée : 18 Rubriques
        Text(
            text = if (isFr) "Structure Éditoriale Normalisée (18 Rubriques)" else "Estrikti Editoryal Egzak (18 Ribrik)",
            style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold)
        )

        EditorialSectionCard(
            number = 3,
            title = if (isFr) "Origine du concept" else "Orijin konsèp la",
            content = entity.origin(language)
        )

        EditorialSectionCard(
            number = 4,
            title = if (isFr) "Mission" else "Misyon",
            content = entity.mission(language)
        )

        EditorialSectionCard(
            number = 5,
            title = if (isFr) "Vision" else "Vizyon",
            content = entity.vision(language)
        )

        EditorialSectionCard(
            number = 6,
            title = if (isFr) "Problème résolu" else "Pwoblèm li rezoud",
            content = entity.problem(language)
        )

        EditorialSectionCard(
            number = 7,
            title = if (isFr) "Solution proposée" else "Solisyon li pote",
            content = entity.solution(language)
        )

        EditorialSectionCard(
            number = 8,
            title = if (isFr) "Public cible" else "Moun li vize yo",
            content = entity.targetAudience(language)
        )

        // 9. Fonctionnalités principales
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = "9. " + (if (isFr) "Fonctionnalités principales" else "Fonksyonalite prensipal yo"),
                    style = MaterialTheme.typography.labelLarge.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                )
                entity.features(language).forEach { feat ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text("•", color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                        Text(
                            text = feat,
                            style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.9f), lineHeight = 16.sp)
                        )
                    }
                }
            }
        }

        EditorialSectionCard(
            number = 10,
            title = if (isFr) "Architecture technique" else "Arkitekti teknik",
            content = entity.architecture(language)
        )

        // 11. Technologies envisagées
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = "11. " + (if (isFr) "Technologies envisagées" else "Teknoloji yo prevwa itilize"),
                    style = MaterialTheme.typography.labelLarge.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = entity.techStack(language).joinToString("  •  "),
                        style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.9f), lineHeight = 16.sp)
                    )
                }
            }
        }

        EditorialSectionCard(
            number = 12,
            title = if (isFr) "Intelligence artificielle" else "Entèlijans atifisyèl",
            content = entity.aiRole(language)
        )

        EditorialSectionCard(
            number = 13,
            title = if (isFr) "Sécurité" else "Sekirite",
            content = entity.security(language)
        )

        EditorialSectionCard(
            number = 14,
            title = if (isFr) "Modèle économique" else "Modèl ekonomik",
            content = entity.businessModel(language)
        )

        EditorialSectionCard(
            number = 15,
            title = if (isFr) "Intégration avec AJ-TECH" else "Entegrasyon ak AJ-TECH",
            content = entity.ajTechIntegration(language)
        )

        EditorialSectionCard(
            number = 16,
            title = if (isFr) "Relations avec les autres entités" else "Koneksyon ak lòt antite yo",
            content = entity.relatedEntities(language)
        )

        // 17. Feuille de route 2026–2035
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = "17. " + (if (isFr) "Feuille de route 2026–2035" else "Plan wout 2026–2035"),
                    style = MaterialTheme.typography.labelLarge.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                )
                entity.roadmap(language).forEach { step ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text("➡️", fontSize = 12.sp)
                        Text(
                            text = step,
                            style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.9f), lineHeight = 16.sp)
                        )
                    }
                }
            }
        }

        EditorialSectionCard(
            number = 18,
            title = if (isFr) "Perspectives internationales" else "Pèspektif entènasyonal",
            content = entity.internationalOutlooks(language)
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Bouton Bas de page retour
        Button(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = ElectricBlue),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = if (isFr) "Retour à la liste des 22 entités" else "Retounen nan lis 22 antite yo",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
            )
        }
    }
}

@Composable
private fun EditorialSectionCard(
    number: Int,
    title: String,
    content: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "$number. $title",
                style = MaterialTheme.typography.labelLarge.copy(
                    color = ElectricBlueGlow,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = content,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = PureWhite.copy(alpha = 0.9f),
                    lineHeight = 17.sp
                )
            )
        }
    }
}
