package com.aistudio.ajtech.ecosystem.ui.screens

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.ui.theme.*

@Composable
fun EditionSpecsScreen(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(DeepBlueCanvas)
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        // Technical Header
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
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Print,
                        contentDescription = "Print Specs",
                        tint = ElectricBlueGlow
                    )
                    Text(
                        text = "Fiche Technique d'Édition",
                        style = MaterialTheme.typography.titleLarge.copy(
                            color = PureWhite,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }

                Text(
                    text = "Spécifications éditoriales prévues pour l'impression, la diffusion numérique EPUB et l'archivage institutionnel.",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = PureWhite.copy(alpha = 0.85f)
                    )
                )
            }
        }

        // Specs Grid
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = DeepBlueDark)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Text(
                    text = "Paramètres Typographiques & Matériels",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = ElectricBlueGlow,
                        fontWeight = FontWeight.Bold
                    )
                )

                SpecRow(label = "Titre Officiel", value = "AJ-TECH — L’Écosystème Numérique Haïtien")
                SpecRow(label = "Slogan", value = "Vision, Technologie et Avenir")
                SpecRow(label = "Devise", value = "L’innovation haïtienne au service du monde")
                SpecRow(label = "Auteur & Titre", value = "Jonathan Germain (Fondateur d’AJ-TECH)")
                SpecRow(label = "Lieu d'Édition", value = "Port-au-Prince, Haïti 🇭🇹")
                SpecRow(label = "Année de Parution", value = "2026")
                SpecRow(label = "Format Physique", value = "6 x 9 pouces (152.4 x 228.6 mm)")
                SpecRow(label = "Impression", value = "Offset Quadri CMYK / 300 DPI High-Res")
                SpecRow(label = "Profil Couleur", value = "Coated FOGRA39 (Rich Deep Blue & Red)")
                SpecRow(label = "Reliure", value = "Couverture Rigide Reliée / Vernis Sélectif")
                SpecRow(label = "Marges de Fond Perdu", value = "3.175 mm (0.125 in)")
                SpecRow(label = "Marge de Sécurité", value = "12.7 mm (0.5 in)")
                SpecRow(label = "ISBN", value = "ISBN : À attribuer")
            }
        }

        // Action Cards (Honest Export Status)
        Text(
            text = "Exportation & Diffusion",
            style = MaterialTheme.typography.titleLarge.copy(
                color = PureWhite,
                fontWeight = FontWeight.Bold
            )
        )

        Button(
            onClick = {
                Toast.makeText(context, "Exportation PDF : Fonction en préparation", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = DeepBlueContainer)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Download, contentDescription = "Download PDF", tint = ElectricBlueGlow)
                Text(
                    text = "Télécharger Couverture PDF (Fonction en préparation)",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = PureWhite,
                        fontSize = 13.sp
                    )
                )
            }
        }

        OutlinedButton(
            onClick = {
                Toast.makeText(context, "Exportation EPUB : Export prochainement disponible", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp),
            border = CardDefaults.outlinedCardBorder().copy(brush = Brush.horizontalGradient(listOf(ElectricBlueGlow, HaitianRed)))
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.MenuBook, contentDescription = "Download EPUB", tint = ElectricBlueGlow)
                Text(
                    text = "Fiche EPUB Liseuses (Export prochainement disponible)",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = PureWhite,
                        fontSize = 13.sp
                    )
                )
            }
        }

        OutlinedButton(
            onClick = {
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "AJ-TECH — L’Écosystème Numérique Haïtien\nJonathan Germain (Fondateur d’AJ-TECH, Port-au-Prince, Haïti)\nSlogan : Vision, Technologie et Avenir\nDevise : L’innovation haïtienne au service du monde")
                    type = "text/plain"
                }
                val shareIntent = Intent.createChooser(sendIntent, "Partager la Fiche AJ-TECH")
                context.startActivity(shareIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Share, contentDescription = "Share", tint = PureWhite)
                Text(
                    text = "Partager la Fiche d'Ouvrage AJ-TECH",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = PureWhite,
                        fontSize = 13.sp
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun SpecRow(label: String, value: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = PureWhite.copy(alpha = 0.65f),
                    fontSize = 13.sp
                ),
                modifier = Modifier.weight(0.4f)
            )
            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = PureWhite,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                ),
                modifier = Modifier.weight(0.6f)
            )
        }
        HorizontalDivider(color = DeepBlueContainer, thickness = 1.dp)
    }
}
