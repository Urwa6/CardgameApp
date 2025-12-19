package com.example.cardgame

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import androidx.fragment.app.Fragment

class GameFragment : Fragment(R.layout.fragment_game) {

    private var firstCard: ImageView? = null
    private var lock = false
    private var matchedCount = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val grid = view.findViewById<GridLayout>(R.id.cardGrid)

        val symbols = listOf(
            R.drawable.ic_card1,
            R.drawable.ic_card2,
            R.drawable.ic_card3
        ).flatMap { listOf(it, it) }.shuffled()

        val totalPairs = symbols.size  // Dynamic total cards

        symbols.forEach { symbol ->
            val card = ImageView(requireContext()).apply {
                setImageResource(R.drawable.card_back)
                tag = symbol
                layoutParams = GridLayout.LayoutParams().apply {
                    width = 220
                    height = 300
                    setMargins(16, 16, 16, 16)
                }
                scaleType = ImageView.ScaleType.CENTER_CROP
            }

            card.setOnClickListener {
                if (!lock && card != firstCard &&
                    card.drawable.constantState ==
                    resources.getDrawable(R.drawable.card_back, requireContext().theme).constantState
                ) {
                    flip(card, totalPairs)
                }
            }

            grid.addView(card)
        }
    }

    private fun flip(card: ImageView, totalPairs: Int) {
        card.setImageResource(card.tag as Int)

        if (firstCard == null) {
            firstCard = card
        } else {
            lock = true
            Handler(Looper.getMainLooper()).postDelayed({
                checkMatch(card, totalPairs)
            }, 700)
        }
    }

    private fun checkMatch(second: ImageView, totalPairs: Int) {
        if (firstCard?.tag == second.tag) {
            matchedCount += 2
            if (matchedCount == totalPairs) {
                (activity as MainActivity).goToPage(2)  // Navigate to WinFragment
            }
        } else {
            firstCard?.setImageResource(R.drawable.card_back)
            second.setImageResource(R.drawable.card_back)
        }

        firstCard = null
        lock = false
    }
}
