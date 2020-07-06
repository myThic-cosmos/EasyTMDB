package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Enum.ImageSize;
import com.mythiccosmos.easytmdb.Model.Movie.MovieLatest.MovieLatest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EasyTMDB {
    String TAG = EasyTMDB.class.getSimpleName();

    //DEFAULT VALUE
    private static final String DEFAULT_LANGUAGE = "en-US";
    private static final String POSTER_IMAGE_SIZE = ImageSize.w342.name();
    private static final int DEFAULT_PAGE = 1;

    private static String TMDB_KEY;

    public EasyTMDB(String TMDB_KEY) {
        EasyTMDB.TMDB_KEY = TMDB_KEY;
    }

    public Movie movie() {
        return new Movie();
    }

    public Series series() {
        return new Series();
    }

    public Season season() {
        return new Season();
    }

    public Genres genres() {
        return new Genres();
    }

    public Person person() {
        return new Person();
    }

    public Trending trending() {
        return new Trending();
    }

    public Search search() {
        return new Search();
    }

    public Find find() {
        return new Find();
    }

    public Discover discover() {
        return new Discover();
    }

    public ImageUrl imageUrl() {
        return new ImageUrl();
    }


    //getter
    public static String getDefaultLanguage() {
        return DEFAULT_LANGUAGE;
    }

    public static String getDefaultPosterImageSize() {
        return POSTER_IMAGE_SIZE;
    }

    public static int getDefaultPage() {
        return DEFAULT_PAGE;
    }

    public static String getTMDB_KEY() {
        return TMDB_KEY;
    }


}
