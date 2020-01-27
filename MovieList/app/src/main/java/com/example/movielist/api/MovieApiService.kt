package com.example.movielist.api

import android.provider.Settings.Global.getString
import com.example.movielist.BuildConfig
import com.example.movielist.R
import com.example.movielist.model.Movie
import com.example.movielist.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("discover/movie?api_key=${BuildConfig.API_KEY}&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1")
    fun getMostPopularMovies(@Query("primary_release_year") year: String): Call<MovieResponse>
}