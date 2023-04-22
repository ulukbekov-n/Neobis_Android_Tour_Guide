package com.example.neobis_android_tour_guide
var cardsList = mutableListOf<Cards>()
data class Cards(var image: Int,
                 var name  : String,
                 val address: String,
                 val time:String ,
                 val distance: String,
                 val id: Int? = cardsList.size)
