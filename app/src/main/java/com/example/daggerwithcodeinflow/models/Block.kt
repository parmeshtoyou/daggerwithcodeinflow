package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

class Block @Inject constructor() {

    init {
        Log.d("TESTING-PARAM", "Block Initialization")
    }
}