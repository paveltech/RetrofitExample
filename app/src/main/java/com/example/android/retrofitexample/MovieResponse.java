package com.example.android.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by android on 7/17/2017.
 */

public class MovieResponse {

    @SerializedName("page")
    public int page;

    @SerializedName("results")
    public ArrayList<MovieList> movieListArrayList;

    @SerializedName("total_results")
    public int totalResult;

    @SerializedName("total_pages")
    public int totalPage;


    public ArrayList<MovieList> getMovieListArrayList() {
        return movieListArrayList;
    }


    public int getPage() {
        return page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setMovieListArrayList(ArrayList<MovieList> movieListArrayList) {
        this.movieListArrayList = movieListArrayList;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }
}
