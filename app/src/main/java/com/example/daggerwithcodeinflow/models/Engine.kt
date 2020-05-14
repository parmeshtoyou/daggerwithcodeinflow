package com.example.daggerwithcodeinflow.models

import javax.inject.Inject

data class Engine @Inject constructor(
    val block: Block,
    val cylinders: Cylinders,
    val sparkPlugs: SparkPlugs
)