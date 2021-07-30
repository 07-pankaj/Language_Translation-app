package com.example.languageapp.German.GFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.languageapp.R
import com.example.languageapp.myListView

class RecycleViewadapter(val mylist:ArrayList<myListView>, private val listner: onclick) : RecyclerView.Adapter<RecycleViewadapter.Rviewholder>(){

    class Rviewholder(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        var Eword:TextView
        var Tword:TextView
        var image:ImageView
        init {
            Eword = itemView.findViewById(R.id.item1)
            Tword = itemView.findViewById(R.id.item2)
            image = itemView.findViewById(R.id.imageitem)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Rviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mylistview,parent,false)
        val rviewholder :Rviewholder = Rviewholder(view)
        view.setOnClickListener {
            listner.onclickonitem(mylist[rviewholder.adapterPosition].audio)
        }
        return rviewholder
    }

    override fun onBindViewHolder(holder: Rviewholder, position: Int) {

        holder.Eword.text = mylist[position].E_word
        holder.Tword.text = mylist[position].T_word
        holder.image.setImageResource(mylist[position].image)

    }

    override fun getItemCount(): Int {

        return mylist.size
    }

}

interface onclick{
    fun onclickonitem(audio: Int)
}
