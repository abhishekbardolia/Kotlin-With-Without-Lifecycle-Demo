package com.androidsutra.kotlin_without_lifecycle_demo

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast

class TimerToastClass(application: Application) {

    private val timerToast = object : CountDownTimer(60000,2000){
        override fun onTick(millisUntilFinished: Long) {
            Toast.makeText(application,"$millisUntilFinished",Toast.LENGTH_SHORT).show()

        }

        override fun onFinish() {

            Toast.makeText(application,"Finish",Toast.LENGTH_SHORT).show()
        }

    }

    fun start(){
        timerToast.start()
    }

    fun stop(){
        timerToast.cancel()
    }

}