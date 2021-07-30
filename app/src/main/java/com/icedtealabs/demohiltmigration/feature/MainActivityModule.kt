package com.icedtealabs.demohiltmigration.feature

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class MainActivityModule {
    @Binds
    abstract fun checkAppUpdateUseCase(impl: CheckAppUpdateUseCaseImpl): CheckAppUpdateUseCase
}
