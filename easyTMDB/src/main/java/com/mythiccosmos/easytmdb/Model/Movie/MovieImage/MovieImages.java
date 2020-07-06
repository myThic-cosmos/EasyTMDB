package com.mythiccosmos.easytmdb.Model.Movie.MovieImage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieImages {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("backdrops")
    @Expose
    private List<MovieImagesBackdrops> backdrops;
    @SerializedName("posters")
    @Expose
    private List<MovieImagesPosters> posters;


    public MovieImages() {
    }

    public MovieImages(Integer id, List<MovieImagesBackdrops> backdrops, List<MovieImagesPosters> posters) {
        this.id = id;
        this.backdrops = backdrops;
        this.posters = posters;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MovieImagesBackdrops> getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(List<MovieImagesBackdrops> backdrops) {
        this.backdrops = backdrops;
    }

    public List<MovieImagesPosters> getPosters() {
        return posters;
    }

    public void setPosters(List<MovieImagesPosters> posters) {
        this.posters = posters;
    }
}
