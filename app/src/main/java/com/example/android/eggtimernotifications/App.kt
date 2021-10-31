package com.example.android.eggtimernotifications

import android.app.Application
import timber.log.Timber

class App: Application(){

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}