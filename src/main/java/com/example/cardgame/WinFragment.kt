package com.example.cardgame

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class WinFragment : Fragment(R.layout.fragment_win) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.playAgainBtn).setOnClickListener {
            (activity as MainActivity).goToPage(0)  // Navigate back to StartFragment
        }
    }
}
