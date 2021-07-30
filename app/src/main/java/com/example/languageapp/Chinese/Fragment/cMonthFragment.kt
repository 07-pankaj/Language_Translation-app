package com.example.languageapp.Chinese.Fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.languageapp.Chinese.ChineseViewModel
import com.example.languageapp.German.GFragment.RecycleViewadapter
import com.example.languageapp.German.GFragment.onclick
import com.example.languageapp.R


class cMonthFragment : Fragment(),onclick {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_c_month, container, false)
        val viewmodel = ViewModelProvider(requireActivity()).get(ChineseViewModel::class.java)

        val recycleview: RecyclerView = view.findViewById(R.id.c_mrecycleview)
        recycleview.layoutManager = LinearLayoutManager(context)

        val adp = RecycleViewadapter(viewmodel.getdataofmonth(),this)
        recycleview.adapter = adp
        return view
    }

    override fun onclickonitem(audio: Int) {
        val player = MediaPlayer.create(context,audio)
        player.start()

        player.setOnCompletionListener {
            player.release()
        }
    }


}