package com.android.fruitdetectorapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.fruitdetectorapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMulai.setOnClickListener{
            Intent(this, IntroActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.btnTentangAplikasi.setOnClickListener{

        }

        binding.btnKeluar.setOnClickListener{
            onDestroy()
        }

        binding.btnInstagram.setOnClickListener{

        }

        binding.btnGithub.setOnClickListener{

        }

    }
}