package com.example.examplerecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_football.view.*

class ClubAdapter : RecyclerView.Adapter<ClubAdapter.ViewHolder>() {

    private var mlistClub = mutableListOf<Club>()
    private var onIntemClickListener:OnItemClickListener<Club>?=null

    fun updateData(list:MutableList<Club>)
    {
        this.mlistClub=list
        notifyDataSetChanged()
    }

    fun registerOnItemClickListener(itemClick:OnItemClickListener<Club>)
    {
        onIntemClickListener=itemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_football, parent, false)
        return ViewHolder(view,onIntemClickListener)
    }

    override fun getItemCount() = mlistClub.size

    override fun onBindViewHolder(holder: ClubAdapter.ViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ViewHolder(item: View,
    private var onItemClickListener: OnItemClickListener<Club>?) : RecyclerView.ViewHolder(item),View.OnClickListener{
        fun bind(position: Int) {
            itemView.imageViewFootball.setImageResource(mlistClub.get(position).image)
            itemView.textViewNameClub.text = mlistClub[position].nameClub
            itemView.textViewNameCountry.text = mlistClub[position].nameCountry
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            Log.i("TAg","Xin Chao")
            onIntemClickListener?.onItemClick(mlistClub[adapterPosition])
        }
    }
}
