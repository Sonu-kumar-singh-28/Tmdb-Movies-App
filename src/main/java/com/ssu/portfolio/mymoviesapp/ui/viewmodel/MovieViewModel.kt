package com.ssu.portfolio.mymoviesapp.ui.viewmodel

import androidx.lifecycle.*
import com.ssu.portfolio.mymoviesapp.data.model.Movie
import com.ssu.portfolio.mymoviesapp.data.repository.MovieRepository
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {

    private val repository = MovieRepository()

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    fun loadMovies() {
        viewModelScope.launch {
            _movies.value = repository.getPopularMovies()
        }
    }
}
