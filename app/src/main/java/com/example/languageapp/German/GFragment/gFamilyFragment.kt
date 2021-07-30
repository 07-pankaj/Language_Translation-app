package com.example.languageapp.German.GFragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.languageapp.German.GermanViewModel
import com.example.languageapp.R



class gFamilyFragment : Fragment(),onclick {


    lateinit var player: MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view :View = inflater.inflate(R.layout.fragment_g_family, container, false)

        val germanViewModel = ViewModelProvider(requireActivity()).get(GermanViewModel::class.java)
        val recycleview :RecyclerView = view.findViewById(R.id.familyrecycleview)
        recycleview.layoutManager = LinearLayoutManager(context)

        val radapter = RecycleViewadapter(germanViewModel.getdataoffamily(),this)

        recycleview.adapter = radapter


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