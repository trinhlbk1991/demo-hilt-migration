package com.icedtealabs.demohiltmigration.api

import javax.inject.Inject

interface AppApi {
    fun authenticate(username: String, password: String): String

    fun checkHasNewUpdate(): Boolean
}

class AppApiImpl @Inject constructor() : AppApi {
    override fun authenticate(username: String, password: String): String {
        return "auth-token"
    }

    override fun checkHasNewUpdate(): Boolean {
        return true
    }
}
