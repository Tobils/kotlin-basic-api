package com.example.ypp

import com.google.gson.Gson
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


private inline fun <reified T> createNetwork(gson: Gson): T {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://random-data-api.com/api/")
        .addConverterFactory(GsonConverterFactory.create(gson))

    return retrofit.build().create(T::class.java)
}

// singleton untuk dependency injection
private val HttpModule = module {
    single<RandomAPI> { createNetwork(Gson()) }
}

private val ViewModelModule = module {
    viewModel {MainViewModel(get())} // constructor auto
}

fun loadFeature() = lazyInject

private val lazyInject by lazy {
    loadKoinModules(
        HttpModule + ViewModelModule
    )
}