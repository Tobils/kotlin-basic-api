package com.example.ypp.extensions

import androidx.lifecycle.MutableLiveData
import com.example.ypp.Resource
import com.example.ypp.enums.State

fun <T> MutableLiveData<Resource<T>>.set(state: State, data: T? = null, message: String? = null) =
    postValue(Resource(state, data, message))

fun <T> MutableLiveData<Resource<T>>.setSuccess(data: T?) =
    set(State.SUCCESS, data)

fun <T> MutableLiveData<Resource<T>>.setLoading() =
    set(State.LOADING, value?.data)

fun <T> MutableLiveData<Resource<T>>.setError(message: String? = null) =
    set(State.ERROR, value?.data, message)

fun <T> MutableLiveData<Resource<T>>.setError(message: String? = null, data: T?) =
    set(State.ERROR, data, message)

/**
 * digunakan untuk helper atau menambahkan method tambahan
*/