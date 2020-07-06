package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Season.SeasonDetails;

import retrofit2.Call;

public class Season {

    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();
    private final int DEFAULT_PAGE = EasyTMDB.getDefaultPage();


    public Episode episode(){
        return new Episode();
    }


    //SERIES details
    public Call<SeasonDetails> details(int seriesId, int seasonNumber) {
        return details(seriesId, seasonNumber, DEFAULT_LANGUAGE);
    }

    public Call<SeasonDetails> details(int seriesId, int seasonNumber, String language) {
        return RetrofitHelper.seasonDetails(seriesId, seasonNumber, language);
    }
}
