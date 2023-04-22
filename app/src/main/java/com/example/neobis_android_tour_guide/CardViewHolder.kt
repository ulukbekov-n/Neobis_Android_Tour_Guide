package com.example.neobis_android_tour_guide

import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.databinding.CardviewBinding
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantFragmentBinding

class CardViewHolder(private val cardCellBinding: CardviewBinding):RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindCard(card:Cards){
        cardCellBinding.photo.setImageResource(card.image)
        cardCellBinding.name1.text = card.name
        cardCellBinding.address.text = card.address
        cardCellBinding.time.text = card.time
        cardCellBinding.distance.text = card.distance

    }
}