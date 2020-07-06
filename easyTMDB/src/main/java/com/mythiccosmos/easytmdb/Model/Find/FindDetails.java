package com.mythiccosmos.easytmdb.Model.Find;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FindDetails {
    @SerializedName("movie_results")
    @Expose
    private List<FindDetailsMovieResult> movieResults;
    @SerializedName("person_results")
    @Expose
    private List<FindDetailsPersonResult> personResults;
    @SerializedName("tv_results")
    @Expose
    private List<FindDetailsSeriesResult> tvResults;
    @SerializedName("tv_episode_results")
    @Expose
    private List<FindDetailsEpisodeResults> tvEpisodeResults;
    @SerializedName("tv_season_results")
    @Expose
    private List<Object> tvSeasonResults;

    public FindDetails() {
    }

    public FindDetails(List<FindDetailsMovieResult> movieResults, List<FindDetailsPersonResult> personResults, List<FindDetailsSeriesResult> tvResults, List<FindDetailsEpisodeResults> tvEpisodeResults, List<Object> tvSeasonResults) {
        this.movieResults = movieResults;
        this.personResults = personResults;
        this.tvResults = tvResults;
        this.tvEpisodeResults = tvEpisodeResults;
        this.tvSeasonResults = tvSeasonResults;
    }

    public List<FindDetailsMovieResult> getMovieResults() {
        return movieResults;
    }

    public void setMovieResults(List<FindDetailsMovieResult> movieResults) {
        this.movieResults = movieResults;
    }

    public List<FindDetailsPersonResult> getPersonResults() {
        return personResults;
    }

    public void setPersonResults(List<FindDetailsPersonResult> personResults) {
        this.personResults = personResults;
    }

    public List<FindDetailsSeriesResult> getTvResults() {
        return tvResults;
    }

    public void setTvResults(List<FindDetailsSeriesResult> tvResults) {
        this.tvResults = tvResults;
    }

    public List<FindDetailsEpisodeResults> getTvEpisodeResults() {
        return tvEpisodeResults;
    }

    public void setTvEpisodeResults(List<FindDetailsEpisodeResults> tvEpisodeResults) {
        this.tvEpisodeResults = tvEpisodeResults;
    }

    public List<Object> getTvSeasonResults() {
        return tvSeasonResults;
    }

    public void setTvSeasonResults(List<Object> tvSeasonResults) {
        this.tvSeasonResults = tvSeasonResults;
    }
}
