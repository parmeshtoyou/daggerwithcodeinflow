package com.example.daggerwithcodeinflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerwithcodeinflow.di.CarComponent
import com.example.daggerwithcodeinflow.di.DaggerCarComponent
import com.example.daggerwithcodeinflow.models.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

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

        //un used
        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        //initialized using field injection
        car.drive()
    }
}
