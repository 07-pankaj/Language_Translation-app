package com.example.languageapp.Chinese

import androidx.lifecycle.ViewModel
import com.example.languageapp.R
import com.example.languageapp.myListView

class ChineseViewModel:ViewModel() {

    var cnumberlist = ArrayList<myListView>()
    var cfamilylist = ArrayList<myListView>()
    val ccolorlist = ArrayList<myListView>()
    val cmonthlist = ArrayList<myListView>()



    fun getdataofnumber():ArrayList<myListView>
    {
        cnumberlist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        cnumberlist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        cnumberlist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        cnumberlist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return cnumberlist

    }

    fun getdataoffamily():ArrayList<myListView>
    {
        cfamilylist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        cfamilylist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        cfamilylist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        cfamilylist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return cfamilylist
    }
    fun getdataofcolor():ArrayList<myListView>
    {
        ccolorlist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        ccolorlist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        ccolorlist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        ccolorlist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return ccolorlist
    }

    fun getdataofmonth() :ArrayList<myListView>
    {
        cmonthlist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        cmonthlist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        cmonthlist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        cmonthlist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return cmonthlist
    }



}