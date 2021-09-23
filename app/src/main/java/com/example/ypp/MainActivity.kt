package com.example.ypp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.ypp.enums.State
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * pattern yang digunakan
 */
class MainActivity : AppCompatActivity() {
    private val  mainViewModel: MainViewModel by viewModel()

    private var text: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.text)
        mainViewModel.getRandomRestaurant()
        androidObserver()
    }

    private fun androidObserver(){
        mainViewModel.randomState.observe(owner = this, {
            when(it.state) {
                State.LOADING -> {
                    Log.i("Main", "Loading")
                    text?.text = "Loading"
                }
                State.SUCCESS -> {
                    Log.i("Main", it.data.toString())
                    text?.text = it.data.toString()

                }
                State.ERROR -> {
                    Log.i("Main", it.message?:"")
                    text?.text = it.message?:""

                }
            }
        })
    }

}