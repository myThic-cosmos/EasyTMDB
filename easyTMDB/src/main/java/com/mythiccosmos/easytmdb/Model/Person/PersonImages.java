package com.mythiccosmos.easytmdb.Model.Person;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PersonImages {
    @SerializedName("profiles")
    @Expose
    private List<PersonImagesDetails> profiles;
    @SerializedName("id")
    @Expose
    private Integer id;

    public PersonImages() {
    }

    public PersonImages(List<PersonImagesDetails> profiles, Integer id) {
        this.profiles = profiles;
        this.id = id;
    }

    public List<PersonImagesDetails> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<PersonImagesDetails> profiles) {
        this.profiles = profiles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
