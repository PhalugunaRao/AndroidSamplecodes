package com.example.androiddemoall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Before runBlocking")
        runBlocking {
            launch(Dispatchers.IO) {
                delay(3000L)
                Log.d(TAG,"finished IO Coroutin 1")
            }
            launch(Dispatchers.IO) {
                delay(3000L)
                Log.d(TAG,"finished IO Coroutin 2")
            }
            Log.d(TAG,"start of runBlocking")
            delay(5000L)
            Log.d(TAG,"End of runBlocking")
        }
        Log.d(TAG,"After of runBlocking")
        /*
        //Coroutine context
        GlobalScope.launch(Dispatchers.IO){
            Log.d(TAG,"Starting coroutin ${Thread.currentThread().name}")
            val answer=doNetworkCall()
            withContext(Dispatchers.Main){
                Log.d(TAG,"Starting coroutin33 ${Thread.currentThread().name}")
                tv_dummy.text=answer
            }

        }*/

        /*
        //Coroutine suspend
        GlobalScope.launch {
            val networkCallAnswer=doNetworkCall()
            val networkCallAnswer2=doNetworkCall2()
            Log.d(TAG,networkCallAnswer)
            Log.d(TAG,networkCallAnswer2)
        }*/

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














