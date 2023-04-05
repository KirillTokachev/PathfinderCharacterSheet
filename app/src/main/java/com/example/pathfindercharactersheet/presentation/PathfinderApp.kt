package com.example.pathfindercharactersheet.presentation

import android.app.Application
import com.example.pathfindercharactersheet.di.DaggerApplicationComponent

class PathfinderApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this, applicationContext)
    }
}