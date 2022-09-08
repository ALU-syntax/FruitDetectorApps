package com.android.fruitdetectorapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.android.fruitdetectorapps.databinding.ActivityIntroBinding
import com.android.fruitdetectorapps.fragment.IntroDuaFragment
import com.android.fruitdetectorapps.fragment.IntroSatuFragment
import com.android.fruitdetectorapps.fragment.IntroTigaFragment

class IntroActivity : AppCompatActivity() {

    private lateinit var binding : ActivityIntroBinding

    private val fragmentList = ArrayList<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = IntroSliderAdapter(this)
        binding.vpIntro.adapter = adapter

        fragmentList.addAll(listOf(
            IntroSatuFragment(), IntroDuaFragment(), IntroTigaFragment()
        ))
        adapter.setFragmentList(fragmentList)

        binding.indicatorLayout.setIndicatorCount(adapter.itemCount)
        binding.indicatorLayout.selectCurrentPosition(0)

        registerListener()
    }

    private fun registerListener() {
        binding.vpIntro.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                binding.indicatorLayout.selectCurrentPosition(position)

                if (position < fragmentList.lastIndex){
                    binding.fabNext.visibility = View.INVISIBLE
                }else{
                    binding.fabNext.visibility = View.VISIBLE
                }
            }
        })
    }
}