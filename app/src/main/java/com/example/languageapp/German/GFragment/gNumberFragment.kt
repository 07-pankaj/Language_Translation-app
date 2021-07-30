package com.example.languageapp.German.GFragment

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
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



class gNumberFragment : Fragment(),onclick {

    lateinit var player: MediaPlayer

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment

        val view :View = inflater.inflate(R.layout.fragment_g_number, container, false)
        val germanViewModel = ViewModelProvider(requireActivity()).get(GermanViewModel::class.java)



        val rv:RecyclerView = view.findViewById(R.id.recycle_vieww)
        rv.layoutManager = LinearLayoutManager(context)



        val rvadapter = RecycleViewadapter(germanViewModel.getdataofnumber(),this)
        rv.adapter = rvadapter

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