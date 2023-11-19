package com.example.teamproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teamproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}