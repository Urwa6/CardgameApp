package com.example.cardgame



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        viewPager.isUserInputEnabled = false

        viewPager.adapter = GamePagerAdapter(this)
    }

    fun goToPage(page: Int) {
        viewPager.currentItem = page
    }
}
