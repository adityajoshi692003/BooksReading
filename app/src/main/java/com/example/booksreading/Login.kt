package com.example.booksreading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{
            val intent= Intent(this,Choose::class.java)
            startActivity(intent)
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{
            val intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}