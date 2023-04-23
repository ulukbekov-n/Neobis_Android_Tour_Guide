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

//
//    var cardList = ArrayList<Cards>()

    private lateinit var adapter: RestAdapter
    private lateinit var recyclerView: RecyclerView
//private lateinit var cardList: ArrayList<Cards>
private fun dataInfo() {
    val card1 = Cards(
        R.drawable.rest1,
        "Cyclone",
        "Проспект  Чуй 136",
        "Открыт до 24:00",
        "1.5 км",
        "Уютный интерьер и изысканная кухня сделают ваш обед или ужин незабываемым. Мы рады нашим гостям и всегда стремимся их приятно удивить.\n" +
                "Меню ресторана и карта вин продуманы до мелочей, а наши официанты помогут при заказе подобрать блюдо на любой вкус и посоветуют подходящие напитки."

    )
    cardList.add(card1)

    val card2 = Cards(
        R.drawable.rest2,
        "Anar",
        "ул. Иса Ахунбаева 17А",
        "Открыт до 24:00",
        "1.1 км",
        "Уютный интерьер и изысканная кухня сделают ваш обед или ужин незабываемым. Мы рады нашим гостям и всегда стремимся их приятно удивить.\n" +
                "Меню ресторана и карта вин продуманы до мелочей, а наши официанты помогут при заказе подобрать блюдо на любой вкус и посоветуют подходящие напитки."

    )
    cardList.add(card2)

    val card3 = Cards(
        R.drawable.rest3,
        "Бай-Казан",
        "Баялинова 131",
        "Открыт до 24:00",
        "1.7 км",
        "Уютный интерьер и изысканная кухня сделают ваш обед или ужин незабываемым. Мы рады нашим гостям и всегда стремимся их приятно удивить.\n" +
                "Меню ресторана и карта вин продуманы до мелочей, а наши официанты помогут при заказе подобрать блюдо на любой вкус и посоветуют подходящие напитки."

    )
    cardList.add(card3)

    val card4 = Cards(
        R.drawable.rest4,
        "BARHAT",
        "ул. Иса Ахунбаева 17А",
        "Открыт до 24:00",
        "7.0 км",
        "Уютный интерьер и изысканная кухня сделают ваш обед или ужин незабываемым. Мы рады нашим гостям и всегда стремимся их приятно удивить.\n" +
                "Меню ресторана и карта вин продуманы до мелочей, а наши официанты помогут при заказе подобрать блюдо на любой вкус и посоветуют подходящие напитки."

    )
    cardList.add(card4)

    val card5 = Cards(
        R.drawable.rest5,
        "Тринити",
        "Океанский проспект 48а",
        "Открыт до 01:00",
        "3.9 км",
        "Уютный интерьер и изысканная кухня сделают ваш обед или ужин незабываемым. Мы рады нашим гостям и всегда стремимся их приятно удивить.\n" +
                "Меню ресторана и карта вин продуманы до мелочей, а наши официанты помогут при заказе подобрать блюдо на любой вкус и посоветуют подходящие напитки."

    )
    cardList.add(card5)

    val card6 = Cards(
        R.drawable.rest6,
        "Кайф",
        "Московская 100",
        "Открыт до 01:00",
        "1000.8 км",
        "КайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайфКайф КайфКайфКайфКайф КайфКайфКайф Кайф КайфКайфКайфКайфКайф"

    )
    cardList.add(card6)

    com.example.neobis_android_tour_guide.cardList.add(card1)
    com.example.neobis_android_tour_guide.cardList.add(card2)
    com.example.neobis_android_tour_guide.cardList.add(card3)
    com.example.neobis_android_tour_guide.cardList.add(card4)
    com.example.neobis_android_tour_guide.cardList.add(card5)
    com.example.neobis_android_tour_guide.cardList.add(card6)
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
        val mainActivity = this
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = RestAdapter(com.example.neobis_android_tour_guide.cardList,mainActivity)
        recyclerView.adapter = adapter

    }

    override fun onClick(card: Cards) {
        val intent = Intent(context,InformationActivity::class.java)
        intent.putExtra(CARD_ID_EXTRA, card.id )
        startActivity(intent)
    }

}



