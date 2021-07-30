package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.api.AppApi
import com.icedtealabs.demohiltmigration.api.AppApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
abstract class ApiModule {
    @Binds
    abstract fun appApi(impl: AppApiImpl): AppApi
}
