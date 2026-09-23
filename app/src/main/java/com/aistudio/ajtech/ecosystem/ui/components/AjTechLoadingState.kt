package com.aistudio.ajtech.ecosystem.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.R
import com.aistudio.ajtech.ecosystem.ui.theme.DeepBlueCanvas
import com.aistudio.ajtech.ecosystem.ui.theme.DeepBlueContainer
import com.aistudio.ajtech.ecosystem.ui.theme.DeepBlueDark
import com.aistudio.ajtech.ecosystem.ui.theme.ElectricBlue
import com.aistudio.ajtech.ecosystem.ui.theme.ElectricBlueGlow
import com.aistudio.ajtech.ecosystem.ui.theme.GlowAccent
import com.aistudio.ajtech.ecosystem.ui.theme.HaitianRed
import com.aistudio.ajtech.ecosystem.ui.theme.OffWhite
import com.aistudio.ajtech.ecosystem.ui.theme.PureWhite

/**
 * Reusable Loading State Component for AJ-TECH.
 * Used during Firebase initialization, remote Firestore synchronization,
 * or heavy ecosystem data operations.
 *
 * @param modifier Modifier for styling and layout.
 * @param message Primary title text for the loading state.
 * @param subtitle Secondary explanatory text.
 * @param progress Optional determinate progress from 0.0f to 1.0f. If null, indeterminate.
 * @param isFullScreen If true, fills max size with deep tech gradient background.
 */
@Composable
fun AjTechLoadingState(
    modifier: Modifier = Modifier,
    message: String = stringResource(R.string.loading_syncing_ecosystem),
    subtitle: String? = stringResource(R.string.loading_subtext),
    progress: Float? = null,
    isFullScreen: Boolean = false
) {
    val backgroundModifier = if (isFullScreen) {
        Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        DeepBlueDark,
                        DeepBlueCanvas,
                        DeepBlueDark
                    )
                )
            )
    } else {
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(DeepBlueContainer.copy(alpha = 0.65f))
            .border(
                width = 1.dp,
                color = ElectricBlue.copy(alpha = 0.3f),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(24.dp)
    }

    Box(
        modifier = modifier
            .then(backgroundModifier)
            .testTag("loading_state_container"),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            // Animated Pulse & Logo Badge
            AjTechPulseIndicator(
                size = if (isFullScreen) 100.dp else 76.dp,
                progress = progress
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Primary Message
            Text(
                text = message,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = if (isFullScreen) 18.sp else 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                ),
                color = PureWhite,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .testTag("loading_message")
            )

            // Optional Subtitle
            if (!subtitle.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal,
                        letterSpacing = 0.2.sp
                    ),
                    color = OffWhite.copy(alpha = 0.75f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
            }

            // Optional Progress Bar
            if (progress != null) {
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.width(220.dp)
                ) {
                    LinearProgressIndicator(
                        progress = { progress.coerceIn(0f, 1f) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .testTag("loading_progress_bar"),
                        color = ElectricBlueGlow,
                        trackColor = DeepBlueDark.copy(alpha = 0.8f),
                        strokeCap = StrokeCap.Round
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "${(progress.coerceIn(0f, 1f) * 100).toInt()}%",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.SemiBold
                        ),
                        color = GlowAccent
                    )
                }
            }
        }
    }
}

/**
 * Animated Pulse Indicator featuring the AJ brand monogram and orbiting glow.
 */
