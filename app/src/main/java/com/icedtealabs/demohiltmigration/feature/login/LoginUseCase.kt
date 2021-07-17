package com.icedtealabs.demohiltmigration.feature.login

import androidx.lifecycle.LiveData
import com.icedtealabs.demohiltmigration.repository.AccountRepository
import javax.inject.Inject

interface LoginUseCase {
    fun execute(username: String, password: String): LiveData<String>
}

class LoginUseCaseImpl @Inject constructor(
    private val accountRepository: AccountRepository
) : LoginUseCase {

    override fun execute(username: String, password: String): LiveData<String> {
        return accountRepository.authenticate(username, password)
    }

}
