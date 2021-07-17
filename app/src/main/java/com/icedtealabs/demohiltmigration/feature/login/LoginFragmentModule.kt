package com.icedtealabs.demohiltmigration.feature.login

import com.icedtealabs.demohiltmigration.repository.AccountRepository
import dagger.Module
import dagger.Provides

@Module
class LoginFragmentModule {

    @Provides
    fun loginUseCase(accountRepository: AccountRepository): LoginUseCase =
        LoginUseCaseImpl(accountRepository)

    @Provides
    fun viewModel(loginUseCase: LoginUseCase) = LoginViewModel(loginUseCase)
}
