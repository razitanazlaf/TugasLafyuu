package com.example.LafyuuCoba

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            goToMainactivity()
        }, 3000L)
    }

    private fun goToMainactivity() {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

}