@Composable
fun AjTechPulseIndicator(
    modifier: Modifier = Modifier,
    size: Dp = 80.dp,
    progress: Float? = null
) {
    val infiniteTransition = rememberInfiniteTransition(label = "ajtech_loading_pulse")

    // Pulsing outer scale
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 0.92f,
        targetValue = 1.08f,
        animationSpec = infiniteRepeatable(
            animation = tween(1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse_scale"
    )

    // Glowing rotation
    val rotationAngle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(2400, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "rotation_angle"
    )

    // Outer glow aura alpha
    val auraAlpha by infiniteTransition.animateFloat(
        initialValue = 0.25f,
        targetValue = 0.65f,
        animationSpec = infiniteRepeatable(
            animation = tween(1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "aura_alpha"
    )

    Box(
        modifier = modifier
            .size(size)
            .testTag("loading_indicator"),
        contentAlignment = Alignment.Center
    ) {
        // Outer pulsing gradient aura
        Box(
            modifier = Modifier
                .size(size)
                .scale(pulseScale)
                .clip(CircleShape)
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            ElectricBlueGlow.copy(alpha = auraAlpha),
                            ElectricBlue.copy(alpha = auraAlpha * 0.5f),
                            Color.Transparent
                        )
                    )
                )
        )

        // Indeterminate or determinate circular progress ring
        if (progress == null) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(size * 0.9f)
                    .rotate(rotationAngle),
                color = ElectricBlueGlow,
                trackColor = ElectricBlue.copy(alpha = 0.2f),
                strokeWidth = 3.dp,
                strokeCap = StrokeCap.Round
            )
        } else {
            CircularProgressIndicator(
                progress = { progress.coerceIn(0f, 1f) },
                modifier = Modifier.size(size * 0.9f),
                color = ElectricBlueGlow,
                trackColor = DeepBlueDark.copy(alpha = 0.6f),
                strokeWidth = 3.dp,
                strokeCap = StrokeCap.Round
            )
        }

        // Inner Core Badge with AJ Monogram
        Box(
            modifier = Modifier
                .size(size * 0.62f)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            DeepBlueDark,
                            DeepBlueContainer
                        )
                    )
                )
                .border(
                    width = 1.5.dp,
                    brush = Brush.linearGradient(
                        colors = listOf(
                            ElectricBlueGlow,
                            HaitianRed.copy(alpha = 0.8f)
                        )
                    ),
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "AJ",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = (size.value * 0.22f).sp,
                    fontWeight = FontWeight.ExtraBold,
                    letterSpacing = 1.sp
                ),
                color = PureWhite
            )
        }
    }
}

/**
 * Reusable Shimmer Skeleton Card for lists while fetching Firestore entities.
 */
@Composable
fun AjTechShimmerCard(
    modifier: Modifier = Modifier,
    height: Dp = 100.dp
) {
    val transition = rememberInfiniteTransition(label = "shimmer_transition")
    val translateAnim by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "shimmer_translate"
    )

    val shimmerBrush = Brush.linearGradient(
        colors = listOf(
            DeepBlueContainer.copy(alpha = 0.7f),
            DeepBlueContainer.copy(alpha = 0.35f),
            DeepBlueContainer.copy(alpha = 0.7f)
        ),
        start = Offset(translateAnim - 500f, translateAnim - 500f),
        end = Offset(translateAnim, translateAnim)
    )

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(16.dp))
            .border(
                1.dp,
                ElectricBlue.copy(alpha = 0.15f),
                RoundedCornerShape(16.dp)
            ),
        color = DeepBlueDark.copy(alpha = 0.6f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.55f)
                    .height(18.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(shimmerBrush)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .height(14.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(shimmerBrush)
            )
        }
    }
}

@Preview(name = "AJ-TECH Loading State Inline", showBackground = true, backgroundColor = 0xFF030A16)
@Composable
fun PreviewAjTechLoadingStateInline() {
    AjTechLoadingState(
        message = "Initialisation de Firebase…",
        subtitle = "Synchronisation de l'écosystème AJ-TECH"
    )
}

@Preview(name = "AJ-TECH Loading State Determinate", showBackground = true, backgroundColor = 0xFF030A16)
@Composable
fun PreviewAjTechLoadingStateDeterminate() {
    AjTechLoadingState(
        message = "Téléchargement des données…",
        subtitle = "Entités 14/22 synchronisées",
        progress = 0.65f
    )
}

@Preview(name = "AJ-TECH Shimmer Card", showBackground = true, backgroundColor = 0xFF030A16)
@Composable
fun PreviewAjTechShimmerCard() {
    AjTechShimmerCard()
}
