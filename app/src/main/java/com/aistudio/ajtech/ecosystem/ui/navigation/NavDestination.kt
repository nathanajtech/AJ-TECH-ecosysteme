package com.aistudio.ajtech.ecosystem.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavDestination(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : NavDestination("home", "Accueil", Icons.Default.Home)
    object Book : NavDestination("book", "Livre", Icons.Default.MenuBook)
    object Ecosystem : NavDestination("ecosystem", "Écosystème", Icons.Default.Category)
    object Vision : NavDestination("vision", "Vision 2035", Icons.Default.RocketLaunch)
    object Manifesto : NavDestination("manifesto", "Manifeste", Icons.Default.AutoAwesome)
    object About : NavDestination("about", "À Propos", Icons.Default.Info)
    object Edition : NavDestination("edition", "Édition", Icons.Default.Print)

    companion object {
        val items: List<NavDestination> get() = listOf(Home, Book, Ecosystem, Vision, Manifesto, About, Edition)
    }
}
