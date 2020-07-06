package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Discover.DiscoverDetails;

import java.util.Map;

import retrofit2.Call;

public class Discover {
    /**
     * Discover also called Advanced search
     *
     * here a demo of search
     *
     * Map<String, Object> map = new HashMap<>();
     * map.put(DiscoverMovieMap.KEY.INCLUDE_ADULT.value, false);
     * map.put(DiscoverMovieMap.KEY.WITH_RUNTIME_GTE.value, 60);
     * map.put(DiscoverMovieMap.KEY.SORT_BY.value, DiscoverMovieMap.SHORT_BY.ORIGINAL_TITLE.ASC);
     *
     * EasyTMDB tmdb = new EasyTMDB(".....");
     * tmdb.discover().movie(map);
     *
     *
     * NOTE: see the value type from official site
     *
     *
     * @param map
     * @return
     */

    public Call<DiscoverDetails> movie(Map<String, Object> map) {
        return RetrofitHelper.discoverMovie(map);
    }

    public Call<DiscoverDetails> series(Map<String, Object> map) {
        return RetrofitHelper.discoverMovie(map);
    }
}
