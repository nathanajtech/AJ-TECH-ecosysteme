package com.aistudio.ajtech.ecosystem.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.ui.theme.*

@Composable
fun ManifestoScreen(
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
        // Header
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueContainer),
            border = CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(ElectricBlue, HaitianRed)))
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
                    Icon(imageVector = Icons.Default.AutoAwesome, contentDescription = "Manifeste", tint = ElectricBlueGlow)
                    Text(
                        text = "Le Manifeste d'AJ-TECH",
                        style = MaterialTheme.typography.titleLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold)
                    )
                }

                Text(
                    text = "Pour la Souveraineté Numérique et l'Émancipation Technologique d'Haïti",
                    style = MaterialTheme.typography.bodyMedium.copy(color = ElectricBlueGlow, fontWeight = FontWeight.SemiBold)
                )

                Text(
                    text = "Par Jonathan Germain — Fondateur d’AJ-TECH • Port-au-Prince, Haïti",
                    style = MaterialTheme.typography.bodySmall.copy(color = PureWhite.copy(alpha = 0.7f))
                )
            }
        }

        // Quote Banner
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Icon(imageVector = Icons.Default.FormatQuote, contentDescription = "Quote", tint = ElectricBlueGlow, modifier = Modifier.size(32.dp))
                Text(
                    text = "« Nous ne construisons pas seulement du code. Nous érigeons l'infrastructure intellectuelle et industrielle qui permettra à Haïti de décider elle-même de son avenir numérique. »",
                    style = MaterialTheme.typography.bodyLarge.copy(color = PureWhite, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, lineHeight = 24.sp)
                )
            }
        }

        // Articles of Manifesto
        ManifestoArticleCard(
            number = "ARTICLE I",
            title = "De la Souveraineté Numérique",
            content = "Haïti ne peut demeurer un simple consommateur dépendant de logiciels conçus ailleurs. La maîtrise de nos données, de nos infrastructures cloud et de nos outils financiers est un droit fondamental et un impératif stratégique."
        )

        ManifestoArticleCard(
            number = "ARTICLE II",
            title = "De la Transparence Absolue",
            content = "L'authenticité est notre boussole. Nous refusons les illusions marketing et les fausses déclarations. Chaque produit de l'écosystème AJ-TECH affiche son statut réel : Opérationnel, En Développement, Concept ou Planifié."
        )

        ManifestoArticleCard(
            number = "ARTICLE III",
            title = "De la Résilience et de l'Excellence",
            content = "Nos logiciels, à l'image d'AJ-Task, sont conçus pour fonctionner face aux réalités du terrain : mode hors-ligne (Offline-First), faible consommation de données, rapidité et fiabilité éprouvées."
        )

        ManifestoArticleCard(
            number = "ARTICLE IV",
            title = "Du Capital Humain et de la Jeunesse",
            content = "La plus grande richesse d'Haïti est sa jeunesse. À travers l'éducation (EDUKA, AJ-Learn, AJ-MathQuest) et l'animation de la communauté (AJ-Dev), nous formons l'élite technologique de demain."
        )

        ManifestoArticleCard(
            number = "ARTICLE V",
            title = "Du Rayonnement International",
            content = "« L'innovation haïtienne au service du monde ». Nos solutions n'ont pas pour seule vocation d'être locales : elles doivent rivaliser en qualité et en ingéniosité sur la scène internationale."
        )

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun ManifestoArticleCard(number: String, title: String, content: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = DeepBlueContainer)
    ) {
        Column(modifier = Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(text = number, style = MaterialTheme.typography.labelSmall.copy(color = ElectricBlueGlow, fontWeight = FontWeight.Bold, letterSpacing = 1.2.sp))
            Text(text = title, style = MaterialTheme.typography.titleMedium.copy(color = PureWhite, fontWeight = FontWeight.Bold))
            Text(text = content, style = MaterialTheme.typography.bodyMedium.copy(color = PureWhite.copy(alpha = 0.85f), lineHeight = 20.sp))
        }
    }
}
