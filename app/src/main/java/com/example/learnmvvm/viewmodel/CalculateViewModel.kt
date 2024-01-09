package com.example.learnmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.learnmvvm.model.CalculateData

class CalculateViewModel: ViewModel() {
    fun calculateSum(num1: Int, num2 : Int): CalculateData{
        val sum = num1 + num2
        return CalculateData(num1,num2,sum)
    }
}