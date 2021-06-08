package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class detailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent= intent
        val name=intent.getStringArrayExtra("name")
        textView.text = name.toString()
        val chosen=Globals.chosen
        val selectedImage=chosen.returnImage()
        imageView.setImageBitmap(selectedImage)
    }
}