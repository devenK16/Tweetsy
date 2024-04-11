package com.example.tweetsy.api

import com.example.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {
    @GET("/v3/b/66127594ad19ca34f856518b?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String ) : Response<List<TweetListItem>>

    @GET("/v3/b/66127594ad19ca34f856518b?meta=false&X-JSON-Path=tweets..category")
//    @Headers("X-JSON-Path : tweets..category")
    suspend fun getCategories() : Response<List<String>>
}