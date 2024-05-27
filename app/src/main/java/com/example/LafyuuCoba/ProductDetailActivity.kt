package com.example.LafyuuCoba

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_product_detail)
        val imageView2: ImageView  = findViewById(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}