package com.icedtealabs.demohiltmigration.feature.dashboard

import androidx.lifecycle.LiveData
import com.icedtealabs.demohiltmigration.model.Profile
import com.icedtealabs.demohiltmigration.repository.AccountRepository
import javax.inject.Inject

interface LoadProfileUseCase {
    fun execute(): LiveData<Profile>
}

class LoadProfileUseCaseImpl @Inject constructor(
    private val accountRepository: AccountRepository
): LoadProfileUseCase {

    override fun execute(): LiveData<Profile> {
        return accountRepository.loadProfile()
    }

}
