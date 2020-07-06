package com.mythiccosmos.easytmdb.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GenresDetails {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    public GenresDetails() {
    }

    public GenresDetails(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
