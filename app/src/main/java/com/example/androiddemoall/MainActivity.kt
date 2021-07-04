package com.example.androiddemoall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch {
            val networkCallAnswer=doNetworkCall()
            val networkCallAnswer2=doNetworkCall2()
            Log.d(TAG,networkCallAnswer)
            Log.d(TAG,networkCallAnswer2)
        }

      /* //Coroutine
       GlobalScope.launch {
           delay(10000L)
           Log.d(TAG,"Coroutin====${Thread.currentThread().name}")
       }
        Log.d(TAG," main thread${Thread.currentThread().name}")*/
    }

    suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is the answer"
    }
    suspend fun doNetworkCall2():String{
        delay(10000L)
        return "This is the second answer"
    }
}














