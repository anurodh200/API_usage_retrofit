package com.example.api_usage_demo

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter (val context: Activity, val productList: List<Product>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var title: TextView
        var image: ShapeableImageView

        init {
            title = itemView.findViewById(R.id.pdtName)
            image = itemView.findViewById(R.id.pdtImg)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.each_item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productList[position]
        holder.title.text = currentItem.title
        //image from URL text using picasso library
        Picasso.get().load(currentItem.thumbnail).into(holder.image);

    }

}