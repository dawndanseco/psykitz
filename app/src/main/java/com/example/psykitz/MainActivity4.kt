package com.example.psykitz

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val bitmap = intent.getParcelableExtra<Bitmap>("capturedImage")

        val imageView: ImageView = findViewById(R.id.ivCapturedImage)
        imageView.setImageBitmap(bitmap)
    }
}
