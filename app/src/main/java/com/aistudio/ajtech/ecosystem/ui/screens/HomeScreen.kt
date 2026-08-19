package com.aistudio.ajtech.ecosystem.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.R
import com.aistudio.ajtech.ecosystem.data.repository.EcosystemRepository
import com.aistudio.ajtech.ecosystem.ui.theme.*

@Composable
fun HomeScreen(
    onNavigateTo: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    val operationalCount = remember { EcosystemRepository.getEntitiesByStatus(com.aistudio.ajtech.ecosystem.data.model.EntityStatus.OPERATIONAL).size }
    val devCount = remember { EcosystemRepository.getEntitiesByStatus(com.aistudio.ajtech.ecosystem.data.model.EntityStatus.IN_DEVELOPMENT).size }
    val conceptCount = remember { EcosystemRepository.getEntitiesByStatus(com.aistudio.ajtech.ecosystem.data.model.EntityStatus.CONCEPT).size }
    val plannedCount = remember { EcosystemRepository.getEntitiesByStatus(com.aistudio.ajtech.ecosystem.data.model.EntityStatus.PLANNED).size }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(DeepBlueCanvas)
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        // Hero Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
            border = CardDefaults.outlinedCardBorder().copy(
                brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed, ElectricBlueGlow))
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Logo Frame
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(PureWhite)
                        .border(2.dp, ElectricBlueGlow, RoundedCornerShape(16.dp))
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.aj_tech_logo),
                        contentDescription = "AJ-TECH Official Logo",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Text(
                    text = "AJ-TECH",
                    style = MaterialTheme.typography.displaySmall.copy(
                        color = PureWhite,
                        fontWeight = FontWeight.Black,
                        letterSpacing = 2.sp
                    )
                )

                Text(
                    text = "L’Écosystème Numérique Haïtien",
                    style = MaterialTheme.typography.titleLarge.copy(
                        color = ElectricBlueGlow,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )

                Surface(
                    color = DeepBlueDark,
                    shape = RoundedCornerShape(12.dp),
                    border = CardDefaults.outlinedCardBorder().copy(
                        brush = Brush.horizontalGradient(listOf(ElectricBlue.copy(alpha = 0.5f), HaitianRed.copy(alpha = 0.5f)))
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "« Vision, Technologie et Avenir »",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                color = PureWhite,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic
                            )
                        )
                        Text(
                            text = "« L’innovation haïtienne au service du monde »",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = ElectricBlueGlow,
                                fontStyle = FontStyle.Italic
                            )
                        )
                    }
                }

                HorizontalDivider(color = DeepBlueDark, thickness = 1.dp)

                // Author Info
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.author_jonathan),
                        contentDescription = "Jonathan Germain",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .border(1.dp, ElectricBlue, CircleShape)
                    )
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text(
                                text = "Jonathan Germain",
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    color = PureWhite,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Icon(
                                imageVector = Icons.Default.Verified,
                                contentDescription = "Verified",
                                tint = ElectricBlueGlow,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                        Text(
                            text = "Fondateur d’AJ-TECH • Port-au-Prince (2025)",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = PureWhite.copy(alpha = 0.7f)
                            )
                        )
                    }
                }
            }
        }

        // Official Status Transparency Banner
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark),
            border = CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(ElectricBlue.copy(alpha = 0.4f), Color.Transparent)))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Transparency",
                        tint = ElectricBlueGlow
                    )
                    Text(
                        text = "Transparence Officielle sur l'Écosystème",
                        style = MaterialTheme.typography.titleMedium.copy(
                            color = PureWhite,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }

                Text(
                    text = "AJ-TECH est une entreprise technologique haïtienne ambitieuse en construction, fondée en 2025 à Port-au-Prince. Chaque produit de l'écosystème est classé selon son état réel :",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = PureWhite.copy(alpha = 0.85f),
                        fontSize = 13.sp,
                        lineHeight = 18.sp
                    )
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    StatusChip(symbol = "🟢", label = "Opérationnel", count = "$operationalCount")
                    StatusChip(symbol = "🟡", label = "Développement", count = "$devCount")
                    StatusChip(symbol = "🔵", label = "Concept", count = "$conceptCount")
                    StatusChip(symbol = "⚪", label = "Planifié", count = "$plannedCount")
                }
            }
        }

        // AJ-Task Spotlight Card
        val ajTask = EcosystemRepository.getEntityById("aj_task")
        if (ajTask != null) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onNavigateTo("ecosystem") },
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
                border = CardDefaults.outlinedCardBorder().copy(
                    brush = Brush.horizontalGradient(listOf(StatusYellow, ElectricBlue))
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            color = StatusYellow.copy(alpha = 0.2f),
                            shape = RoundedCornerShape(20.dp),
                            border = CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(StatusYellow, PureWhite)))
                        ) {
                            Text(
                                text = "${ajTask.status.symbol} ${ajTask.status.label}",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = StatusYellow,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                            )
                        }

                        Text(
                            text = "PRODUIT EN VEDETTE",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = ElectricBlueGlow,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }

                    Text(
                        text = ajTask.name,
                        style = MaterialTheme.typography.headlineSmall.copy(
                            color = PureWhite,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    Text(
                        text = ajTask.description,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = PureWhite.copy(alpha = 0.85f),
                            lineHeight = 20.sp
                        )
                    )

                    Surface(
                        color = DeepBlueDark,
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = ajTask.pwaDetails ?: "",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = ElectricBlueGlow,
                                fontWeight = FontWeight.Medium
                            ),
                            modifier = Modifier.padding(10.dp)
                        )
                    }
                }
            }
        }

        // Navigation Grid
        Text(
            text = "Explorer l'Application Compagnon",
            style = MaterialTheme.typography.titleLarge.copy(
                color = PureWhite,
                fontWeight = FontWeight.Bold
            )
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            HomeNavTile(
                icon = Icons.Default.MenuBook,
                title = "Livre Compagnon",
                subtitle = "Sommaire & Lecteur",
                modifier = Modifier
                    .weight(1f)
                    .testTag("home_nav_book"),
                onClick = { onNavigateTo("book") }
            )
            HomeNavTile(
                icon = Icons.Default.Category,
                title = "21 Entités",
                subtitle = "Écosystème Officiel",
                modifier = Modifier
                    .weight(1f)
                    .testTag("home_nav_ecosystem"),
                onClick = { onNavigateTo("ecosystem") }
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            HomeNavTile(
                icon = Icons.Default.RocketLaunch,
                title = "Vision 2035",
                subtitle = "Piliers Strategiques",
                modifier = Modifier
                    .weight(1f)
                    .testTag("home_nav_vision"),
                onClick = { onNavigateTo("vision") }
            )
            HomeNavTile(
                icon = Icons.Default.AutoAwesome,
                title = "Manifeste",
                subtitle = "Souveraineté Numérique",
                modifier = Modifier
                    .weight(1f)
                    .testTag("home_nav_manifesto"),
                onClick = { onNavigateTo("manifesto") }
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun StatusChip(symbol: String, label: String, count: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(text = "$symbol $count", style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold, color = PureWhite))
        Text(text = label, style = MaterialTheme.typography.labelSmall.copy(color = PureWhite.copy(alpha = 0.65f), fontSize = 10.sp))
    }
}

@Composable
private fun HomeNavTile(
    icon: ImageVector,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier.clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = DeepBlueDark),
        border = CardDefaults.outlinedCardBorder().copy(brush = Brush.linearGradient(listOf(ElectricBlue.copy(alpha = 0.3f), Color.Transparent)))
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(imageVector = icon, contentDescription = title, tint = ElectricBlueGlow)
            Text(text = title, style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold))
            Text(text = subtitle, style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.7f)))
        }
    }
}
