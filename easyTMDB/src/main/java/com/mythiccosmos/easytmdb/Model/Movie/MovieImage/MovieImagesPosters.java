package com.mythiccosmos.easytmdb.Model.Movie.MovieImage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieImagesPosters {
    @SerializedName("aspect_radio")
    @Expose
    private Double aspectRadio;
    @SerializedName("file_path")
    @Expose
    private String filePath;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("iso_639_1")
    @Expose
    private String iso_639_1;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;
    @SerializedName("width")
    @Expose
    private Integer width;

    public MovieImagesPosters() {
    }

    public MovieImagesPosters(Double aspectRadio, String filePath, Integer height, String iso_639_1, Double voteAverage, Integer voteCount, Integer width) {
        this.aspectRadio = aspectRadio;
        this.filePath = filePath;
        this.height = height;
        this.iso_639_1 = iso_639_1;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.width = width;
    }

    public Double getAspectRadio() {
        return aspectRadio;
    }

    public void setAspectRadio(Double aspectRadio) {
        this.aspectRadio = aspectRadio;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getIso_639_1() {
        return iso_639_1;
    }

    public void setIso_639_1(String iso_639_1) {
        this.iso_639_1 = iso_639_1;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
