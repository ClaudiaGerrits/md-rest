package com.example.numberskotlin

import com.example.numberskotlin.api.NumbersApi
import com.example.numberskotlin.api.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}
