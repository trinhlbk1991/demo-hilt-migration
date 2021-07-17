package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.api.AppApi
import com.icedtealabs.demohiltmigration.api.AppApiImpl
import dagger.Binds
import dagger.Module

@Module
abstract class ApiModule {
    @Binds
    abstract fun appApi(impl: AppApiImpl): AppApi
}
