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

//        재사용 성을 일부로 무시하도록 하는 코드 예시 (사용성 개선 인 경우도 있다.)
//        한번에 5개를 가지고 있다.
        mainViewPager.offscreenPageLimit = 5

//        텝 라이아웃 / 뷰페이저 연결
        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}