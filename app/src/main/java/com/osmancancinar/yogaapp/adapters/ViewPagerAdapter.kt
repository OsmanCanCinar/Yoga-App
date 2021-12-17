package com.osmancancinar.yogaapp.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.osmancancinar.yogaapp.ui.home.yoga.*

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> ChairYogaFragment.newInstance()
            1 -> HathaYogaFragment.newInstance()
            2 -> PrenatalYogaFragment.newInstance()
            3 -> VinyasaYogaFragment.newInstance()
            else -> HathaYogaFragment.newInstance()
        }
    }
}