package com.android.fruitdetectorapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.fruitdetectorapps.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding : ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}