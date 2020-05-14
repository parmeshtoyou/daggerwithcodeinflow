package com.example.daggerwithcodeinflow.models

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideTires(): Tires {
        return Tires().also { it.inflate() }
    }

    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideWheels(tires: Tires, rims: Rims): Wheels {
        return Wheels(tires, rims)
    }
}