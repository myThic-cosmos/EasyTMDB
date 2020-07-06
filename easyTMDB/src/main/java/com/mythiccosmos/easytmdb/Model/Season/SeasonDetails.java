package com.mythiccosmos.easytmdb.Model.Season;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeasonDetails {
    /*
     -----SERIES----
     * SEASON DETAILS
     * SEASON IMAGE
    * */

    @SerializedName("_id")
    @Expose
    private Integer _id;

    @SerializedName("air_date")
    @Expose
    private String airDate;

    @SerializedName("episodes")
    @Expose
    private List<EpisodeDetails> episodes;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("overview")
    @Expose
    private String overview;

    @SerializedName("id")
    @Expose
    private Integer seasonId;

    @SerializedName("poster_path")
    @Expose
    private String posterPath;

    @SerializedName("season_number")
    @Expose
    private Integer seasonNumber;

    public SeasonDetails() {
    }

    public SeasonDetails(Integer _id, String airDate, List<EpisodeDetails> episodes, String name, String overview, Integer seasonId, String posterPath, Integer seasonNumber) {
        this._id = _id;
        this.airDate = airDate;
        this.episodes = episodes;
        this.name = name;
        this.overview = overview;
        this.seasonId = seasonId;
        this.posterPath = posterPath;
        this.seasonNumber = seasonNumber;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public List<EpisodeDetails> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeDetails> episodes) {
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
}
