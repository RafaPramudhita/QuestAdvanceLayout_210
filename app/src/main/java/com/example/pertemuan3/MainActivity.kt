package com.example.pertemuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan3.ui.theme.Pertemuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Ganti Greeting dengan layout utama kamu
                    TataLetakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Optional: Preview untuk tampilkan di Android Studio
@Preview(showBackground = true)
@Composable
fun TataLetakPreview() {
    Pertemuan3Theme {
        TataLetakBoxColumnRow(modifier = Modifier)
    }
}
