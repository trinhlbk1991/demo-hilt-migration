package com.icedtealabs.demohiltmigration.feature.login

import com.icedtealabs.demohiltmigration.repository.AccountRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class LoginFragmentModule {

    @Provides
    fun loginUseCase(accountRepository: AccountRepository): LoginUseCase =
        LoginUseCaseImpl(accountRepository)

    @Provides
    fun viewModel(loginUseCase: LoginUseCase) = LoginViewModel(loginUseCase)
}
