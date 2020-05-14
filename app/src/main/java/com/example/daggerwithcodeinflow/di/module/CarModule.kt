package com.example.daggerwithcodeinflow.di.module

import com.example.daggerwithcodeinflow.models.Car

abstract class CarModule {
    abstract fun provideCar() : Car
}