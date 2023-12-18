package com.shreeti.tempotunes

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    //X-RapidAPI-Key: 023736e7ebmsh515436ec1736bafp17e87bjsn240f27ba9c00

    //X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com

    @Headers("X-RapidAPI-Key: 023736e7ebmsh515436ec1736bafp17e87bjsn240f27ba9c00",
            "X-RapidAPI-Host:deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query:String):Call<MyData>
}