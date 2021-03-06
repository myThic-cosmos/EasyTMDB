package com.mythiccosmos.easytmdb.Model.Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mythiccosmos.easytmdb.Model.KeywordDetails;

import java.util.List;

public class SearchKeyword {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<KeywordDetails> results;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    public SearchKeyword() {
    }

    public SearchKeyword(Integer page, List<KeywordDetails> results, Integer totalPages, Integer totalResults) {
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

    public List<KeywordDetails> getResults() {
        return results;
    }

    public void setResults(List<KeywordDetails> results) {
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
