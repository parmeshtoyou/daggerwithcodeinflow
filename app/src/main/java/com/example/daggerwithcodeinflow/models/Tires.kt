package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

class Tires @Inject constructor() {
    init {
        Log.d("TESTING-PARAM", "Tires Initialization")
    }
}