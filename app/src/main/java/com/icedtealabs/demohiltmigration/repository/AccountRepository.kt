package com.icedtealabs.demohiltmigration.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.icedtealabs.demohiltmigration.api.AppApi
import javax.inject.Inject

interface AccountRepository {
    fun authenticate(username: String, password: String): LiveData<String>
}

class AccountRepositoryIml @Inject constructor(
    private val api: AppApi
) : AccountRepository {
    override fun authenticate(username: String, password: String): LiveData<String> {
        return liveData {
            emit(api.authenticate(username, password))
        }
    }
}
