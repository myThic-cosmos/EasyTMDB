package com.mythiccosmos.easytmdb.Model.Season;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class EpisodesGuestStars {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("credit_id")
    @Expose
    private String creditId;

    @SerializedName("character")
    @Expose
    private String character;

    @SerializedName("order")
    @Expose
    private Integer order;

    @SerializedName("gender")
    @Expose
    private Integer gender;

    @SerializedName("profile_path")
    @Expose
    private String profilePath;

    public EpisodesGuestStars() {
    }

    public EpisodesGuestStars(Integer id, String name, String creditId, String character, Integer order, Integer gender, String profilePath) {
        this.id = id;
        this.name = name;
        this.creditId = creditId;
        this.character = character;
        this.order = order;
        this.gender = gender;
        this.profilePath = profilePath;
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

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }
}
