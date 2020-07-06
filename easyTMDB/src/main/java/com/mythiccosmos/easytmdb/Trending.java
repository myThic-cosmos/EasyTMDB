package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Trending.TrendingMovie;
import com.mythiccosmos.easytmdb.Model.Trending.TrendingSeries;

import retrofit2.Call;

public class Trending {

    /*
    -----TRENDING-----
    * MOVIE DAY
    * MOVIE WEEK
    * SERIES DAY
    * SERIES WEEK
    * */

    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();


    public Call<TrendingMovie> movieDay() {
        return RetrofitHelper.trendingMovieDay();
    }

    public Call<TrendingMovie> movieWeek() {
        return RetrofitHelper.trendingMovieWeek();
    }

    public Call<TrendingSeries> seriesDay() {
        return RetrofitHelper.trendingSeriesDay();
    }

    public Call<TrendingSeries> seriesWeek() {
        return RetrofitHelper.trendingSeriesWeek();
    }

}
