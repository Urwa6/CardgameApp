package com.example.cardgame

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val startBtn = view.findViewById<Button>(R.id.startGameBtn)

        startBtn.setOnClickListener {
            (activity as MainActivity).goToPage(1)
        }
    }
}
