package com.jc.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.jc.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> { return NameFragment() }
            1 -> return BirthFragment()
            2 -> return HelloFragment()
            3 -> return Etc1Fragment()
            else -> return Etc2Fragment()
        }

    }
}