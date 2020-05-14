package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setListener(car: Car) {
        Log.d("TESTING-PARAM", "Remote Connected! $car")
    }
}