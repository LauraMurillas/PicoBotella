package com.example.myapplication.view

import android.content.Intent
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.widget.ImageView
import com.example.myapplication.R


class RulesActivity : AppCompatActivity() {
    private var wasAudioOn: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)


        val toolbar: Toolbar = findViewById(R.id.rules_toolbar)
        setSupportActionBar(toolbar)


        val backArrow: ImageView = findViewById(R.id.back_arrow)
        backArrow.setOnClickListener {
            if (wasAudioOn) {
                startBackgroundAudio()
            }
            finish()
        }


        wasAudioOn = checkAudioStatus()
        if (wasAudioOn) {
            pauseBackgroundAudio()
        }


        val winAnimation: ImageView = findViewById(R.id.win_animation)
        (winAnimation.drawable as? AnimatedVectorDrawable)?.start()
    }

    private fun checkAudioStatus(): Boolean {
        // Implementar lógica para verificar si el audio de fondo está activo
        return true // Sustituye con la verificación real del estado de audio
    }

    private fun pauseBackgroundAudio() {
        // Implementar lógica para pausar el audio de fondo
    }

    private fun startBackgroundAudio() {
        // Implementar lógica para reanudar el audio de fondo
    }

    override fun onBackPressed() {
        if (wasAudioOn) {
            startBackgroundAudio()
        }
        super.onBackPressed()
    }
}