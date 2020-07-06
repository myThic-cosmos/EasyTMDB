package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Movie.MovieCredits.MovieCredits;
import com.mythiccosmos.easytmdb.Model.Movie.MovieDetails.MovieDetails;
import com.mythiccosmos.easytmdb.Model.Movie.MovieImage.MovieImages;
import com.mythiccosmos.easytmdb.Model.Movie.MovieLatest.MovieLatest;
import com.mythiccosmos.easytmdb.Model.Movie.MovieNowPlaying.MovieNowPlaying;
import com.mythiccosmos.easytmdb.Model.Movie.MoviePopular.MoviePopular;
import com.mythiccosmos.easytmdb.Model.Movie.MovieSimilar.MovieSimilar;
import com.mythiccosmos.easytmdb.Model.Movie.MovieTopRated.MovieTopRated;
import com.mythiccosmos.easytmdb.Model.Movie.MovieUpcoming.MovieUpcoming;

import retrofit2.Call;

public class Movie {
    /*
     -----MOVIE-----
     * NOW PLAYING
     * LATEST
     * UPCOMING
     * POPULAR
     * TOP RATED
     * SIMILAR
     ** MOVIE DETAILS
     ** MOVIE_CREDITS_CAST
     ** MOVIE IMAGES
    * */

    private final String DEFAULT_LANGUAGE = EasyTMDB.getDefaultLanguage();
    private final String POSTER_IMAGE_SIZE = EasyTMDB.getDefaultPosterImageSize();
    private final int DEFAULT_PAGE = EasyTMDB.getDefaultPage();

    //MOVIE images
    public Call<MovieImages> images(int movieId) {
        return RetrofitHelper.movieImages(movieId, DEFAULT_LANGUAGE);
    }


    //MOVIE credits
    public Call<MovieCredits> credits(int movieId) {
        return RetrofitHelper.movieCredits(movieId);
    }


    //MOVIE details
    public Call<MovieDetails> details(int movieId) {
        return details(movieId, DEFAULT_LANGUAGE);
    }

    public Call<MovieDetails> details(int movieId, String language) {
        return RetrofitHelper.movieDetails(movieId, language);
    }

    //MOVIE similar
    public Call<MovieSimilar> similar(int movieId) {
        return similar(movieId, DEFAULT_PAGE);
    }

    public Call<MovieSimilar> similar(int movieId, int page) {
        return similar(movieId, DEFAULT_LANGUAGE, page);
    }

    public Call<MovieSimilar> similar(int movieId, String language, int page) {
        return RetrofitHelper.movieSimilar(movieId, language, page);
    }

    //MOVIE top rated
    public Call<MovieTopRated> topRated() {
        return topRated(DEFAULT_PAGE);
    }

    public Call<MovieTopRated> topRated(int page) {
        return topRated(DEFAULT_LANGUAGE, page);
    }

    public Call<MovieTopRated> topRated(String language, int page) {
        return RetrofitHelper.movieTopRated(language, page);
    }


    //MOVIE popular
    public Call<MoviePopular> popular() {
        return popular(DEFAULT_PAGE);
    }


    public Call<MoviePopular> popular(int page) {
        return popular(DEFAULT_LANGUAGE, page);
    }

    public Call<MoviePopular> popular(String language, int page) {
        return RetrofitHelper.moviePopular(language, page);
    }


    //MOVIE upcoming
    public Call<MovieUpcoming> upcoming() {
        return upcoming(DEFAULT_PAGE);
    }

    public Call<MovieUpcoming> upcoming(int page) {
        return upcoming(DEFAULT_LANGUAGE, page);
    }

    public Call<MovieUpcoming> upcoming(String language, int page) {
        return RetrofitHelper.movieUpcoming(language, page);
    }


    //MOVIE latest
    public Call<MovieLatest> latest() {
        return latest(DEFAULT_LANGUAGE);
    }

    public Call<MovieLatest> latest(String language) {
        return RetrofitHelper.movieLatest(language);
    }


    //MOVIE now playing
    public Call<MovieNowPlaying> nowPlaying() {
        return nowPlaying(DEFAULT_PAGE);
    }

    public Call<MovieNowPlaying> nowPlaying(int page) {
        return nowPlaying(DEFAULT_LANGUAGE, page);
    }

    public Call<MovieNowPlaying> nowPlaying(String language, int page) {
        return RetrofitHelper.movieNowPlaying(language, page);
    }


}
