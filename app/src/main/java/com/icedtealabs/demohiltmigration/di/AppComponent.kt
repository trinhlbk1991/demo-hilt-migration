package com.icedtealabs.demohiltmigration.di

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

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
