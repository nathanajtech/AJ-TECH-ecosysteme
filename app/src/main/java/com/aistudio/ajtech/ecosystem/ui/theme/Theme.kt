package com.aistudio.ajtech.ecosystem.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme =
  darkColorScheme(
    primary = ElectricBlue,
    secondary = ElectricBlueGlow,
    tertiary = HaitianRed,
    background = DeepBlueCanvas,
    surface = DeepBlueDark,
    surfaceContainer = DeepBlueContainer,
    onPrimary = PureWhite,
    onSecondary = DeepBlueDark,
    onBackground = PureWhite,
    onSurface = PureWhite,
  )

private val LightColorScheme =
  lightColorScheme(
    primary = DeepBlueCanvas,
    secondary = ElectricBlue,
    tertiary = HaitianRed,
    background = OffWhite,
    surface = PureWhite,
    surfaceContainer = OffWhite,
    onPrimary = PureWhite,
    onSecondary = PureWhite,
    onBackground = DarkNavyText,
    onSurface = DarkNavyText,
  )

@Composable
fun AJTechTheme(
  darkTheme: Boolean = true, // Default to deep tech dark mode
  content: @Composable () -> Unit,
) {
  val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

  MaterialTheme(
    colorScheme = colorScheme,
    typography = Typography,
    content = content
  )
}

