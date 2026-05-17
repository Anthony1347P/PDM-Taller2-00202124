package com.pdm0126.taller2_00202124

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdm0126.taller2_00202124.navigation.NavegacionPrincipal
import com.pdm0126.taller2_00202124.ui.theme.Taller2_00202124Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Taller2_00202124Theme {
                NavegacionPrincipal()
            }
        }
    }
}