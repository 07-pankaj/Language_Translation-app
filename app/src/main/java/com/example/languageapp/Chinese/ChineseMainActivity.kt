package com.example.languageapp.Chinese

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.languageapp.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ChineseMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chinese_main)
        setTitle("Chinese Language")

        val chineseViewModel = ViewModelProvider(this).get(ChineseViewModel::class.java)
        val viewpager = findViewById<ViewPager2>(R.id.c_viewpager)
        val tablayout = findViewById<TabLayout>(R.id.c_tablayout)

        val fragmentadapter = cFragmentAdapter(supportFragmentManager,lifecycle)
        viewpager.adapter = fragmentadapter

        TabLayoutMediator(tablayout,viewpager){ tab: TabLayout.Tab, position: Int ->

            when(position)
            {
                0->{tab.text = "Number"}
                1->{tab.text = "Family"}
                2->{tab.text = "Color"}
                3->{tab.text = "Month"}
            }
        }.attach()
    }
}