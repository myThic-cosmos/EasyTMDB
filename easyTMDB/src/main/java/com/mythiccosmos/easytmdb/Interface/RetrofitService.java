package com.mythiccosmos.easytmdb.Interface;


import com.mythiccosmos.easytmdb.Model.Discover.DiscoverDetails;
import com.mythiccosmos.easytmdb.Model.Find.FindDetails;
import com.mythiccosmos.easytmdb.Model.GenresDetails;
import com.mythiccosmos.easytmdb.Model.Movie.MovieCredits.MovieCredits;
import com.mythiccosmos.easytmdb.Model.Movie.MovieDetails.MovieDetails;
import com.mythiccosmos.easytmdb.Model.Movie.MovieImage.MovieImages;
import com.mythiccosmos.easytmdb.Model.Movie.MovieLatest.MovieLatest;
import com.mythiccosmos.easytmdb.Model.Movie.MovieNowPlaying.MovieNowPlaying;
import com.mythiccosmos.easytmdb.Model.Movie.MoviePopular.MoviePopular;
import com.mythiccosmos.easytmdb.Model.Movie.MovieSimilar.MovieSimilar;
import com.mythiccosmos.easytmdb.Model.Movie.MovieTopRated.MovieTopRated;
import com.mythiccosmos.easytmdb.Model.Movie.MovieUpcoming.MovieUpcoming;
import com.mythiccosmos.easytmdb.Model.Person.PersonDetails;
import com.mythiccosmos.easytmdb.Model.Person.PersonImages;
import com.mythiccosmos.easytmdb.Model.Search.Movie.SearchMovie;
import com.mythiccosmos.easytmdb.Model.Search.SearchCompany;
import com.mythiccosmos.easytmdb.Model.Search.SearchKeyword;
import com.mythiccosmos.easytmdb.Model.Search.Person.SearchPerson;
import com.mythiccosmos.easytmdb.Model.Search.Series.SearchSeries;
import com.mythiccosmos.easytmdb.Model.Season.EpisodeDetails;
import com.mythiccosmos.easytmdb.Model.Season.SeasonDetails;
import com.mythiccosmos.easytmdb.Model.Series.SeriesAiringToday.SeriesAiringToday;
import com.mythiccosmos.easytmdb.Model.Series.SeriesDetails.SeriesDetails;
import com.mythiccosmos.easytmdb.Model.Series.SeriesImages.SeriesImages;
import com.mythiccosmos.easytmdb.Model.Series.SeriesLatest.SeriesLatest;
import com.mythiccosmos.easytmdb.Model.Series.SeriesOnTheAir.SeriesOnTheAir;
import com.mythiccosmos.easytmdb.Model.Series.SeriesPopular.SeriesPopular;
import com.mythiccosmos.easytmdb.Model.Series.SeriesSimilar.SeriesSimilar;
import com.mythiccosmos.easytmdb.Model.Series.SeriesTopRated.SeriesTopRated;
import com.mythiccosmos.easytmdb.Model.Trending.TrendingMovie;
import com.mythiccosmos.easytmdb.Model.Trending.TrendingSeries;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.DISCOVER_MOVIE;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.DISCOVER_SERIES;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.EPISODE_DETAILS;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.FIND;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.GENRES_MOVIE;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.GENRES_SERIES;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_CREDITS;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_DETAILS;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_IMAGES;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_LATEST;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_NOW_PLAYING;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_POPULAR;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_SIMILAR;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_TOP_RATED;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.MOVIE_UPCOMING;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.PERSON_DETAILS;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.PERSON_IMAGES;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SEARCH_COMPANY;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SEARCH_KEYWORD;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SEARCH_MOVIE;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SEARCH_PERSON;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SEARCH_SERIES;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SEASON_DETAILS;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_AIRING_TODAY;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_DETAILS;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_IMAGES;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_LATEST;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_ON_THE_AIR;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_POPULAR;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_SIMILAR;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.SERIES_TOP_RATED;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.TRENDING_MOVIE_DAY;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.TRENDING_MOVIE_WEEK;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.TRENDING_TV_DAY;
import static com.mythiccosmos.easytmdb.Helper.RetrofitHelper.TRENDING_TV_WEEK;

