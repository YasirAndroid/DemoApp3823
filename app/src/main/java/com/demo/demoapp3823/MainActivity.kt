package com.demo.demoapp3823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.demo.demoapp3823.databinding.ActivityMainBinding
import com.demo.demoapp3823.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createObserver()

    }

    private fun createObserver() {
        var viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.categoryData.observe(this) {
            if (it!=null) {
                Log.d("Data", it.toString())
            }
        }
        viewModel.getCategoryData()
    }
}