package com.example.android_wearos_example

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.android_wearos_example.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityMainButtonTest.setOnClickListener {
            Log.d("myLog", "test")
        }
    }

}