package com.aistudio.ajtech.ecosystem.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.R
import com.aistudio.ajtech.ecosystem.ui.theme.*

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(DeepBlueCanvas)
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        // Author Profile Header
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
            border = CardDefaults.outlinedCardBorder().copy(
                brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed))
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Profile Avatar Frame (Real Photo)
                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .border(
                            width = 2.dp,
                            brush = Brush.sweepGradient(listOf(ElectricBlue, HaitianRed, ElectricBlueGlow)),
                            shape = RoundedCornerShape(18.dp)
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.author_jonathan),
                        contentDescription = "Jonathan Germain - Fondateur d'AJ-TECH",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Jonathan Germain",
                            style = MaterialTheme.typography.displayMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = PureWhite,
                                fontSize = 24.sp
                            )
                        )
                        Icon(
                            imageVector = Icons.Default.Verified,
                            contentDescription = "Verified Author",
                            tint = ElectricBlueGlow,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Surface(
                        color = ElectricBlue.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(20.dp),
                        border = CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(ElectricBlue, ElectricBlueGlow)))
                    ) {
                        Text(
                            text = "Fondateur d’AJ-TECH",
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = ElectricBlueGlow,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 13.sp
                            ),
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location",
                            tint = HaitianRed,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "Port-au-Prince, Haïti 🇭🇹 • Création en 2025",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = PureWhite.copy(alpha = 0.85f),
                                fontWeight = FontWeight.Medium
                            )
                        )
                    }
                }
            }
        }

        // Author Quote
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Icon(imageVector = Icons.Default.FormatQuote, contentDescription = "Quote", tint = ElectricBlueGlow, modifier = Modifier.size(32.dp))
                Text(
                    text = "« AJ-TECH est une démarche d'émancipation. Nous construisons avec rigueur et honnêteté les fondations d'un écosystème numérique dont Haïti sera fière. »",
                    style = MaterialTheme.typography.bodyLarge.copy(color = PureWhite, fontWeight = FontWeight.Medium, fontStyle = FontStyle.Italic, lineHeight = 24.sp)
                )
                Text(
                    text = "— Jonathan Germain (Port-au-Prince, 2026)",
                    style = MaterialTheme.typography.labelMedium.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold),
                    modifier = Modifier.align(Alignment.End)
                )
            }
        }

        // Transparent Status of AJ-TECH Assets
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Icon(imageVector = Icons.Default.Business, contentDescription = "Asset Status", tint = ElectricBlueGlow)
                    Text(
                        text = "Statut Réel d'AJ-TECH (Transparence)",
                        style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                    )
                }

                Text(
                    text = "AJ-TECH est une entreprise technologique haïtienne ambitieuse en construction, fondée en 2025 à Port-au-Prince par Jonathan Germain. Elle ne doit pas être présentée comme une grande firme déjà établie.",
                    style = MaterialTheme.typography.bodyMedium.copy(color = PureWhite.copy(alpha = 0.85f), lineHeight = 20.sp)
                )

                Text(
                    text = "Actifs & Réalisations réelles d'AJ-TECH à ce jour :",
                    style = MaterialTheme.typography.titleSmall.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                )

                AssetRow(icon = Icons.Default.Verified, title = "Identité Visuelle", desc = "Logo officiel créé et intégré")
                AssetRow(icon = Icons.Default.Language, title = "Présence Web", desc = "Site web existant (en cours d'amélioration)")
                AssetRow(icon = Icons.Default.Code, title = "Code Source", desc = "Comptes réseaux sociaux & Dépôts GitHub actifs")
                AssetRow(icon = Icons.Default.Info, title = "Produit le plus avancé", desc = "AJ-Task : PWA la plus avancée, testée par des utilisateurs, non commercialisée")

                HorizontalDivider(color = DeepBlueDark, thickness = 1.dp)

                Text(
                    text = "Engagement d'authenticité : Aucun produit n'est actuellement commercialisé officiellement. Aucun faux chiffre d'affaires, partenaire ou investisseur fictif n'est revendiqué.",
                    style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.7f), fontStyle = FontStyle.Italic)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun AssetRow(icon: androidx.compose.ui.graphics.vector.ImageVector, title: String, desc: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Icon(imageVector = icon, contentDescription = title, tint = ElectricBlueGlow, modifier = Modifier.size(18.dp))
        Column {
            Text(text = title, style = MaterialTheme.typography.bodyMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold))
            Text(text = desc, style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.8f)))
        }
    }
}
