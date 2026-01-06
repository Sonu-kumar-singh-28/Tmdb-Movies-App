package com.ssu.portfolio.mymoviesapp.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ssu.portfolio.mymoviesapp.R
import com.ssu.portfolio.mymoviesapp.ui.adapter.MovieAdapter
import com.ssu.portfolio.mymoviesapp.ui.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MovieViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel = ViewModelProvider(this)[MovieViewModel::class.java]

        viewModel.loadMovies()

        viewModel.movies.observe(this) { movies ->
            recyclerView.adapter = MovieAdapter(movies)
        }
    }
}