package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.GenresDetails;

import retrofit2.Call;

public class Genres {
    /*
    -----GENRES-----
    * MOVIE
    * SERIES
    * */

    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();


    public Call<GenresDetails> movie() {
        return RetrofitHelper.genresMovie(DEFAULT_LANGUAGE);
    }

    public Call<GenresDetails> series() {
        return RetrofitHelper.genresSeries(DEFAULT_LANGUAGE);
    }
}
