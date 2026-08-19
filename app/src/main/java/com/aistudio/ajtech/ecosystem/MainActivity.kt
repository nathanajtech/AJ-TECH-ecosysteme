package com.aistudio.ajtech.ecosystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.aistudio.ajtech.ecosystem.ui.hub.MainHubScreen
import com.aistudio.ajtech.ecosystem.ui.theme.AJTechTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      AJTechTheme(darkTheme = true) {
        Surface(modifier = Modifier.fillMaxSize()) {
          MainHubScreen()
        }
      }
    }
  }
}

