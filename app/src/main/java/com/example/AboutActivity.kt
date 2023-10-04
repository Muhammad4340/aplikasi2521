package com.example

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.myapplication.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        //instance
        val imgCall:ImageView = findViewById(R.id.imageViewCall)
        //event saat image call di-klik
        imgCall.setOnClickListener{
            val callIntent:Intent = Uri.parse("tel:082210026366").let{
                number-> Intent(Intent.ACTION_DIAL,number)
        }
            startActivity(callIntent)
    }
}}