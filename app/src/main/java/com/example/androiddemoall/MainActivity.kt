package com.example.androiddemoall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retService:AlbumService=RetrofitInstance
            .getRetrofitInstance().create(AlbumService::class.java)
        val responseLiveData: LiveData<Response<Albums>> = liveData {

        }
    }
}














