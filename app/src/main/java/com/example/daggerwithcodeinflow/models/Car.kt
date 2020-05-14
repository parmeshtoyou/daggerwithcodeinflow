package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {
    fun drive() {
        Log.d(TAG, "DRIVING CAR")
    }

    companion object {
        private val TAG = Car::class.simpleName
    }
}