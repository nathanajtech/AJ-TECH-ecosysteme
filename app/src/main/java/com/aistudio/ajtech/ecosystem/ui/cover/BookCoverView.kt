package com.aistudio.ajtech.ecosystem.ui.cover

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.R
import com.aistudio.ajtech.ecosystem.ui.theme.*

enum class CoverFormatMode {
    HARDCOVER_3D,
    FLAT_PRINT,
    EPUB_READER
}

@Composable
fun BookCoverView(
    modifier: Modifier = Modifier,
    watermarkOpacity: Float = 0.08f,
    formatMode: CoverFormatMode = CoverFormatMode.HARDCOVER_3D,
    animateCanvas: Boolean = true,
    onOpenSpecsClick: () -> Unit = {}
) {
    // 3D Tilt coordinates
    var rotationX by remember { mutableFloatStateOf(0f) }
    var rotationY by remember { mutableFloatStateOf(0f) }

    val animatedRotX by animateFloatAsState(targetValue = rotationX, animationSpec = tween(300), label = "rotX")
    val animatedRotY by animateFloatAsState(targetValue = rotationY, animationSpec = tween(300), label = "rotY")

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.radialGradient(
                    colors = listOf(
                        DeepBlueCanvas,
                        DeepBlueDark
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        // Background Tech Ecosystem Canvas (Data Streams from Haiti)
        TechEcosystemCanvas(
            modifier = Modifier.fillMaxSize(),
            animateDataStreams = animateCanvas,
            showGrid = true
        )

        // Book Frame Container
        val cardWidth = when (formatMode) {
            CoverFormatMode.HARDCOVER_3D -> 340.dp
            CoverFormatMode.FLAT_PRINT -> 330.dp
            CoverFormatMode.EPUB_READER -> 320.dp
        }
        
        val cardAspectRatio = 0.64f // Standard 6x9 vertical book ratio (1 : 1.562)

        Box(
            modifier = Modifier
                .width(cardWidth)
                .aspectRatio(cardAspectRatio)
                .padding(8.dp)
                .graphicsLayer {
                    if (formatMode == CoverFormatMode.HARDCOVER_3D) {
                        this.rotationX = animatedRotX
                        this.rotationY = animatedRotY
                        this.cameraDistance = 16f * density
                    }
                }
                .pointerInput(formatMode) {
                    if (formatMode == CoverFormatMode.HARDCOVER_3D) {
                        detectTransformGestures { _, pan, _, _ ->
                            rotationY = (rotationY + pan.x * 0.08f).coerceIn(-18f, 18f)
                            rotationX = (rotationX - pan.y * 0.08f).coerceIn(-18f, 18f)
                        }
                    }
                }
                .shadow(
                    elevation = if (formatMode == CoverFormatMode.HARDCOVER_3D) 28.dp else 12.dp,
                    shape = RoundedCornerShape(12.dp),
                    clip = false
                )
                .clip(RoundedCornerShape(12.dp))
                .border(
                    width = 1.dp,
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            ElectricBlueGlow.copy(alpha = 0.6f),
                            HaitianRed.copy(alpha = 0.4f),
                            ElectricBlue.copy(alpha = 0.2f)
                        )
                    ),
                    shape = RoundedCornerShape(12.dp)
                )
                .background(DeepBlueCanvas)
        ) {
            // ==================== COVER BACKGROUND LAYERS ====================
            // 1. High-Tech Graphic Texture Layer
            Image(
                painter = painterResource(id = R.drawable.haiti_tech_bg),
                contentDescription = "Haiti Digital Network Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .alpha(0.25f)
            )

            // 2. LOGO REQUIREMENT #2: Massive Background Watermark Logo (5-10% Opacity)
            Image(
                painter = painterResource(id = R.drawable.aj_tech_logo),
                contentDescription = "AJ-TECH Watermark Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth(1.2f)
                    .aspectRatio(1f)
                    .align(Alignment.Center)
                    .alpha(watermarkOpacity)
            )

            // 3. Subtle Gradient Overlays for High Luxury Finish
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                DeepBlueDark.copy(alpha = 0.82f),
                                Color.Transparent,
                                DeepBlueDark.copy(alpha = 0.94f)
                            )
                        )
                    )
            )

            // ==================== OFFICIAL BOOK COVER CONTENT ====================
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp, vertical = 18.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // ------------------ HEADER SECTION ------------------
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // LOGO REQUIREMENT #3: Header Logo
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.aj_tech_logo),
                                contentDescription = "AJ-TECH Header Logo",
                                modifier = Modifier
                                    .height(22.dp)
                                    .clip(RoundedCornerShape(3.dp))
                            )
                            Text(
                                text = "ÉDITIONS INSTITUTIONNELLES",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontSize = 8.sp,
                                    letterSpacing = 1.2.sp,
                                    color = ElectricBlueGlow.copy(alpha = 0.9f)
                                )
                            )
                        }

                        // Year Badge
                        Box(
                            modifier = Modifier
                                .border(
                                    width = 1.dp,
                                    color = HaitianRed.copy(alpha = 0.6f),
                                    shape = RoundedCornerShape(4.dp)
                                )
                                .background(HaitianRedSubtle.copy(alpha = 0.3f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                text = "2026",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = PureWhite,
                                    letterSpacing = 1.sp
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    HorizontalDivider(
                        color = ElectricBlue.copy(alpha = 0.3f),
                        thickness = 1.dp
                    )
                }

                // ------------------ CENTER / UPPER THIRD SECTION ------------------
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    // LOGO REQUIREMENT #1: Prominent Official Logo in Center/Upper Third
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth(0.68f)
                            .padding(vertical = 8.dp)
                            .shadow(12.dp, RoundedCornerShape(12.dp)),
                        color = PureWhite,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(12.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.aj_tech_logo),
                                contentDescription = "AJ-TECH Official Logo",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(max = 70.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // BOOK TITLE
                    Text(
                        text = "L’Écosystème Numérique Haïtien",
                        style = MaterialTheme.typography.displayMedium.copy(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = PureWhite,
                            textAlign = TextAlign.Center,
                            lineHeight = 25.sp,
                            letterSpacing = 0.5.sp
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Accent Red / Blue Rule
                    Row(
                        modifier = Modifier
                            .width(80.dp)
                            .height(3.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .background(ElectricBlue)
                        )
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .background(HaitianRed)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // SLOGAN: « Vision, Technologie et Avenir »
                    Text(
                        text = "Vision, Technologie et Avenir",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = ElectricBlueGlow,
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.8.sp
                        )
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    // DEVISE: « L’innovation haïtienne au service du monde »
                    Text(
                        text = "« L’innovation haïtienne au service du monde »",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Normal,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                            color = PureWhite.copy(alpha = 0.85f),
                            textAlign = TextAlign.Center,
                            lineHeight = 15.sp
                        ),
                        modifier = Modifier.padding(horizontal = 12.dp)
                    )
                }

                // ------------------ FOOTER SECTION ------------------
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    HorizontalDivider(
                        color = ElectricBlue.copy(alpha = 0.3f),
                        thickness = 1.dp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    // AUTHOR CREDS
                    Text(
                        text = "Jonathan Germain",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = PureWhite,
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.5.sp
                        )
                    )

                    Text(
                        text = "Fondateur d’AJ-TECH",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = ElectricBlueGlow.copy(alpha = 0.9f),
                            textAlign = TextAlign.Center
                        )
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // ORIGINE & FOOTER STAMP
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "Port-au-Prince, Haïti 🇭🇹",
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    fontSize = 9.sp,
                                    color = PureWhite.copy(alpha = 0.75f)
                                )
                            )
                        }

                        // LOGO REQUIREMENT #4: Footer Stamp Logo
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.aj_tech_logo),
                                contentDescription = "AJ-TECH Footer Logo",
                                modifier = Modifier
                                    .height(16.dp)
                                    .clip(RoundedCornerShape(2.dp))
                            )
                            Text(
                                text = "PUBLISHING",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontSize = 8.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PureWhite.copy(alpha = 0.6f),
                                    letterSpacing = 1.sp
                                )
                            )
                        }
                    }
                }
            }

            // Hardcover Spine Overlay Effect (For 3D Hardcover Mode)
            if (formatMode == CoverFormatMode.HARDCOVER_3D) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(18.dp)
                        .align(Alignment.CenterStart)
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(
                                    Color.Black.copy(alpha = 0.45f),
                                    Color.White.copy(alpha = 0.15f),
                                    Color.Transparent
                                )
                            )
                        )
                )
            }
        }
    }
}
