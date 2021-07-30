package com.example.languageapp.German.GFragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.languageapp.German.GermanViewModel
import com.example.languageapp.R


class gMonthFragment : Fragment(),onclick {


    lateinit var player: MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view :View = inflater.inflate(R.layout.fragment_g_month, container, false)

        val germanViewModel = ViewModelProvider(requireActivity()).get(GermanViewModel::class.java)

        val recycleview :RecyclerView = view.findViewById(R.id.monthrecycleview)
        recycleview.layoutManager = LinearLayoutManager(context)

        val adp = RecycleViewadapter(germanViewModel.getdataofmonth(),this)
        recycleview.adapter = adp
        return view
    }

    override fun onclickonitem(audio: Int) {
         player = MediaPlayer.create(context,audio)
        player.start()

        player.setOnCompletionListener {
            release()
        }

    }



    private fun release(){

        player.let {
            player.release()

        }
    }


}