public interface RetrofitService {

    /*








    -----SEARCH-----
    * SERIES
    * MOVIE
    * PERSON
    * KEYWORD
    * COMPANY


    * */


    /**
     * MOVIE
     */
    @GET(MOVIE_NOW_PLAYING)
    Call<MovieNowPlaying> movieNowPlaying(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(MOVIE_LATEST)
    Call<MovieLatest> movieLatest(
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(MOVIE_UPCOMING)
    Call<MovieUpcoming> movieUpcoming(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );


    @GET(MOVIE_POPULAR)
    Call<MoviePopular> moviePopular(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(MOVIE_TOP_RATED)
    Call<MovieTopRated> movieTopRated(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(MOVIE_SIMILAR)
    Call<MovieSimilar> movieSimilar(
            @Path("movie_id") int movie_id,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(MOVIE_DETAILS)
    Call<MovieDetails> movieDetails(
            @Path("movie_id") int movie_id,
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(MOVIE_CREDITS)
    Call<MovieCredits> movieCredits(
            @Path("movie_id") int movie_id,
            @Query("api_key") String api_key
    );

    @GET(MOVIE_IMAGES)
    Call<MovieImages> movieImages(
            @Path("movie_id") int movie_id,
            @Query("api_key") String api_key,
            @Query("language") String language
    );


    /**
     * SERIES
     */
    @GET(SERIES_AIRING_TODAY)
    Call<SeriesAiringToday> seriesAiringToday(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );


    @GET(SERIES_ON_THE_AIR)
    Call<SeriesOnTheAir> seriesOnTheAir(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(SERIES_LATEST)
    Call<SeriesLatest> seriesLatest(
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(SERIES_POPULAR)
    Call<SeriesPopular> seriesPopular(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );


    @GET(SERIES_TOP_RATED)
    Call<SeriesTopRated> seriesTopRated(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(SERIES_SIMILAR)
    Call<SeriesSimilar> seriesSimilar(
            @Path("tv_id") int tv_id,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET(SERIES_DETAILS)
    Call<SeriesDetails> seriesDetails(
            @Path("tv_id") int tv_id,
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(SERIES_IMAGES)
    Call<SeriesImages> seriesImages(
            @Path("tv_id") int tv_id,
            @Query("api_key") String api_key,
            @Query("language") String language
    );


    @GET(SEASON_DETAILS)
    Call<SeasonDetails> seasonDetails(
            @Path("tv_id") int tv_id,
            @Path("season_number") int season_number,
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(EPISODE_DETAILS)
    Call<EpisodeDetails> episodeDetails(
            @Path("tv_id") int tv_id,
            @Path("season_number") int season_number,
            @Path("episode_number") int episode_number,
            @Query("api_key") String api_key,
            @Query("language") String language
    );



    /**
     * GENRES
     */
    @GET(GENRES_MOVIE)
    Call<GenresDetails> genresMovie(
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(GENRES_SERIES)
    Call<GenresDetails> genresSeries(
            @Query("api_key") String api_key,
            @Query("language") String language
    );


    /**
     * PEOPLE
     */
    @GET(PERSON_DETAILS)
    Call<PersonDetails> personDetails(
            @Path("person_id") int person_id,
            @Query("api_key") String api_key,
            @Query("language") String language
    );

    @GET(PERSON_IMAGES)
    Call<PersonImages> personImages(
            @Path("person_id") int person_id,
            @Query("api_key") String api_key
    );


    /**
     * TRENDING
     */
    @GET(TRENDING_MOVIE_DAY)
    Call<TrendingMovie> trendingMovieDay(
            @Query("api_key") String api_key
    );

    @GET(TRENDING_MOVIE_WEEK)
    Call<TrendingMovie> trendingMovieWeek(
            @Query("api_key") String api_key
    );

    @GET(TRENDING_TV_DAY)
    Call<TrendingSeries> trendingSeriesDay(
            @Query("api_key") String api_key
    );

    @GET(TRENDING_TV_WEEK)
    Call<TrendingSeries> trendingSeriesWeek(
            @Query("api_key") String api_key
    );

    /**
     * SEARCH
     */
    @GET(SEARCH_MOVIE)
    Call<SearchMovie> searchMovie(
            @QueryMap Map<String, Object> options
    );

    @GET(SEARCH_SERIES)
    Call<SearchSeries> searchSeries(
            @QueryMap Map<String, Object> options
    );

    @GET(SEARCH_PERSON)
    Call<SearchPerson> searchPerson(
            @QueryMap Map<String, Object> options
    );

    @GET(SEARCH_COMPANY)
    Call<SearchCompany> searchCompany(
            @Query("api_key") String api_key,
            @Query("query") String query,
            @Query("page") int page
    );

    @GET(SEARCH_KEYWORD)
    Call<SearchKeyword> searchKeyword(
            @Query("api_key") String api_key,
            @Query("query") String query,
            @Query("page") int page
    );


    /**
     * FIND
     */
    @GET(FIND)
    Call<FindDetails> find(
            @Path("external_id") String external_id,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("external_source") String external_source
    );



    /**
     * DISCOVER OR ADVANCED SEARCH
     */
    @GET(DISCOVER_MOVIE)
    Call<DiscoverDetails> discoverMovie(
            @QueryMap Map<String, Object> options
    );

    @GET(DISCOVER_SERIES)
    Call<DiscoverDetails> discoverSeries(
            @QueryMap Map<String, Object> options
    );



    /*@GET(POPULAR_MOVIE)
    Call<MovieResponse> popularMovie(
            @Query("api_key") String api_key,
            @Query("page") int page
    );

    @GET(MOVIE_DETAILS)
    Call<MovieDetails> movieDetails(
            @Path("movie_id") long movie_id,
            @Query("api_key") String api_key
    );

    @GET(MOVIE_CREDITS_CAST)
    Call<Credits> movieCreditsCast(
            @Path("movie_id") long movie_id,
            @Query("api_key") String api_key
    );

    @GET(MOVIE_IMAGES)
    Call<MovieImages> movieImages(
            @Path("movie_id") long movie_id,
            @Query("api_key") String api_key
    );


    *//**
     * PERSON
     *//*
    @GET(PERSON_DETAILS)
    Call<PersonDetails> personDetails(
            @Path("person_id") long person_id,
            @Query("api_key") String api_key
    );

    @GET(PERSON_IMAGES)
    Call<PersonImages> personImages(
            @Path("person_id") long person_id,
            @Query("api_key") String api_key
    );


    *//**
     * TRENDING
     *//*
    @GET(TRENDING_MOVIE_DAY)
    Call<TrendingMovie> trendingMovieDay(@Query("api_key") String api_key);

    @GET(TRENDING_MOVIE_WEEK)
    Call<TrendingMovie> trendingMovieWeek(@Query("api_key") String api_key);

    @GET(TRENDING_TV_DAY)
    Call<TrendingTv> trendingTvDay(@Query("api_key") String api_key);

    @GET(TRENDING_TV_WEEK)
    Call<TrendingTv> trendingTvWeek(@Query("api_key") String api_key);


    *//**
     * SERIES
     *//*
    @GET(POPULAR_SERIES)
    Call<SeriesResponse> popularSeries(
            @Query("api_key") String api_key,
            @Query("page") int page
    );

    @GET(SERIES_DETAILS)
    Call<SeriesDetails> seriesDetails(
            @Path("tv_id") long tv_id,
            @Query("api_key") String api_key
    );

    @GET(SEASON_DETAILS)
    Call<SeasonDetails> seasonDetails(
            @Path("tv_id") long tv_id,
            @Path("season_number") int season_number,
            @Query("api_key") String api_key
    );

    @GET(SEARCH_MOVIE)
    Call<SearchMovie> searchMovie(
            @Query("api_key") String api_key,
            @Query("query") String query,
            @Query("include_adult") boolean include_adult
    );

    @GET(SEARCH_SERIES)
    Call<SearchSeries> searchSeries(
            @Query("api_key") String api_key,
            @Query("query") String query,
            @Query("include_adult") boolean include_adult
    );

    @GET(SEARCH_PERSON)
    Call<SearchPerson> searchPerson(
            @Query("api_key") String api_key,
            @Query("query") String query,
            @Query("include_adult") boolean include_adult
    );*/


}
