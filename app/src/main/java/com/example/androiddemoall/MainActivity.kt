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

       /*
       //job create and cancel
       val job = GlobalScope.launch(Dispatchers.Default) {
           repeat(5){
               Log.d(TAG,"Coroutine is still working....")
               delay(1000L)
           }
        }

       val job= GlobalScope.launch(Dispatchers.Default) {
           Log.d(TAG,"Start long running calculation....")
           for (i in 30..40){
               Log.d(TAG,"Result for i = $i: ${fib(i)}")
           }
        }

        runBlocking {
            job.join()
            Log.d(TAG,"Main Thread is continuing...")
        }*/

      /*
        //runblocking
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
        Log.d(TAG,"After of runBlocking")*/
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














