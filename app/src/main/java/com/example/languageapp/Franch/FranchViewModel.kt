package com.example.languageapp.Franch

import androidx.lifecycle.ViewModel
import com.example.languageapp.R
import com.example.languageapp.myListView

class FranchViewModel : ViewModel() {

    var fnumberlist = ArrayList<myListView>()
    var ffamilylist = ArrayList<myListView>()
    val fcolorlist = ArrayList<myListView>()
    val fmonthlist = ArrayList<myListView>()



    fun getdataofnumber():ArrayList<myListView>
    {
        fnumberlist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        fnumberlist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        fnumberlist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        fnumberlist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return fnumberlist

    }

    fun getdataoffamily():ArrayList<myListView>
    {
        ffamilylist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        ffamilylist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        ffamilylist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        ffamilylist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return ffamilylist
    }
    fun getdataofcolor():ArrayList<myListView>
    {
        fcolorlist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        fcolorlist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        fcolorlist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        fcolorlist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return fcolorlist
    }

    fun getdataofmonth() :ArrayList<myListView>
    {
        fmonthlist.add(myListView("ONE","one", R.drawable.number_two, R.raw.g_april))
        fmonthlist.add(myListView("TWO","two", R.drawable.number_two, R.raw.g_april))
        fmonthlist.add(myListView("THREE","three", R.drawable.number_two, R.raw.g_april))
        fmonthlist.add(myListView("FOUW","four", R.drawable.number_two, R.raw.g_april))

        return fmonthlist
    }



}