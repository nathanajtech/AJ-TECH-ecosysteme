package com.aistudio.ajtech.ecosystem.ui.hub

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aistudio.ajtech.ecosystem.R
import com.aistudio.ajtech.ecosystem.ui.navigation.NavDestination
import com.aistudio.ajtech.ecosystem.ui.screens.*
import com.aistudio.ajtech.ecosystem.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainHubScreen() {
    var currentRoute by remember { mutableStateOf(NavDestination.Home.route) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Surface(
                            color = PureWhite,
                            shape = RoundedCornerShape(6.dp),
                            modifier = Modifier.padding(vertical = 4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.aj_tech_logo),
                                contentDescription = "AJ-TECH Official Logo",
                                modifier = Modifier
                                    .height(28.dp)
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }

                        Column {
                            Text(
                                text = "AJ-TECH",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Black,
                                    color = PureWhite,
                                    letterSpacing = 1.sp
                                )
                            )
                            Text(
                                text = "L’Écosystème Numérique Haïtien",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = ElectricBlueGlow,
                                    fontSize = 10.sp
                                )
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DeepBlueDark
                )
            )
        },
        bottomBar = {
            ScrollableTabRow(
                selectedTabIndex = NavDestination.items.indexOfFirst { it?.route == currentRoute }.coerceAtLeast(0),
                containerColor = DeepBlueDark,
                contentColor = ElectricBlueGlow,
                edgePadding = 0.dp
            ) {
                NavDestination.items.filterNotNull().forEach { item ->
                    Tab(
                        selected = currentRoute == item.route,
                        onClick = { currentRoute = item.route },
                        modifier = Modifier.testTag("nav_tab_${item.route}")
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.label,
                                tint = if (currentRoute == item.route) ElectricBlueGlow else PureWhite.copy(alpha = 0.6f),
                                modifier = Modifier.size(18.dp)
                            )
                            Text(
                                text = item.label,
                                style = MaterialTheme.typography.labelMedium.copy(
                                    color = if (currentRoute == item.route) ElectricBlueGlow else PureWhite.copy(alpha = 0.6f),
                                    fontWeight = if (currentRoute == item.route) FontWeight.Bold else FontWeight.Normal,
                                    fontSize = 12.sp
                                )
                            )
                        }
                    }
                }
            }
        },
        containerColor = DeepBlueCanvas
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (currentRoute) {
                NavDestination.Home.route -> HomeScreen(onNavigateTo = { currentRoute = it })
                NavDestination.Book.route -> BookReaderScreen()
                NavDestination.Ecosystem.route -> EcosystemScreen()
                NavDestination.Vision.route -> Vision2035Screen()
                NavDestination.Manifesto.route -> ManifestoScreen()
                NavDestination.About.route -> AboutScreen()
                NavDestination.Edition.route -> EditionSpecsScreen()
            }
        }
    }
}
