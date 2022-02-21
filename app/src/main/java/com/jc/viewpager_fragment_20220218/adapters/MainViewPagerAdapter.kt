package com.jc.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.jc.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> NameFragment()
            1 -> BirthFragment()
            2 -> HelloFragment()
            3 -> Etc1Fragment()
            else -> Etc2Fragment()
        }

    }
}