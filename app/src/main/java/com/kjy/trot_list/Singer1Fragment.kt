package com.kjy.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_singer1, container, false)



        val items = mutableListOf<String>()
        items.add("니가 왜 거기서나와")
        items.add("이불")
        items.add("찐이야")
        items.add("바람의 노래")
        items.add("꼰대라떼")
        items.add("막걸리 한잔")
        items.add("누나가 딱이야")
        items.add("옆집 오빠")
        items.add("추억으로 가는 당신")
        items.add("먼지가 되어")
        items.add("나는 나비")
        items.add("사내")
        items.add("부담")
        items.add("우리 정말 나쁘다")
        items.add("자기야")
        items.add("사랑한다")


        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)


        val image2 = view.findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener {

            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)

        }


        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {

            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)


        }


        return view
    }

    }
