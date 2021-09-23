package com.example.ypp.enums

// sama ajah kayak enum tapi lebih flexible
sealed class State {
    object SUCCESS : State()
    object ERROR : State()
    object LOADING : State()
}