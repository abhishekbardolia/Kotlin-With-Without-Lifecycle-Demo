package com.example.kotlin_lifecycle_demo

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

// In order to timerToast observe the events, lifecycle owner in class we need to implement
// Lifecycleobserver, So timerToast takes lifecycle owner and implements lifecycle observer
// i.e it works according to life cycle owner

class TimerToastClass(application: Application, lifecycleOwner: LifecycleOwner) : LifecycleObserver {
    private var started = false
    private val lifecycle=lifecycleOwner.lifecycle

    init {
        lifecycle.addObserver(this)
    }
    val timerToast=object : CountDownTimer(60000,2000){
        override fun onTick(millisUntilFinished: Long) {
            //Timer should be on only if it is on screen so we implemented lifecycle=lifecycleOwner.lifecycle
            if(lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)){
            Toast.makeText(application,"$millisUntilFinished",Toast.LENGTH_SHORT).show()
        }
        }

        override fun onFinish() {
            Toast.makeText(application,"Finish",Toast.LENGTH_SHORT).show()
        }

    }

//    In order to start lifecycle event we need to use annotation of @OnLifecycleEvent
//    1)which event we need to bind to this event is Lifecycle.Event.ON_START
//    2)For stop Lifecycle.Event.ON_STOP
//    Similarly for pause Lifecycle.Event.ON_PAUSE etc

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start(){
        if(!started){
            started = true
            timerToast.start()
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop(){
        timerToast.cancel()
    }
}