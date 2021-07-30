package com.example.languageapp.German

import androidx.lifecycle.ViewModel
import com.example.languageapp.R
import com.example.languageapp.myListView

class GermanViewModel : ViewModel() {

     val gnumberlist = ArrayList<myListView>()
    val gfamilylist = ArrayList<myListView>()
    val gcolorlist = ArrayList<myListView>()
    val gmonthlist = ArrayList<myListView>()

    fun getdataofnumber():ArrayList<myListView>{
        gnumberlist.add(myListView("Eins","one",R.drawable.one, R.raw.g_one))
        gnumberlist.add(myListView("Zwei","two",R.drawable.two, R.raw.g_two))
        gnumberlist.add(myListView("Drei","three",R.drawable.three, R.raw.g_three))
        gnumberlist.add(myListView("Vier","four",R.drawable.four, R.raw.g_four))
        gnumberlist.add(myListView("fünf","five",R.drawable.five, R.raw.g_five))
        gnumberlist.add(myListView("sechs","six",R.drawable.six, R.raw.g_six))
        gnumberlist.add(myListView("sieben","seven",R.drawable.seven, R.raw.g_seven))
        gnumberlist.add(myListView("acht","eight",R.drawable.eight, R.raw.g_eight))
        gnumberlist.add(myListView("neun","nine",R.drawable.nine, R.raw.g_nine))
        gnumberlist.add(myListView("zehn","ten",R.drawable.ten, R.raw.g_ten))


        return gnumberlist
    }


    fun getdataoffamily():ArrayList<myListView>{

        gfamilylist.add(myListView(" Der Opa","Grand Father",R.drawable.grandfather,R.raw.g_grandpa))
        gfamilylist.add(myListView("Die Oma","Grand Mother",R.drawable.grandmother,R.raw.g_grandma))
        gfamilylist.add(myListView("Vater","Father",R.drawable.father, R.raw.g_father))
        gfamilylist.add(myListView("Mutter","Mother",R.drawable.mother, R.raw.g_mother))
        gfamilylist.add(myListView("Sohn","Son",R.drawable.son,R.raw.g_son))
        gfamilylist.add(myListView("Tochter","Daughter",R.drawable.daughter, R.raw.g_daughter))
        gfamilylist.add(myListView("Schwester","Sister",R.drawable.sister, R.raw.g_sister))
        gfamilylist.add(myListView("Bruder","Brother",R.drawable.brother, R.raw.g_brother))
        gfamilylist.add(myListView("Kinder","Children",R.drawable.children, R.raw.g_children))
        gfamilylist.add(myListView("Ehemann","Husband",R.drawable.husband, R.raw.g_husband))
        gfamilylist.add(myListView("Ehefrau","Wife",R.drawable.wife, R.raw.g_wife))
        gfamilylist.add(myListView("kind","Child",R.drawable.child, R.raw.g_child))

        return gfamilylist
    }

    fun getdataofcolor():ArrayList<myListView>
    {
        gcolorlist.add(myListView("Schwarz","Black",R.drawable.black, R.raw.g_black))
        gcolorlist.add(myListView("Weiß","White",R.drawable.white, R.raw.g_white))
        gcolorlist.add(myListView("Blau","Blue",R.drawable.blue, R.raw.g_blue))
        gcolorlist.add(myListView("Grün","Green",R.drawable.green, R.raw.g_green))
        gcolorlist.add(myListView("Orange","Orange",R.drawable.orange1, R.raw.g_orange))
        gcolorlist.add(myListView("Rosa","Pink",R.drawable.pink, R.raw.g_pink))
        gcolorlist.add(myListView("Rot","Red",R.drawable.red, R.raw.g_red))
        gcolorlist.add(myListView("Gelb","Yellow",R.drawable.yellow1, R.raw.g_yellow))
        gcolorlist.add(myListView("Braun","Brown",R.drawable.brown, R.raw.g_brown))
        gcolorlist.add(myListView("Violett","Purple",R.drawable.purple, R.raw.g_purple))
        gcolorlist.add(myListView("Grau","Grey",R.drawable.grey, R.raw.g_grey))

        return gcolorlist

    }

    fun getdataofmonth():ArrayList<myListView>
    {
        gmonthlist.add(myListView("Januar","January",R.drawable.jan, R.raw.g_jan))
        gmonthlist.add(myListView("Februar","February",R.drawable.feb, R.raw.g_feb))
        gmonthlist.add(myListView("März","March",R.drawable.march, R.raw.g_march))
        gmonthlist.add(myListView("April","April",R.drawable.april, R.raw.g_april))
        gmonthlist.add(myListView("Mai","May",R.drawable.may, R.raw.g_may))
        gmonthlist.add(myListView("Juni","June",R.drawable.jun, R.raw.g_june))
        gmonthlist.add(myListView("Juli","July",R.drawable.july, R.raw.g_july))
        gmonthlist.add(myListView("August","Augest",R.drawable.aug, R.raw.g_aug))
        gmonthlist.add(myListView("September","September",R.drawable.sep, R.raw.g_sept))
        gmonthlist.add(myListView("Oktober","October",R.drawable.oct, R.raw.g_oct))
        gmonthlist.add(myListView("November","November",R.drawable.nov, R.raw.g_nov))
        gmonthlist.add(myListView("Dezember","December",R.drawable.dec, R.raw.g_dec))

        return gmonthlist

    }






}