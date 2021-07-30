package com.example.languageapp.German

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.languageapp.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class GermanMainActivity : AppCompatActivity() {


    private lateinit var fragmentAdapter:gFragmentAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout


    private lateinit var germanViewModel: GermanViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("German Language"  )
        setContentView(R.layout.activity_german)

        germanViewModel = ViewModelProvider(this).get(GermanViewModel::class.java)

        viewPager = findViewById(R.id.g_View_Pager)
        tabLayout = findViewById(R.id.g_tab_layout)


        fragmentAdapter = gFragmentAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = fragmentAdapter
        TabLayoutMediator(tabLayout,viewPager) { tab, position ->
            when (position) {
                0->{tab.text = "Numbers"}
                1->{tab.text = "Family"}
                2->{tab.text = "Colors"}
                3->{tab.text = "Months"}

            }
        }.attach()

    }
}