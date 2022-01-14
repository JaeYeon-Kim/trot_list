package com.kjy.trot_list

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_singer3, container, false)


        val items = mutableListOf<String>()
        items.add("진정인가요")
        items.add("무명배우")
        items.add("거기까지만")
        items.add("묻고싶어요")
        items.add("영동부르스")
        items.add("한많은 대동강")
        items.add("목포의 눈물")
        items.add("모르나봐")
        items.add("단장의 미아리고개")
        items.add("항구아가씨")
        items.add("화류춘몽")
        items.add("백만송이 장미")
        items.add("열두줄")
        items.add("신사동 그사람")





        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.image1).setOnClickListener {

            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.image2).setOnClickListener {

            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
        }



        return view
    }



}