package com.example.daggerwithcodeinflow.models

import javax.inject.Inject

data class Wheels @Inject constructor(val tires: Tires, val rims: Rims)
