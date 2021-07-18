package com.icedtealabs.demohiltmigration.feature.dashboard

import com.icedtealabs.demohiltmigration.repository.AccountRepository
import dagger.Module
import dagger.Provides

@Module
class ProfileFragmentModule {

    @Provides
    fun loadProfileUseCase(accountRepository: AccountRepository): LoadProfileUseCase =
        LoadProfileUseCaseImpl(accountRepository)

    @Provides
    fun viewModel(loadProfileUseCase: LoadProfileUseCase) = ProfileViewModel(loadProfileUseCase)
}
