package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Person.PersonDetails;
import com.mythiccosmos.easytmdb.Model.Person.PersonImages;

import retrofit2.Call;

public class Person {
    /*
      -----PEOPLE----
     * PERSON DETAILS
     * PERSON IMAGES
    * */
    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();

    //EPISODE details
    public Call<PersonDetails> details(int personId) {
        return RetrofitHelper.personDetails(personId, DEFAULT_LANGUAGE);
    }

    public Call<PersonImages> images(int personId) {
        return RetrofitHelper.personImages(personId);
    }
}
