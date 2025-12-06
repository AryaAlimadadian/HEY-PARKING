package com.example.heyparkingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.heyparkingproject.ui.login.LoginActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val intent= Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val intent= Intent(baseContext, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }
}