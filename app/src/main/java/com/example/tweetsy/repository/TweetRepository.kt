package com.example.tweetsy.repository

import com.example.tweetsy.api.TweetsyAPI
import javax.inject.Inject

class TweetRepository @Inject constructor(private val tweetsyAPI: TweetsyAPI) {

    suspend fun getCategories(){
        val response = tweetsyAPI.getCategories()
    }
}