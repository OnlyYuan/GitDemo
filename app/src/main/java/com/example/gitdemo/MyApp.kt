package com.example.gitdemo

import android.app.Application
import android.graphics.drawable.AnimationDrawable
import android.util.Log

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Thread.sleep(2000)

    }

}