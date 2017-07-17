package com.example.android.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by android on 7/17/2017.
 */

public interface ApiInterface {


    /// http://api.themoviedb.org/3/movie/top_rated?api_key=c31dce7dae483b752a1adfcb2a791674

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies (@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails (@Path("id") int id , @Query("api_key") String apiKey);


}
