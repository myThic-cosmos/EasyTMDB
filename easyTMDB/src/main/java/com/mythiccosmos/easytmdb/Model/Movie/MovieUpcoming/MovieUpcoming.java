package com.mythiccosmos.easytmdb.Model.Movie.MovieUpcoming;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mythiccosmos.easytmdb.Model.Dates;

import java.util.List;

public class MovieUpcoming {
    @SerializedName("results")
    @Expose
    private List<MovieUpcomingResult> results;
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

    public MovieUpcoming() {
    }

    public MovieUpcoming(List<MovieUpcomingResult> results, Integer page, Integer totalResults, Dates dates, Integer totalPages) {
        this.results = results;
        this.page = page;
        this.totalResults = totalResults;
        this.dates = dates;
        this.totalPages = totalPages;
    }

    public List<MovieUpcomingResult> getResults() {
        return results;
    }

    public void setResults(List<MovieUpcomingResult> results) {
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
