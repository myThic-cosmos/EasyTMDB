package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Series.SeriesAiringToday.SeriesAiringToday;
import com.mythiccosmos.easytmdb.Model.Series.SeriesDetails.SeriesDetails;
import com.mythiccosmos.easytmdb.Model.Series.SeriesImages.SeriesImages;
import com.mythiccosmos.easytmdb.Model.Series.SeriesLatest.SeriesLatest;
import com.mythiccosmos.easytmdb.Model.Series.SeriesOnTheAir.SeriesOnTheAir;
import com.mythiccosmos.easytmdb.Model.Series.SeriesPopular.SeriesPopular;
import com.mythiccosmos.easytmdb.Model.Series.SeriesSimilar.SeriesSimilar;
import com.mythiccosmos.easytmdb.Model.Series.SeriesTopRated.SeriesTopRated;

import retrofit2.Call;

public class Series {
    /*
     -----SERIES----
     * AIRING TODAY
     * ON THE AIR
     * LATEST
     * POPULAR
     * TOP RATED
     * SIMILAR
     ** SERIES DETAILS
     ** SERIES IMAGES
    * */

    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();
    private final int DEFAULT_PAGE = EasyTMDB.getDefaultPage();


    public Season season(){
        return new Season();
    }


    //SERIES images
    public Call<SeriesImages> images(int seriesId) {
        return images(seriesId, DEFAULT_LANGUAGE);
    }
    public Call<SeriesImages> images(int seriesId, String language) {
        return RetrofitHelper.seriesImages(seriesId, language);
    }



    //SERIES details
    public Call<SeriesDetails> details(int seriesId) {
        return details(seriesId, DEFAULT_LANGUAGE);
    }
    public Call<SeriesDetails> details(int seriesId, String language) {
        return RetrofitHelper.seriesDetails(seriesId, language);
    }



    //SERIES similar
    public Call<SeriesSimilar> similar(int seriesId) {
        return similar(seriesId, DEFAULT_PAGE);
    }

    public Call<SeriesSimilar> similar(int seriesId, int page) {
        return similar(seriesId, DEFAULT_LANGUAGE, page);
    }

    public Call<SeriesSimilar> similar(int seriesId, String language, int page) {
        return RetrofitHelper.seriesSimilar(seriesId, language, page);
    }



    //SERIES top rated
    public Call<SeriesTopRated> topRated() {
        return topRated(DEFAULT_PAGE);
    }

    public Call<SeriesTopRated> topRated(int page) {
        return topRated(DEFAULT_LANGUAGE, page);
    }

    public Call<SeriesTopRated> topRated(String language, int page) {
        return RetrofitHelper.seriesTopRated(language, page);
    }


    //SERIES popular
    public Call<SeriesPopular> popular() {
        return popular(DEFAULT_PAGE);
    }

    public Call<SeriesPopular> popular(int page) {
        return popular(DEFAULT_LANGUAGE, page);
    }

    public Call<SeriesPopular> popular(String language, int page) {
        return RetrofitHelper.seriesPopular(language, page);
    }


    //SERIES latest
    public Call<SeriesLatest> latest() {
        return latest(DEFAULT_LANGUAGE);
    }

    public Call<SeriesLatest> latest(String language) {
        return RetrofitHelper.seriesLatest(language);
    }

    //SERIES on the air
    public Call<SeriesOnTheAir> onTheAir() {
        return onTheAir(DEFAULT_PAGE);
    }

    public Call<SeriesOnTheAir> onTheAir(int page) {
        return onTheAir(DEFAULT_LANGUAGE, page);
    }

    public Call<SeriesOnTheAir> onTheAir(String language, int page) {
        return RetrofitHelper.seriesOnTheAir(language, page);
    }


    //SERIES airing today
    public Call<SeriesAiringToday> airingToday() {
        return airingToday(DEFAULT_PAGE);
    }

    public Call<SeriesAiringToday> airingToday(int page) {
        return airingToday(DEFAULT_LANGUAGE, page);
    }

    public Call<SeriesAiringToday> airingToday(String language, int page) {
        return RetrofitHelper.seriesAiringToday(language, page);
    }
}
