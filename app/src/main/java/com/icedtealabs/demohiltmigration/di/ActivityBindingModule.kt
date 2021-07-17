package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.feature.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

}
