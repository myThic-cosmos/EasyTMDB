package com.mythiccosmos.easytmdb.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KeywordDetails {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;

    public KeywordDetails() {
    }

    public KeywordDetails(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
