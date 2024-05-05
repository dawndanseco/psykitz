package com.example.psykitz

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Find the ImageView
        val ivCamera: ImageView = findViewById(R.id.ivCamera)

        // Set OnClickListener for the ImageView
        ivCamera.setOnClickListener {
            // Start the NextActivity
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}
