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
           delay(10000L)
           Log.d(TAG,"Coroutin====${Thread.currentThread().name}")
       }

        Log.d(TAG," main thread${Thread.currentThread().name}")
    }
}














