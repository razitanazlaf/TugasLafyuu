package com.example.LafyuuCoba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Set up the click listener for fsale3
        findViewById<ImageView>(R.id.fsale3).setOnClickListener {
            val intent = Intent(this, ProductDetailActivity::class.java)
            startActivity(intent)
        }

        // Set up the click listener for textView16
        findViewById<TextView>(R.id.textView16).setOnClickListener {
            val intent = Intent(this, OfferScreenActivity::class.java)
            startActivity(intent)
        }

        // Set up the click listener for imageView2
        findViewById<ImageView>(R.id.imageView2).setOnClickListener {
            val intent = Intent(this, FavoriteProductActivity::class.java)
            startActivity(intent)
        }
    }

    fun backtomain(view: View) {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    // Method to handle the click on imageView2
    fun goToFavoriteProducts(view: View) {
        val intent = Intent(this, FavoriteProductActivity::class.java)
        startActivity(intent)
    }
}