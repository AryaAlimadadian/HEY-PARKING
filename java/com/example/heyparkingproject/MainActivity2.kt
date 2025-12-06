package com.example.heyparkingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent= Intent(baseContext, MapsActivity::class.java)
            Toast.makeText(
                applicationContext,
                "Parking reserved",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)
        }
        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
            val intent= Intent(baseContext, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}