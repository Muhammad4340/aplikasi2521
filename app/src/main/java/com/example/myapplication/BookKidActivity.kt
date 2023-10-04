package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    lateinit var binding: ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //event button utk call fragment
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }

        binding.buttonFairy.setOnClickListener {
            replaceFragment(FableFragment())
        }
        binding.buttonFairy.setOnClickListener {
            replaceFragment(ScienceFragment())

    //ganti fragment
    fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmenTrx = fragmentManager.beginTransaction()
        fragmenTrx.replace(R.id.fragmentKidBook, frg)
        fragmenTrx.commit()

        //instance
        val cal:ImageView = findViewById(R.Id.imageViewCall)
        val cal:ImageView = findViewById(R.Id.imageViewCall)
        val cal:ImageView = findViewById(R.Id.imageViewCall)

    }
}