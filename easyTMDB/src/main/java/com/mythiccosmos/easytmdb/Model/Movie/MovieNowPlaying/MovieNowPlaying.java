package com.mythiccosmos.easytmdb.Model.Movie.MovieNowPlaying;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mythiccosmos.easytmdb.Model.Dates;

import java.util.List;

public class MovieNowPlaying {

    @SerializedName("results")
    @Expose
    private List<MovieNowPlayingResults> results;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    public MovieNowPlaying() {
    }


    public MovieNowPlaying(List<MovieNowPlayingResults> results, Integer page, Integer totalResults, Dates dates, Integer totalPages) {
        this.results = results;
        this.page = page;
        this.totalResults = totalResults;
        this.dates = dates;
        this.totalPages = totalPages;
    }

    public List<MovieNowPlayingResults> getResults() {
        return results;
    }

    public void setResults(List<MovieNowPlayingResults> results) {
        this.results = results;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
