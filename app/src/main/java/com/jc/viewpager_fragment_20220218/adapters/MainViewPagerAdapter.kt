package com.jc.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.jc.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    // CharSequence -> String 이랑 비슷하게 생각하면 된다.
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "이름"
            1 -> "출생년도"
            2 -> "인사말"
            3 -> "기타 1"
            else -> "기타 2"
        }
    }


    override fun getCount(): Int = 5

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