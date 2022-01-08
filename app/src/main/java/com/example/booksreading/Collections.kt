package com.example.booksreading

import android.app.Activity
import android.widget.Toast
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import com.example.booksreading.databinding.ActivityCollectionsBinding

class Collections : AppCompatActivity() {
    private lateinit var binding :ActivityCollectionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding  = ActivityCollectionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this

        binding.recyclerview.apply {
            layoutManager= GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList)
        }
    }
    private fun populateBooks(){

        val book1 = Book(
            R.drawable.auto1,
            "Name",
            "title",
            "description"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.fan1,
            "Name",
            "title",
            "description"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.hist1,
            "Name",
            "title",
            "description"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.scifi1,
            "Name",
            "title",
            "description"
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.scifi2,
            "Name",
            "title",
            "description"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.fan2,
            "Name",
            "title",
            "description"
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.hist2,
            "Name",
            "title",
            "description"
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.auto2,
            "Name",
            "title",
            "description"
        )
        bookList.add(book8)

        val book9 = Book(
            R.drawable.scifi3,
            "Name",
            "title",
            "description"
        )
        bookList.add(book9)

        val book10 = Book(
            R.drawable.auto3,
            "Name",
            "title",
            "description"
        )
        bookList.add(book10)

        val book11 = Book(
            R.drawable.the_historians,
            "Name",
            "title",
            "description"
        )
        bookList.add(book11)

        val book12 = Book(
            R.drawable.fan3,
            "Name",
            "title",
            "description"
        )
        bookList.add(book12)

        val book13 = Book(
            R.drawable.fan4,
            "Name",
            "title",
            "description"
        )
        bookList.add(book12)

        val book14 = Book(
            R.drawable.auto4,
            "Name",
            "title",
            "description"
        )
        bookList.add(book14)

        val book15 = Book(
            R.drawable.scifi4,
            "Name",
            "title",
            "description"
        )
        bookList.add(book15)



       // bookList.add(book1)
       // bookList.add(book2)
        //bookList.add(book3)
        //bookList.add(book4)
        //bookList.add(book5)
        //bookList.add(book6)
        //bookList.add(book7)
       // bookList.add(book8)
       //bookList.add(book9)
        //bookList.add(book10)
       // bookList.add(book11)
        //bookList.add(book12)
    }
}