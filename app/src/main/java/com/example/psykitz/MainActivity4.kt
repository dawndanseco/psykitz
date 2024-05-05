package com.example.psykitz

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        // Get the bitmap from intent extras
        val bitmap = intent.getParcelableExtra<Bitmap>("capturedImage")

        // Find the ImageView in the layout
        val imageView: ImageView = findViewById(R.id.ivCapturedImage)

        // Set the bitmap to the ImageView
        imageView.setImageBitmap(bitmap)
    }
}