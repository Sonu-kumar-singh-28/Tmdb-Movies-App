package com.ssu.portfolio.mymoviesapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ssu.portfolio.mymoviesapp.R
import com.ssu.portfolio.mymoviesapp.data.model.Movie
import com.ssu.portfolio.mymoviesapp.utils.Constants

class MovieAdapter(private val movies: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val poster: ImageView = view.findViewById(R.id.imgPoster)
        val title: TextView = view.findViewById(R.id.txtTitle)
        val rating: TextView = view.findViewById(R.id.txtRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.title.text = movie.title
        holder.rating.text = "Rating: ${movie.vote_average}"

        Glide.with(holder.itemView.context)
            .load(Constants.IMAGE_BASE_URL + movie.poster_path)
            .into(holder.poster)
    }

    override fun getItemCount() = movies.size
}
