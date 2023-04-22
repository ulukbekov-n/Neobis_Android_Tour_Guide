package com.example.neobis_android_tour_guide

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.databinding.CardviewBinding


class RestAdapter(private val cards: ArrayList<Cards>):RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding =CardviewBinding.inflate(from, parent,false)
        return CardViewHolder(binding)
    }


    override fun getItemCount(): Int = cards.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindCard(cards[position])
    }


}
