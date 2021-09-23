package com.example.ypp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 *
 */
class GppApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@GppApplication)
        }
        loadFeature()
    }
}