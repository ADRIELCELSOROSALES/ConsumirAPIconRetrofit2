package com.example.consumirapiconretrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend  fun getCharacterByName(@Url url:String): Response<DogsResponse>
}