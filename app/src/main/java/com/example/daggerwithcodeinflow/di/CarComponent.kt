package com.example.daggerwithcodeinflow.di

import com.example.daggerwithcodeinflow.models.Car
import dagger.Component

@Component
interface CarComponent {
   fun getCar() : Car
}