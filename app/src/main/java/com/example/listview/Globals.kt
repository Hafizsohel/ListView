package com.example.listview

import android.graphics.Bitmap

class Globals {
    companion object chosen{
        var chosenImage:Bitmap?=null
        fun returnImage():Bitmap{
            return chosenImage!!
        }
    }
}