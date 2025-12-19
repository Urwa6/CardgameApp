package com.example.cardgame

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class GamePagerAdapter(activity: AppCompatActivity)
    : FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StartFragment()
            1 -> GameFragment()
            else -> WinFragment()
        }
    }
}
