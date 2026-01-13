My Movies App Readme....

MyMoviesApp is a clean and scalable Android application built using Kotlin and the MVVM (Model–View–ViewModel) architecture. The app consumes data from the TMDB (The Movie Database) API and demonstrates modern Android development practices such as separation of concerns, lifecycle-aware components, and asynchronous network handling.

This project is designed both for learning purposes and as a strong portfolio-ready Android application.

📱 Features

Displays a list of popular movies from TMDB

Infinite scrolling with pagination

Movie poster, title, and rating display

Movie detail screen on item click

Clean MVVM-based architecture

Efficient image loading

🏗 Architecture

The project follows the MVVM architecture, which improves code readability, testability, and maintainability.

Architecture Flow:

UI (Activity / XML)
   ↓ observes
ViewModel
   ↓ calls
Repository
   ↓ fetches data
Retrofit API (TMDB)
🧰 Tech Stack

Language: Kotlin

Architecture: MVVM

UI: XML, RecyclerView

Networking: Retrofit

Asynchronous Programming: Kotlin Coroutines

State Management: LiveData & ViewModel

Image Loading: Glide

📂 Project Structure
com.ssu.portfolio.mymoviesapp
│
├── data
│   ├── api            # Retrofit service & instance
│   ├── model          # Data models
│   └── repository     # Data handling layer
│
├── ui
│   ├── adapter        # RecyclerView adapters
│   ├── view           # Activities
│   └── viewmodel      # ViewModels
│
└── utils
    └── Constants.kt   # App-wide constants
🔑 API Key Configuration

This app uses the TMDB API. To run the project:

Create an account on [themoviedb.org]

Generate an API key

Add the key in the following file:

// utils/Constants.kt
const val API_KEY = "YOUR_TMDB_API_KEY"

⚠️ Note: For learning purposes, the API key is stored in code. In production apps, it should be secured using environment variables or local.properties.

▶️ How to Run the Project

Clone this repository

Open the project in Android Studio

Add your TMDB API key in Constants.kt

Sync Gradle files

Run the app on an emulator or physical device

🔄 Pagination Logic

TMDB APIs return movies in paginated form. The app implements infinite scrolling by:

Tracking the current page

Fetching the next page when the user scrolls to the bottom

Appending new data to the existing list

🚀 Future Enhancements

Movie search functionality

Detailed movie information using movie ID

Offline caching with Room Database

Dependency injection using Hilt

Migration to Jetpack Compose

👨‍💻 Author

Sonu Singh
Android Developer | Kotlin | MVVM

📌 Notes

This project focuses on clean architecture and practical Android development patterns. It can be extended easily to include advanced features and production-level improvements.
