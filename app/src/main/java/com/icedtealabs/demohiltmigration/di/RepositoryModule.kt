package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.repository.AccountRepository
import com.icedtealabs.demohiltmigration.repository.AccountRepositoryIml
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun accountRepository(impl: AccountRepositoryIml): AccountRepository
}
