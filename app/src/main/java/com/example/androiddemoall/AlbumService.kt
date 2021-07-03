package com.example.androiddemoall

import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {

    @GET("/posts")
    suspend fun getAlbums():Response<Albums>

}