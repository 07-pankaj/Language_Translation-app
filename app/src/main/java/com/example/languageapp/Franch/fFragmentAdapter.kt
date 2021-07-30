package com.example.languageapp.Franch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.languageapp.Franch.FFragment.fColorFragment
import com.example.languageapp.Franch.FFragment.fFamilyFragment
import com.example.languageapp.Franch.FFragment.fMonthFragment
import com.example.languageapp.Franch.FFragment.fNumberFragment
import com.example.languageapp.German.GFragment.gColorFragment
import com.example.languageapp.German.GFragment.gFamilyFragment
import com.example.languageapp.German.GFragment.gMonthFragment
import com.example.languageapp.German.GFragment.gNumberFragment

class fFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position)
        {
            0 ->{return fNumberFragment()}
            1 ->{return fFamilyFragment()}
            2 ->{return fColorFragment()}
            3 ->{return fMonthFragment()}
            else -> fNumberFragment()
        }

    }
}