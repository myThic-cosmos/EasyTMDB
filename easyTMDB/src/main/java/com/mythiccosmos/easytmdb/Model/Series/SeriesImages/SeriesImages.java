package com.mythiccosmos.easytmdb.Model.Series.SeriesImages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeriesImages {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("backdrops")
    @Expose
    private List<SeriesImagesBackdrops> backdrops;
    @SerializedName("posters")
    @Expose
    private List<SeriesImagesPosters> posters;


    public SeriesImages() {
    }

    public SeriesImages(Integer id, List<SeriesImagesBackdrops> backdrops, List<SeriesImagesPosters> posters) {
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

    public List<SeriesImagesBackdrops> getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(List<SeriesImagesBackdrops> backdrops) {
        this.backdrops = backdrops;
    }

    public List<SeriesImagesPosters> getPosters() {
        return posters;
    }

    public void setPosters(List<SeriesImagesPosters> posters) {
        this.posters = posters;
    }
}
