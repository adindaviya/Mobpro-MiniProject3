package com.adindaviya0052.minipoject3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.adindaviya0052.minipoject3.ui.screen.MainScreen
import com.adindaviya0052.minipoject3.ui.theme.MiniPoject3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiniPoject3Theme {
                MainScreen()
            }
        }
    }
}
