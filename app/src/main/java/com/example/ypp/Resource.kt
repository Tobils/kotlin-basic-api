package com.example.ypp

import com.example.ypp.enums.State

data class Resource<out T>(
    val state: State,
    val data: T? = null,
    val message: String? = null
)