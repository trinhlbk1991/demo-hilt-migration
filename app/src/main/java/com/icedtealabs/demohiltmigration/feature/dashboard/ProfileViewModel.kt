package com.icedtealabs.demohiltmigration.feature.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.icedtealabs.demohiltmigration.model.Profile
import javax.inject.Inject

/**
 * I know this is an incorrect way to inject ViewModel.
 * But I'm lazy af 🥲 so this should be enough for the sample.
 */
class ProfileViewModel @Inject constructor(
    private val loadProfileUseCase: LoadProfileUseCase
) : ViewModel() {

    fun loadProfile(): LiveData<Profile> {
        return loadProfileUseCase.execute()
    }

}
