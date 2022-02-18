package com.jc.viewpager_fragment_20220218

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jc.viewpager_fragment_20220218.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvents()
        setValues()

    }

    fun setUpEvents() {

    }

    fun setValues() {

        // AppCompatActivity() 에 정의되어 있는 supportFragmentManager 사용
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

    }

}