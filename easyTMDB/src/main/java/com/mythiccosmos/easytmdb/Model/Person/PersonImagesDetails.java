package com.mythiccosmos.easytmdb.Model.Person;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class PersonImagesDetails {
    @SerializedName("iso_639_1")
    @Expose
    private String iso6391;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("file_path")
    @Expose
    private String filePath;
    @SerializedName("aspect_ratio")
    @Expose
    private Double aspectRatio;

    public PersonImagesDetails() {
    }

    public PersonImagesDetails(String iso6391, Integer width, Integer height, Integer voteCount, Double voteAverage, String filePath, Double aspectRatio) {
        this.iso6391 = iso6391;
        this.width = width;
        this.height = height;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
        this.filePath = filePath;
        this.aspectRatio = aspectRatio;
    }

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
}
