package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

class Rims @Inject constructor() {
    init {
        Log.d("TESTING-PARAM", "Rims Initialization")
    }
}