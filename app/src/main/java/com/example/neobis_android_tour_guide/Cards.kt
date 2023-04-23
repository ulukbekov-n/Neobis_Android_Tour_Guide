package com.example.neobis_android_tour_guide
var cardList = mutableListOf<Cards>()
val CARD_ID_EXTRA  = "cardExtra"
data class Cards(var image: Int,
                 var name  : String,
                 val address: String,
                 val time:String ,
                 val distance: String,
                 val description: String,
                 val id: Int? = cardList.size)
