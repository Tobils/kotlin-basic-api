package com.example.ypp

import SingleLiveEvent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ypp.extensions.setError
import com.example.ypp.extensions.setLoading
import com.example.ypp.extensions.setSuccess
import com.example.ypp.response.GetResponseRandomRestaurant
import kotlinx.coroutines.launch
import java.lang.Error

class MainViewModel(private val api: RandomAPI): ViewModel() {
    val randomState = SingleLiveEvent<Resource<GetResponseRandomRestaurant>>()

    /**
     * async
     */
    fun getRandomRestaurant(){
        randomState.setLoading()
        viewModelScope.launch {
            try {
                val response = api.getRestaurant()
                randomState.setSuccess(response)
            }catch (e: Exception){
                randomState.setError(e.localizedMessage)
            }
        }
    }
}