package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Season.EpisodeDetails;

import retrofit2.Call;

public class Episode {

    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();


    //EPISODE details
    public Call<EpisodeDetails> details(int seriesId, int seasonNumber, int episodeNumber) {
        return details(seriesId, seasonNumber, episodeNumber, DEFAULT_LANGUAGE);
    }

    public Call<EpisodeDetails> details(int seriesId, int seasonNumber, int episodeNumber, String language) {
        return RetrofitHelper.episodeDetails(seriesId, seasonNumber, episodeNumber, language);
    }
}
