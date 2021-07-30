package com.example.languageapp.German

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.languageapp.German.GFragment.gColorFragment
import com.example.languageapp.German.GFragment.gFamilyFragment
import com.example.languageapp.German.GFragment.gMonthFragment
import com.example.languageapp.German.GFragment.gNumberFragment


class gFragmentAdapter(fragmentManager: FragmentManager, Lifecycle:Lifecycle) : FragmentStateAdapter(fragmentManager,Lifecycle) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {


        return when(position){
            0 ->{ gNumberFragment()}
            1 ->{ gFamilyFragment()}
            2 ->{gColorFragment()}
            3 ->{gMonthFragment()}
            else -> gNumberFragment()
        }

    }



}