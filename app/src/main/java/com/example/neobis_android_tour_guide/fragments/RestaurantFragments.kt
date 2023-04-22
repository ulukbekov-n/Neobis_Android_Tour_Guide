package com.example.neobis_android_tour_guide.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.*

var cardsArrayList = ArrayList<Cards>()

//    return inflater.inflate(R.layout.fragment_restaurant_fragment, container, false)
    private lateinit var adapter: RestAdapter
    private lateinit var recyclerView: RecyclerView
//    private lateinit var cardsArrayList: ArrayList<Cards>
private fun dataInfo() {
    val card1 = Cards(
        R.drawable.rest1,
        "Cyclone",
        "Проспект  Чуй 136",
        "Открыт до 24:00",
        "1.5 км"

    )
    cardsArrayList.add(card1)

    val card2 = Cards(
        R.drawable.rest2,
        "Anar",
        "ул. Иса Ахунбаева 17А",
        "Открыт до 24:00",
        "1.1 км"

    )
    cardsArrayList.add(card2)

    val card3 = Cards(
        R.drawable.rest3,
        "Бай-Казан",
        "Баялинова 131",
        "Открыт до 24:00",
        "1.7 км"

    )
    cardsArrayList.add(card3)

    val card4 = Cards(
        R.drawable.rest4,
        "BARHAT",
        "ул. Иса Ахунбаева 17А",
        "Открыт до 24:00",
        "7.0 км"

    )
    cardsArrayList.add(card4)

    val card5 = Cards(
        R.drawable.rest5,
        "Тринити",
        "Океанский проспект 48а",
        "Открыт до 01:00",
        "3.9 км"

    )
    cardsArrayList.add(card5)

    val card6 = Cards(
        R.drawable.rest6,
        "Кайф",
        "Московская 100",
        "Открыт до 01:00",
        "1000.8 км"

    )
    cardsArrayList.add(card6)

    cardsList.add(card1)
    cardsList.add(card2)
    cardsList.add(card3)
    cardsList.add(card4)
    cardsList.add(card5)
    cardsList.add(card6)
}
class RestaurantFragments : Fragment(),CardClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        dataInfo()
        return inflater.inflate(R.layout.fragment_restaurant_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = RestAdapter(cardsArrayList)
        recyclerView.adapter = adapter

    }

    override fun onClick(card: Cards) {
        val intent = Intent(context,InformationActivity::class.java)
    }

}



