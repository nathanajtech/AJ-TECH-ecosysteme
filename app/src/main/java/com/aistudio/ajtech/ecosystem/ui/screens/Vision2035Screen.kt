package com.aistudio.ajtech.ecosystem.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.ui.theme.*

@Composable
fun Vision2035Screen(
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
        // Title Banner
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
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(imageVector = Icons.Default.RocketLaunch, contentDescription = "Vision 2035", tint = ElectricBlueGlow)
                    Text(
                        text = "Vision 2035 d'AJ-TECH",
                        style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                    )
                }

                Text(
                    text = "Bâtir le socle technologique et industriel de la souveraineté numérique d'Haïti d'ici 2035.",
                    style = MaterialTheme.typography.bodyMedium.copy(color = PureWhite.copy(alpha = 0.85f))
                )
            }
        }

        // Executive Summary
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Résumé Exécutif & Objectifs",
                    style = MaterialTheme.typography.titleMedium.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold)
                )

                Text(
                    text = "La Vision 2035 pose la première pierre d'un écosystème numérique haïtien souverain, ambitieux et orienté vers l'exportation internationale de solutions technologiques. À travers la démarche d'AJ-TECH initiée à Port-au-Prince par Jonathan Germain, cette vision analyse les leviers stratégiques pour positionner Haïti comme un pôle d'innovation majeur.",
                    style = MaterialTheme.typography.bodyMedium.copy(color = PureWhite.copy(alpha = 0.85f), lineHeight = 22.sp)
                )
            }
        }

        // The 4 Strategic Pillars
        Text(
            text = "Les 4 Piliers Stratégiques",
            style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
        )

        PillarItem(
            icon = Icons.Default.RocketLaunch,
            title = "1. Infrastructures & Souveraineté Cloud",
            desc = "Implantation progressive d'infrastructures cloud locales (AJ-Cloud) et résilience hors-ligne (architectures PWA comme AJ-Task) pour préserver les données nationales."
        )

        PillarItem(
            icon = Icons.Default.Lightbulb,
            title = "2. Capital Humain & Formation Élite",
            desc = "Formation de 100 000 jeunes talents en génie logiciel, intelligence artificielle et cybersécurité via EDUKA et AJ-Learn à Port-au-Prince et dans les départements."
        )

        PillarItem(
            icon = Icons.Default.Public,
            title = "3. Rayonnement International",
            desc = "Positionner 'L'innovation haïtienne au service du monde' en exportant les solutions logicielles d'AJ-TECH vers la Caraïbe, la diaspora et les marchés mondiaux."
        )

        PillarItem(
            icon = Icons.Default.CheckCircle,
            title = "4. Transparence & Rigueur Institutionnelle",
            desc = "Une gouvernance irréprochable basée sur la clarté des statuts réels des produits (Opérationnel, Développement, Concept, Planifié) sans fausses promesses."
        )

        // Roadmap Quinquennat
        Text(
            text = "Déploiement Stratégique 2025-2035",
            style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
        )

        RoadmapPhaseCard(
            years = "Phase 1 : 2025 - 2028",
            title = "Fondations, Prototypes & Bêta-Tests",
            details = "• Structuration d'AJ-TECH à Port-au-Prince (2025)\n• Finalisation et déploiement de la PWA AJ-Task (en cours de test)\n• Prototypage de la suite éducative EDUKA et AJ-MathQuest\n• Lancement de la communauté des développeurs AJ-Dev"
        )

        RoadmapPhaseCard(
            years = "Phase 2 : 2028 - 2032",
            title = "Infrastructures Financières & Cloud",
            details = "• Développement des passerelles de paiement AJ-Pay & AJ-Wallet\n• Étude d'implantation du datacenter local AJ-Cloud\n• Déploiement grand public des outils de productivité (AJ-Chat, AJ-Meet, AJ-Mail)"
        )

        RoadmapPhaseCard(
            years = "Phase 3 : 2032 - 2035",
            title = "Souveraineté Complète & Exportation Mondiale",
            details = "• Opérationnalité complète des 21 entités de l'écosystème\n• Exportation massive du savoir-faire logiciel haïtien à l'international\n• Consolidations des partenariats industriels et académiques"
        )

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun PillarItem(icon: ImageVector, title: String, desc: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = DeepBlueContainer)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(ElectricBlue.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(imageVector = icon, contentDescription = title, tint = ElectricBlueGlow)
            }
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(text = title, style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold))
                Text(text = desc, style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.8f), lineHeight = 16.sp))
            }
        }
    }
}

@Composable
private fun RoadmapPhaseCard(years: String, title: String, details: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = DeepBlueDark),
        border = CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(ElectricBlueGlow, Color.Transparent)))
    ) {
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(text = years, style = MaterialTheme.typography.labelMedium.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold))
            Text(text = title, style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold))
            Text(text = details, style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.85f), lineHeight = 18.sp))
        }
    }
}
