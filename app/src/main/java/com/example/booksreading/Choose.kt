package com.example.booksreading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener{
            val intent= Intent(this,HomeScreen::class.java)
            startActivity(intent)
        }
        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener{
            val intent= Intent(this,Collections::class.java)
            startActivity(intent)
        }
    }
}