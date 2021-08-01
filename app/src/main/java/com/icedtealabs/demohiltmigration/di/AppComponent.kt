package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.feature.componentinjection.DemoActivity
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(
    includes = [
        ApiModule::class,
        RepositoryModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        FragmentBindingModule::class,
    ]
)
interface AppAggregatorModule

@InstallIn(SingletonComponent::class)
@EntryPoint
interface AppEntryPoint {

    fun inject(activity: DemoActivity)

}
