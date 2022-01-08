package com.example.booksreading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.drawerlayout.widget.DrawerLayout

class HomeScreen : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)



        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        var drawer = findViewById<DrawerLayout>(R.id.drawer)

        toggle= ActionBarDrawerToggle(this, drawer, R.string.open,R.string.close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        var menu = arrayOf("HOME","GENRES","Fantasy","Poetry","Autobiography","Mystery","Historical","Sci-Fi")
        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, menu)
        var lv = findViewById<ListView>(R.id.listView)
        lv.adapter = adapter

        lv.setOnItemClickListener{parent, view, position, id->
            drawer.closeDrawers()       // for opening and closing of drawer

            when(position){
                2->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame, Fantasy()).commit()
                }
                3->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame, Poetry()).commit()
                }
                4->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame, Autobiography()).commit()
                }
                5->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame, Mystery()).commit()
                }
                6->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame, Historical()).commit()
                }
                7->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame, Scifi()).commit()
                }
            }
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
            return true
            return super.onOptionsItemSelected(item)
    }
}