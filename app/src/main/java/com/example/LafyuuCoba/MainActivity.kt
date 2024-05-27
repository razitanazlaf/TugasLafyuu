package com.example.LafyuuCoba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SignIn(view: View) {
        Intent(this, HomeActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    fun registerAccount(view: View) {
        Intent(this, RegisterActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}