package com.example.thebestappintheworld

import ViewPagerAdapter
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.thebestappintheworld.activity.ExpenseActivity
import com.example.thebestappintheworld.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        binding.frameLayout.adapter = pagerAdapter

        binding.frameLayout.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                if (position == 2) {
                    binding.bottomNav.menu.getItem(position+1).isChecked = true
                } else if (position == 3) {
                    binding.bottomNav.menu.getItem(position+1).isChecked = true
                }
                else binding.bottomNav.menu.getItem(position).isChecked = true
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    binding.frameLayout.currentItem = 0
                    true
                }
                R.id.nav_wallet -> {
                    binding.frameLayout.currentItem = 1
                    true
                }
                R.id.nav_chart -> {
                    binding.frameLayout.currentItem = 2
                    true
                }
                R.id.nav_setting -> {
                    binding.frameLayout.currentItem = 3
                    true
                }
                R.id.nav_add -> {
                    val intent = Intent(this, ExpenseActivity::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }

//        binding.bottomNav.itemIconTintList = null

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}