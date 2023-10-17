package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterHome(private val listBuku:List<ImageView>):
                    RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageViewBook)
        val title: TextView = itemView.findViewById(R.id.textViewTitle)
        val desc: TextView = itemView.findViewById(R.id.textViewDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.layout.card_layout_home, parent, false
        )
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position : Int){
        val imageView = listBuku[position]

        holder.image.setImageResource(ImageView.image)
        holder.title.text = ImageView.title
        holder.desc.text = ImageView.desc
    }
    override fun getItemCount(): Int{
        return listBuku.size
    }
}

