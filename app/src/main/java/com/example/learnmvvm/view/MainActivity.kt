package com.example.learnmvvm.view

import android.app.Activity
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learnmvvm.R
import com.example.learnmvvm.databinding.ActivityMainBinding
import com.example.learnmvvm.viewmodel.CalculateViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculateViewModel: CalculateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculateViewModel = ViewModelProvider(this).get(CalculateViewModel::class.java)

        binding.calculateButton.setOnClickListener {
            val num1 = binding.editTextNum1.text.toString().toIntOrNull()?:0
            val num2 = binding.editTextNum2.text.toString().toIntOrNull()?:0

            val result = calculateViewModel.calculateSum(num1,num2)
            binding.resultTextView.text = "${result.sum}"
        }
    }
}