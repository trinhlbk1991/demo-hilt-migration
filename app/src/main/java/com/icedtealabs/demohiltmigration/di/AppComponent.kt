package com.icedtealabs.demohiltmigration.di

import com.icedtealabs.demohiltmigration.App
import dagger.Component
import dagger.BindsInstance
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule


@Component(
    modules = [
        ApiModule::class,
        RepositoryModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        FragmentBindingModule::class,
    ]
)
interface AppComponent {

    fun inject(app: App)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }
}
