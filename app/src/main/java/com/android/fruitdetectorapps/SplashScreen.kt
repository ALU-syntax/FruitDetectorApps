package com.android.fruitdetectorapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.android.fruitdetectorapps.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.delay

class SplashScreen : AppCompatActivity() {

    private lateinit var binding : ActivitySplashScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Handler().postDelayed({
            Intent(this, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        },4000L)

    }
}