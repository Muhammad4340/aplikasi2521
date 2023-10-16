package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val btnMore:Button = findViewById(R.id.Menu4)
        val btnKid:Button = findViewById(R.id.Menu1)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<ImageView>()
        data.add(ImageView(R.drawable.book1,"Emi's beach adventure",
            "Lorem Ipsum Dolor Sit Amet"))
        data.add(ImageView(R.drawable.book2,"Ade's beach adventure",
            "Lorem Ipsum Dolor Sit Amet"))
        data.add(ImageView(R.drawable.book4,"Mermaid to Rescue",
            "Lorem Ipsum Dolor Sit Amet"))

        //set adapter
        val adapter = AdapterHome(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter
    }
}