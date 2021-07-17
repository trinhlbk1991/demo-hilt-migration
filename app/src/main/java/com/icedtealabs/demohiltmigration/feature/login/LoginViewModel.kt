package com.icedtealabs.demohiltmigration.feature.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

/**
 * I know this is an incorrect way to inject ViewModel.
 * But I'm lazy af 🥲 so this should be enough for the sample.
 */
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    fun login(username: String, password: String): LiveData<String> {
        return loginUseCase.execute(username, password)
    }

}
