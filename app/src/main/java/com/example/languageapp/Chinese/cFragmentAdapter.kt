package com.example.languageapp.Chinese

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.languageapp.Chinese.Fragment.cColorFragment
import com.example.languageapp.Chinese.Fragment.cFamilyFragment
import com.example.languageapp.Chinese.Fragment.cMonthFragment
import com.example.languageapp.Chinese.Fragment.cNumberFragment

class cFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
     override fun getItemCount(): Int {
       return 4
     }

     override fun createFragment(position: Int): Fragment {

         return when(position){

             0 ->{ return cNumberFragment()}
             1 ->{ return cFamilyFragment()}
             2 ->{ return cColorFragment()}
             3 ->{ return cMonthFragment()}
             else ->{
                 return cColorFragment()
             }
         }
     }
 }