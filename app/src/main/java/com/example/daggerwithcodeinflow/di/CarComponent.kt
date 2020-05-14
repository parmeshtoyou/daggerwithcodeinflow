package com.example.daggerwithcodeinflow.di

import com.example.daggerwithcodeinflow.MainActivity
import com.example.daggerwithcodeinflow.models.Car
import com.example.daggerwithcodeinflow.models.WheelsModule
import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}