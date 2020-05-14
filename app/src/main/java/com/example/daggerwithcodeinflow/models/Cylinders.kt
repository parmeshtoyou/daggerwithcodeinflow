package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

class Cylinders @Inject constructor() {

    init {
        Log.d("TESTING-PARAM", "Cylinders Initialization")
    }
}