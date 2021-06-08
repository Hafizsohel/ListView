package com.example.listview

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Bangla= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bangla)
        val English= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.english)
        val Math=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.math)
        val ICT=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ict)

        var bookName=ArrayList<String>()
        bookName.add("Bangla")
        bookName.add("English")
        bookName.add("Math")
        bookName.add("ICT")

        val bookImages=ArrayList<Bitmap>()
        bookImages.add(Bangla)
        bookImages.add(English)
        bookImages.add(Math)
        bookImages.add(ICT)

    val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,bookName)
       listView.adapter=arrayAdapter
        listView.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent=Intent(applicationContext,detailsActivity::class.java)
            intent.putExtra("name", bookName[position])

            val bitmap=bookImages[id.toInt()]
            val chosen=Globals.chosen
            chosen.choseImage=bitmap

     startActivity(intent)


        }

    }
}