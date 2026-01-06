package com.ssu.portfolio.mymoviesapp.data.repository

import com.ssu.portfolio.mymoviesapp.data.api.RetrofitInstance
import com.ssu.portfolio.mymoviesapp.data.model.Movie
import com.ssu.portfolio.mymoviesapp.utils.Constants

class MovieRepository {

    suspend fun getPopularMovies(): List<Movie> {
        return RetrofitInstance.api
            .getPopularMovies(Constants.API_KEY)
            .results
    }
}
