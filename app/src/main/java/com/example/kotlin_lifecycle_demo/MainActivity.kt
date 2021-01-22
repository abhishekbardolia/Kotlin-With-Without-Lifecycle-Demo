package com.example.kotlin_lifecycle_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var timerToastClass:TimerToastClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timerToastClass= TimerToastClass(application,this)

        //we dont need this code now as everything will be handled by lifecycle owner
//        timerToastClass.start()
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        timerToastClass.stop()
//    }
}