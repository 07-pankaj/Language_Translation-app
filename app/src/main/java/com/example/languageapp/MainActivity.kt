package com.example.languageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.languageapp.Chinese.ChineseMainActivity
import com.example.languageapp.Franch.FranchMainActivity
import com.example.languageapp.German.GermanMainActivity
import com.example.languageapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.German.setOnClickListener {
            val intent = Intent(this,GermanMainActivity::class.java)
            startActivity(intent)
        }

        binding.Franch.setOnClickListener {
            val intent = Intent(this,FranchMainActivity::class.java)
            startActivity(intent)
        }
        binding.Chinese.setOnClickListener {
            val intent = Intent(this,ChineseMainActivity::class.java)
            startActivity(intent)
        }

    }
}