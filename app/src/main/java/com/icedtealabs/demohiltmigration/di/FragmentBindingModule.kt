package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.feature.dashboard.ProfileFragment
import com.icedtealabs.demohiltmigration.feature.dashboard.ProfileFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector(modules = [ProfileFragmentModule::class])
    abstract fun profileFragment(): ProfileFragment

}
