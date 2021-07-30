package com.icedtealabs.demohiltmigration.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.icedtealabs.demohiltmigration.api.AppApi
import javax.inject.Inject

interface CheckAppUpdateUseCase {
    fun execute(): LiveData<Boolean>
}

class CheckAppUpdateUseCaseImpl @Inject constructor(
    private val appApi: AppApi
) : CheckAppUpdateUseCase {
    override fun execute(): LiveData<Boolean> {
        return liveData {
            emit(appApi.checkHasNewUpdate())
        }
    }
}

