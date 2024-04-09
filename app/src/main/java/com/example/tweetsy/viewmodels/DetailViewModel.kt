package com.example.tweetsy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.models.TweetListItem
import com.example.tweetsy.repository.TweetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class DetailViewModel @Inject constructor(private val tweetRepository: TweetRepository) : ViewModel() {

    val tweets : StateFlow<List<TweetListItem>>
        get() = tweetRepository.tweets

    init {
        viewModelScope.launch {
            tweetRepository.getTweets("motivation")
        }
    }
}