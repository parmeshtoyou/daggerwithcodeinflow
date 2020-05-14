package com.example.daggerwithcodeinflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerwithcodeinflow.di.CarComponent
import com.example.daggerwithcodeinflow.di.DaggerCarComponent
import com.example.daggerwithcodeinflow.models.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val block = Block()
        val cylinders = Cylinders()
        val sparkPlugs = SparkPlugs()
        val engine = Engine(block, cylinders, sparkPlugs)

        val tires = Tires()
        val rims = Rims()
        val wheel = Wheels(tires, rims)

        val car = Car(engine, wheel)
        car.drive()*/

        val carComponent = DaggerCarComponent.create()
        carComponent.getCar().drive()
    }
}
