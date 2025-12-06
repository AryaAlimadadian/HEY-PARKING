package com.example.heyparkingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*
import androidx.core.widget.addTextChangedListener

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        lateinit var inputtext :EditText
        lateinit var action_button: Button

        var flag=0
        var flagg=0
        var flaggg=0
        var flagggg=0
        var flaggggg=0


        val login = findViewById<Button>(R.id.login)

        login.setOnClickListener {
            val intent= Intent(baseContext, MapsActivity::class.java)
            Toast.makeText(
                applicationContext,
                "Hi! Arya",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)
            finish()
        }
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)

        imageButton2.setOnClickListener {
            val intent= Intent(baseContext, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        val username = findViewById<EditText>(R.id.username)

        username.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                flag=1
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        val username2 = findViewById<EditText>(R.id.username2)

        username2.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                flagg=1
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        val password3 = findViewById<EditText>(R.id.password3)

        password3.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                flaggg=1
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        val password = findViewById<EditText>(R.id.password)

        password.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                flagggg=1
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        val password2 = findViewById<EditText>(R.id.password2)

        password2.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                flaggggg=1
                login.setEnabled(true)
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        if (flag==1 && flagg==1 && flaggg==1 && flagggg==1 && flaggggg==1){
            login.setEnabled(true)
        }
    }
}