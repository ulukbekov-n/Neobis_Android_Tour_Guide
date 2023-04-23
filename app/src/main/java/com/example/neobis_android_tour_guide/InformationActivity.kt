package com.example.neobis_android_tour_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_tour_guide.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cardId = intent.getIntExtra(CARD_ID_EXTRA,-1)
        val card = cardFromId(cardId)
        if(card != null){
            binding.photo1.setImageResource(card.image)
            binding.price.text = card.name
            binding.distance.text=card.distance
            binding.time.text=card.time
            binding.descriptionInfo.text=card.description

        }
    }

    private fun cardFromId(cardId: Int): Cards? {
        for(card in cardList){
            if(card.id==cardId)
                return card
        }
        return null

    }
}