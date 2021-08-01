package com.icedtealabs.demohiltmigration

import android.app.Application
import com.icedtealabs.demohiltmigration.di.AppEntryPoint
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        _instance = this
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

    fun component(): AppEntryPoint {
        return EntryPoints.get(this, AppEntryPoint::class.java)
    }

    companion object {
        private lateinit var _instance: App

        fun instance(): App = _instance
    }
}
