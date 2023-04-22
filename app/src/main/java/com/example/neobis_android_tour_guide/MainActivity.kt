package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.neobis_android_tour_guide.databinding.ActivityMainBinding
import com.example.neobis_android_tour_guide.fragments.RestaurantFragments
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {

    private lateinit var binding:ActivityMainBinding
    var tabTitle = arrayOf("Рестораны", "Фитнес центры", "Кинотеатры")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var viewPager2 = findViewById<ViewPager2>(R.id.pager)
        var tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        viewPager2.adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()


    }

    private fun replaceFragment(restaurantFragments: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main,restaurantFragments)
        fragmentTransaction.commit()
    }
}