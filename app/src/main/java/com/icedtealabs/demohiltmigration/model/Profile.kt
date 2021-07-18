package com.icedtealabs.demohiltmigration.model

import androidx.annotation.DrawableRes

data class Profile(
    val username: String,
    @DrawableRes val avatar: Int,
)
