package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

class SparkPlugs @Inject constructor() {
    init {
        Log.d("TESTING-PARAM", "SparkPlugs Initialization")
    }
}