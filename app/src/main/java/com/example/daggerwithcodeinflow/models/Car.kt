package com.example.daggerwithcodeinflow.models

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {
    fun drive() {
        Log.d(TAG, "DRIVING CAR")
    }

    @Inject
    fun addRemote(remote: Remote) {
        Log.d(TAG, "adding remote")
        remote.setListener(this)
    }

    companion object {
        private val TAG = "TESTING-${Car::class.simpleName}"
    }
}