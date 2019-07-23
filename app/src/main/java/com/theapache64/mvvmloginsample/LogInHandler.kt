package com.theapache64.mvvmloginsample

/**
 * To pass UI events to activity
 */
interface LogInHandler {

    /**
     * Will be called when login button gets clicked
     */
    fun onLogInClicked()
}