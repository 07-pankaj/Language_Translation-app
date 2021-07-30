package com.example.languageapp.Franch.FFragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.languageapp.Franch.FranchViewModel
import com.example.languageapp.German.GFragment.RecycleViewadapter
import com.example.languageapp.German.GFragment.onclick
import com.example.languageapp.R


class fNumberFragment : Fragment(), onclick {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view :View = inflater.inflate(R.layout.fragment_f_number, container, false)

        val viewmodel = ViewModelProvider(requireActivity()).get(FranchViewModel::class.java)
        val recycleview:RecyclerView = view.findViewById(R.id.f_nrecycleview)
        recycleview.layoutManager = LinearLayoutManager(context)

        val adp = RecycleViewadapter(viewmodel.getdataofnumber(),this)
        recycleview.adapter = adp

        return view
    }

    override fun onclickonitem(audio: Int) {

        val player = MediaPlayer.create(context,audio)
        player.start();

        player.setOnCompletionListener {
            player.release()
        }


    }


}