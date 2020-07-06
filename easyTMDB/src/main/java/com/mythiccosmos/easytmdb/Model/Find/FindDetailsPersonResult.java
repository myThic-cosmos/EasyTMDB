package com.mythiccosmos.easytmdb.Model.Find;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FindDetailsPersonResult {

    @SerializedName("known_for_department")
    @Expose
    private String knownForDepartment;
    @SerializedName("adult")
    @Expose
    private Boolean adult;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("profile_path")
    @Expose
    private String profilePath;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("known_for")
    @Expose
    private List<FindDetailsMovieResult> knownFor;
    @SerializedName("gender")
    @Expose
    private Integer gender;
    @SerializedName("popularity")
    @Expose
    private Double popularity;

    public FindDetailsPersonResult() {
    }

    public FindDetailsPersonResult(String knownForDepartment, Boolean adult, Integer id, String profilePath, String name, List<FindDetailsMovieResult> knownFor, Integer gender, Double popularity) {
        this.knownForDepartment = knownForDepartment;
        this.adult = adult;
        this.id = id;
        this.profilePath = profilePath;
        this.name = name;
        this.knownFor = knownFor;
        this.gender = gender;
        this.popularity = popularity;
    }

    public String getKnownForDepartment() {
        return knownForDepartment;
    }

    public void setKnownForDepartment(String knownForDepartment) {
        this.knownForDepartment = knownForDepartment;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FindDetailsMovieResult> getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(List<FindDetailsMovieResult> knownFor) {
        this.knownFor = knownFor;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }
}
