package com.example.android.eggtimernotifications

import android.app.Application
import timber.log.Timber

class App: Application(){

    override fun onCreate() {
        super.onCreate()

        Timber.plant(object : Timber.DebugTree(){

            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                super.log(priority, "global_tag_$tag", message, t)
            }

//            create tag
            override fun createStackElementTag(element: StackTraceElement): String? {
                return String.format(
                    "%s:%s",
                    element.methodName,
                    element.lineNumber,
                    super.createStackElementTag(element)
                )
            }
        })

//        Usage
        Timber.d("App Created")
    }
}