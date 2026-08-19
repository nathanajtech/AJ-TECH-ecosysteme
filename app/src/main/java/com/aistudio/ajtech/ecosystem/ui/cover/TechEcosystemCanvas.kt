package com.aistudio.ajtech.ecosystem.ui.cover

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import com.aistudio.ajtech.ecosystem.ui.theme.ElectricBlue
import com.aistudio.ajtech.ecosystem.ui.theme.ElectricBlueGlow
import com.aistudio.ajtech.ecosystem.ui.theme.GlowAccent
import com.aistudio.ajtech.ecosystem.ui.theme.HaitianRed

@Composable
fun TechEcosystemCanvas(
    modifier: Modifier = Modifier,
    animateDataStreams: Boolean = true,
    showGrid: Boolean = true
) {
    val infiniteTransition = rememberInfiniteTransition(label = "tech_canvas_anim")
    
    val pulseAlpha by infiniteTransition.animateFloat(
        initialValue = 0.3f,
        targetValue = 0.85f,
        animationSpec = infiniteRepeatable(
            animation = tween(2400, easing = LinearOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse_alpha"
    )
    
    val streamOffset by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 100f,
        animationSpec = infiniteRepeatable(
            animation = tween(3500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "stream_offset"
    )

    Canvas(modifier = modifier.fillMaxSize()) {
        val width = size.width
        val height = size.height
        
        if (width == 0f || height == 0f) return@Canvas

        // 1. Digital Grid
        if (showGrid) {
            val gridSpacing = 48f
            val gridColor = ElectricBlue.copy(alpha = 0.07f)
            
            var x = 0f
            while (x < width) {
                drawLine(
                    color = gridColor,
                    start = Offset(x, 0f),
                    end = Offset(x, height),
                    strokeWidth = 1f
                )
                x += gridSpacing
            }
            
            var y = 0f
            while (y < height) {
                drawLine(
                    color = gridColor,
                    start = Offset(0f, y),
                    end = Offset(width, y),
                    strokeWidth = 1f
                )
                y += gridSpacing
            }
        }

        // 2. Port-au-Prince Hub Anchor (Centralized South-West)
        val papHub = Offset(width * 0.38f, height * 0.58f)
        
        // Global destination nodes (Miami, New York, Paris, Tokyo, Dakar, Santiago)
        val globalNodes = listOf(
            Offset(width * 0.15f, height * 0.22f), // North America West
            Offset(width * 0.32f, height * 0.18f), // North America East
            Offset(width * 0.72f, height * 0.25f), // Europe
            Offset(width * 0.85f, height * 0.45f), // Asia / Global
            Offset(width * 0.65f, height * 0.68f), // Africa
            Offset(width * 0.28f, height * 0.82f)  // South America
        )

        // 3. Connective Data Streams radiating from Haiti (Port-au-Prince) to the World
        globalNodes.forEachIndexed { index, targetNode ->
            val controlPoint1 = Offset(
                papHub.x + (targetNode.x - papHub.x) * 0.5f - 40f * (if (index % 2 == 0) 1 else -1),
                papHub.y + (targetNode.y - papHub.y) * 0.2f
            )
            val controlPoint2 = Offset(
                papHub.x + (targetNode.x - papHub.x) * 0.8f + 30f * (if (index % 2 == 0) 1 else -1),
                papHub.y + (targetNode.y - papHub.y) * 0.7f
            )

            val streamPath = Path().apply {
                moveTo(papHub.x, papHub.y)
                cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, targetNode.x, targetNode.y)
            }

            // Glow line background
            drawPath(
                path = streamPath,
                color = ElectricBlue.copy(alpha = 0.18f),
                style = Stroke(width = 3f)
            )

            // Animated dash effect
            val dashEffect = if (animateDataStreams) {
                PathEffect.dashPathEffect(floatArrayOf(24f, 48f), streamOffset * (index + 1))
            } else null

            val lineColor = if (index % 3 == 0) HaitianRed.copy(alpha = 0.65f) else GlowAccent.copy(alpha = 0.7f)

            drawPath(
                path = streamPath,
                color = lineColor,
                style = Stroke(width = 2f, pathEffect = dashEffect)
            )

            // Destination Node
            drawCircle(
                color = ElectricBlueGlow,
                radius = 5f,
                center = targetNode
            )
            drawCircle(
                color = ElectricBlue.copy(alpha = pulseAlpha * 0.4f),
                radius = 12f,
                center = targetNode
            )
        }

        // 4. Port-au-Prince Primary Node Glow
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    HaitianRed.copy(alpha = pulseAlpha * 0.8f),
                    ElectricBlue.copy(alpha = 0.3f),
                    Color.Transparent
                ),
                center = papHub,
                radius = 60f
            ),
            center = papHub,
            radius = 60f
        )
        drawCircle(
            color = HaitianRed,
            radius = 8f,
            center = papHub
        )
        drawCircle(
            color = Color.White,
            radius = 3f,
            center = papHub
        )

        // 5. Subtle Abstract Circuit Brackets in Corners (Zero-allocation direct line drawing)
        val cornerLineColor = ElectricBlue.copy(alpha = 0.35f)
        val bracketStroke = 2f

        // Top Left Bracket
        drawLine(color = cornerLineColor, start = Offset(24f, 80f), end = Offset(24f, 24f), strokeWidth = bracketStroke)
        drawLine(color = cornerLineColor, start = Offset(24f, 24f), end = Offset(80f, 24f), strokeWidth = bracketStroke)

        // Top Right Bracket
        drawLine(color = cornerLineColor, start = Offset(width - 80f, 24f), end = Offset(width - 24f, 24f), strokeWidth = bracketStroke)
        drawLine(color = cornerLineColor, start = Offset(width - 24f, 24f), end = Offset(width - 24f, 80f), strokeWidth = bracketStroke)

        // Bottom Left Bracket
        drawLine(color = cornerLineColor, start = Offset(24f, height - 80f), end = Offset(24f, height - 24f), strokeWidth = bracketStroke)
        drawLine(color = cornerLineColor, start = Offset(24f, height - 24f), end = Offset(80f, height - 24f), strokeWidth = bracketStroke)

        // Bottom Right Bracket
        drawLine(color = cornerLineColor, start = Offset(width - 80f, height - 24f), end = Offset(width - 24f, height - 24f), strokeWidth = bracketStroke)
        drawLine(color = cornerLineColor, start = Offset(width - 24f, height - 24f), end = Offset(width - 24f, height - 80f), strokeWidth = bracketStroke)
    }
}
