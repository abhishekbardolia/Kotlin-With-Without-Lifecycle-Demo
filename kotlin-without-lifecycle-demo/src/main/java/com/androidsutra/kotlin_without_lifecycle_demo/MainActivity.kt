package com.androidsutra.kotlin_without_lifecycle_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var timerToast:TimerToastClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timerToast= TimerToastClass(application)
        timerToast.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        timerToast.stop()
    }
}