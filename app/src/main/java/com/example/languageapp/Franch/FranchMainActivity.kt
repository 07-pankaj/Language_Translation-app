package com.example.languageapp.Franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.languageapp.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FranchMainActivity : AppCompatActivity() {

    private lateinit var fragmentAdapter: fFragmentAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tablayout: TabLayout
    private lateinit var franchviewmodel:ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_franch_main)
        setTitle("French Language")
         franchviewmodel = ViewModelProvider(this).get(FranchViewModel::class.java)
        viewPager= findViewById(R.id.f_ViewPager)
         tablayout  = findViewById(R.id.f_tab_layout)
        fragmentAdapter= fFragmentAdapter(supportFragmentManager,lifecycle)

        viewPager.adapter = fragmentAdapter

        TabLayoutMediator(tablayout,viewPager){ tab, position ->

            when (position) {
                0->{tab.text = "Numbers"}
                1->{tab.text = "Family"}
                2->{tab.text = "Colors"}
                3->{tab.text = "Months"}

            }
        }.attach()


    }
}