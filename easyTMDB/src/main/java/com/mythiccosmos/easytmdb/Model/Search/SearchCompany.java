package com.mythiccosmos.easytmdb.Model.Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mythiccosmos.easytmdb.Model.ProductionCompany;

import java.util.List;

public class SearchCompany {
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<ProductionCompany> results;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    public SearchCompany() {
    }

    public SearchCompany(Integer page, List<ProductionCompany> results, Integer totalPages, Integer totalResults) {
        this.page = page;
        this.results = results;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<ProductionCompany> getResults() {
        return results;
    }

    public void setResults(List<ProductionCompany> results) {
        this.results = results;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
}
