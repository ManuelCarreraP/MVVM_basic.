package com.dam.mvvm_basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dam.mvvm_basic.ui.theme.MVVM_basicTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Obtenemos la instancia singleton del ViewModel
        val miViewModel: MyViewModel = MyViewModel.getInstance()

        enableEdgeToEdge()
        setContent {
            MVVM_basicTheme {
                // llamamos a la IU pasando el ViewModel
                IU(miViewModel)
            }
        }
    }
}