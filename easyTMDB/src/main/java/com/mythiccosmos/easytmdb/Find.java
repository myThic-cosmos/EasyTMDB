package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Enum.ExternalSource;
import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Find.FindDetails;

import retrofit2.Call;

import static com.mythiccosmos.easytmdb.EasyTMDB.getDefaultLanguage;

public class Find {

    public Call<FindDetails> imdb(String imdbId) {
        return imdb(imdbId, getDefaultLanguage());
    }


    public Call<FindDetails> imdb(String imdbId, String language) {
        return RetrofitHelper.find(imdbId, language, ExternalSource.imdb_id.name());
    }
}
