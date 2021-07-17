package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.feature.login.LoginFragment
import com.icedtealabs.demohiltmigration.feature.login.LoginFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector(modules = [LoginFragmentModule::class])
    abstract fun loginFragment(): LoginFragment

}
