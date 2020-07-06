package com.mythiccosmos.easytmdb.Model.Series.SeriesAiringToday;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeriesAiringToday {
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("results")
    @Expose
    private List<SeriesAiringTodayResult> results;

    public SeriesAiringToday() {
    }

    public SeriesAiringToday(Integer page, Integer totalResults, Integer totalPages, List<SeriesAiringTodayResult> results) {
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
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

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<SeriesAiringTodayResult> getResults() {
        return results;
    }

    public void setResults(List<SeriesAiringTodayResult> results) {
        this.results = results;
    }
}
