package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.repository.AccountRepository
import com.icedtealabs.demohiltmigration.repository.AccountRepositoryIml
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun accountRepository(impl: AccountRepositoryIml): AccountRepository
}
