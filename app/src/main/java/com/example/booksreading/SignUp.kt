package com.example.booksreading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            val intent= Intent(this,Choose::class.java)
            startActivity(intent)
        }
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}