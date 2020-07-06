package com.mythiccosmos.easytmdb.Model.Series.SeriesTopRated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeriesTopRated {
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
    private List<SeriesTopRatedResult> results;

    public SeriesTopRated() {
    }

    public SeriesTopRated(Integer page, Integer totalResults, Integer totalPages, List<SeriesTopRatedResult> results) {
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

    public List<SeriesTopRatedResult> getResults() {
        return results;
    }

    public void setResults(List<SeriesTopRatedResult> results) {
        this.results = results;
    }
}
