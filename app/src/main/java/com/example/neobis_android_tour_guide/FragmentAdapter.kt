package com.example.neobis_android_tour_guide

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.neobis_android_tour_guide.fragments.CinemaFragment
import com.example.neobis_android_tour_guide.fragments.FitnessFragment
import com.example.neobis_android_tour_guide.fragments.RestaurantFragments

class FragmentAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle){
    var fragmentList:ArrayList<Fragment> = ArrayList()
    var fragmenttitle:ArrayList<String> = ArrayList()



    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->return RestaurantFragments()
            1->return FitnessFragment()
            2->return CinemaFragment()
            else ->return RestaurantFragments()
        }
    }
}