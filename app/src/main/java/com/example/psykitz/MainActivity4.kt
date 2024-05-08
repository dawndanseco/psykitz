package com.example.psykitz

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.psykitz.R

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val imageUri = intent.getParcelableExtra<Uri>("capturedImageUri")

        val imageView: ImageView = findViewById(R.id.ivCapturedImage)
        imageView.setImageURI(imageUri)
    }
}
