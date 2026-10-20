package com.example.stasia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stasia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleTextView.text = getString(R.string.app_name)
        binding.statusTextView.text = getString(R.string.app_ready)
    }
}
