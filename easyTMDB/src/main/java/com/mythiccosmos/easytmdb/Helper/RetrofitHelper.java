package com.mythiccosmos.easytmdb.Helper;

import com.mythiccosmos.easytmdb.Client.RetrofitClient;
import com.mythiccosmos.easytmdb.Interface.RetrofitService;
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
import com.mythiccosmos.easytmdb.Model.Series.SeriesAiringToday.SeriesAiringToday;
import com.mythiccosmos.easytmdb.Model.Series.SeriesDetails.SeriesDetails;
import com.mythiccosmos.easytmdb.Model.Series.SeriesImages.SeriesImages;
import com.mythiccosmos.easytmdb.Model.Series.SeriesLatest.SeriesLatest;
import com.mythiccosmos.easytmdb.Model.Series.SeriesOnTheAir.SeriesOnTheAir;
import com.mythiccosmos.easytmdb.Model.Series.SeriesPopular.SeriesPopular;
import com.mythiccosmos.easytmdb.Model.Season.SeasonDetails;
import com.mythiccosmos.easytmdb.Model.Series.SeriesSimilar.SeriesSimilar;
import com.mythiccosmos.easytmdb.Model.Series.SeriesTopRated.SeriesTopRated;
import com.mythiccosmos.easytmdb.Model.Trending.TrendingMovie;
import com.mythiccosmos.easytmdb.Model.Trending.TrendingSeries;
import com.mythiccosmos.easytmdb.EasyTMDB;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

public class RetrofitHelper {

    //BASE URL
    public static final String BASE_URL = "https://api.themoviedb.org/3/";

    private static final String TMDB_KEY = EasyTMDB.getTMDB_KEY();


    /*
     -----MOVIE-----
    */

    public static final String MOVIE_NOW_PLAYING = "movie/now_playing";
    public static final String MOVIE_LATEST = "movie/latest";
    public static final String MOVIE_UPCOMING = "movie/upcoming";
    public static final String MOVIE_POPULAR = "movie/popular";
    public static final String MOVIE_TOP_RATED = "movie/top_rated";
    public static final String MOVIE_SIMILAR = "movie/{movie_id}/similar";
    public static final String MOVIE_DETAILS = "movie/{movie_id}";
    public static final String MOVIE_CREDITS = "movie/{movie_id}/credits";
    public static final String MOVIE_IMAGES = "movie/{movie_id}/images";


    /*
    -----SERIES----
    */
    public static final String SERIES_AIRING_TODAY = "tv/airing_today";
    public static final String SERIES_ON_THE_AIR = "tv/on_the_air";
    public static final String SERIES_LATEST = "tv/latest";
    public static final String SERIES_POPULAR = "tv/popular";
    public static final String SERIES_TOP_RATED = "tv/top_rated";
    public static final String SERIES_SIMILAR = "tv/{tv_id}/similar";
    public static final String SERIES_DETAILS = "tv/{tv_id}";
    public static final String SERIES_IMAGES = "tv/{tv_id}/images";

    public static final String SEASON_DETAILS = "tv/{tv_id}/season/{season_number}";

    public static final String EPISODE_DETAILS = "tv/{tv_id}/season/{season_number}/episode/{episode_number}";

    public static final String GENRES_MOVIE = "genre/movie/list";
    public static final String GENRES_SERIES = "genre/tv/list";

    public static final String PERSON_DETAILS = "person/{person_id}";
    public static final String PERSON_IMAGES = "person/{person_id}/images";

    public static final String TRENDING_MOVIE_DAY = "trending/movie/day";
    public static final String TRENDING_MOVIE_WEEK = "trending/movie/week";
    public static final String TRENDING_TV_DAY = "trending/tv/day";
    public static final String TRENDING_TV_WEEK = "trending/tv/week";

    public static final String SEARCH_MOVIE = "search/movie";
    public static final String SEARCH_SERIES = "search/tv";
    public static final String SEARCH_PERSON = "search/person";
    public static final String SEARCH_COMPANY = "search/company";
    public static final String SEARCH_KEYWORD = "search/keyword";


    public static final String FIND = "find/{external_id}";

    public static final String DISCOVER_MOVIE = "discover/movie";
    public static final String DISCOVER_SERIES = "discover/tv";



    private static RetrofitService getRetrofitService() {
        return RetrofitClient.getClient().create(RetrofitService.class);
    }

    private static boolean isValidInput(String value){
        if (value == null || value.trim().isEmpty() || value.length() == 0 || Integer.parseInt(value) < 0){
            return false;
        }
        return true;
    }




    public static Call<MovieNowPlaying> movieNowPlaying(String language, int page) {
        return getRetrofitService().movieNowPlaying(TMDB_KEY, language, page);
    }

    public static Call<MovieLatest> movieLatest(String language) {
        return getRetrofitService().movieLatest(TMDB_KEY, language);
    }

    public static Call<MovieUpcoming> movieUpcoming(String language, int page) {
        return getRetrofitService().movieUpcoming(TMDB_KEY, language, page);
    }

    public static Call<MoviePopular> moviePopular(String language, int page) {
        return getRetrofitService().moviePopular(TMDB_KEY, language, page);
    }

    public static Call<MovieTopRated> movieTopRated(String language, int page) {
        return getRetrofitService().movieTopRated(TMDB_KEY, language, page);
    }

    public static Call<MovieSimilar> movieSimilar(int movieId,String language, int page) {
        return getRetrofitService().movieSimilar(movieId,TMDB_KEY, language, page);
    }

    public static Call<MovieDetails> movieDetails(int movieId, String language) {
        return getRetrofitService().movieDetails(movieId,TMDB_KEY, language);
    }

    public static Call<MovieCredits> movieCredits(int movieId) {
        return getRetrofitService().movieCredits(movieId,TMDB_KEY);
    }

    public static Call<MovieImages> movieImages(int movieId, String language) {
        return getRetrofitService().movieImages(movieId,TMDB_KEY, language);
    }

    public static Call<SeriesAiringToday> seriesAiringToday(String language, int page) {
        return getRetrofitService().seriesAiringToday(TMDB_KEY, language,page);
    }

    public static Call<SeriesOnTheAir> seriesOnTheAir(String language, int page) {
        return getRetrofitService().seriesOnTheAir(TMDB_KEY, language,page);
    }

    public static Call<SeriesLatest> seriesLatest(String language) {
        return getRetrofitService().seriesLatest(TMDB_KEY, language);
    }

    public static Call<SeriesPopular> seriesPopular(String language, int page) {
        return getRetrofitService().seriesPopular(TMDB_KEY, language, page);
    }

    public static Call<SeriesTopRated> seriesTopRated(String language, int page) {
        return getRetrofitService().seriesTopRated(TMDB_KEY, language, page);
    }

    public static Call<SeriesSimilar> seriesSimilar(int tvId, String language, int page) {
        return getRetrofitService().seriesSimilar(tvId, TMDB_KEY, language, page);
    }

    public static Call<SeriesDetails> seriesDetails(int tvId, String language) {
        return getRetrofitService().seriesDetails(tvId, TMDB_KEY, language);
    }

    public static Call<SeriesImages> seriesImages(int tvId, String language) {
        return getRetrofitService().seriesImages(tvId, TMDB_KEY, language);
    }

    public static Call<SeasonDetails> seasonDetails(int tvId, int seasonNumber, String language) {
        return getRetrofitService().seasonDetails(tvId, seasonNumber, TMDB_KEY, language);
    }

    public static Call<EpisodeDetails> episodeDetails(int tvId, int seasonNumber, int episodeNumber, String language) {
        return getRetrofitService().episodeDetails(tvId, seasonNumber, episodeNumber, TMDB_KEY, language);
    }

    public static Call<GenresDetails> genresMovie(String language) {
        return getRetrofitService().genresMovie(TMDB_KEY, language);
    }

    public static Call<GenresDetails> genresSeries(String language) {
        return getRetrofitService().genresSeries(TMDB_KEY, language);
    }

    public static Call<PersonDetails> personDetails(int personId, String language) {
        return getRetrofitService().personDetails(personId, TMDB_KEY, language);
    }

    public static Call<PersonImages> personImages(int personId) {
        return getRetrofitService().personImages(personId, TMDB_KEY);
    }

    public static Call<TrendingMovie> trendingMovieDay() {
        return getRetrofitService().trendingMovieDay(TMDB_KEY);
    }

    public static Call<TrendingMovie> trendingMovieWeek() {
        return getRetrofitService().trendingMovieWeek(TMDB_KEY);
    }

    public static Call<TrendingSeries> trendingSeriesDay() {
        return getRetrofitService().trendingSeriesDay(TMDB_KEY);
    }

    public static Call<TrendingSeries> trendingSeriesWeek() {
        return getRetrofitService().trendingSeriesWeek(TMDB_KEY);
    }

    public static Call<SearchMovie> searchMovie(String language, String query, int page, boolean include_adult, String region, Integer year, int primary_release_year) {
        Map<String,Object> map = new HashMap<>();
        map.put("api_key",TMDB_KEY);

        if (isValidInput(language)){
            map.put("language",language);
        }

        if (isValidInput(query)){
            map.put("query",query);
        }

        if (isValidInput(""+page)){
            map.put("page",page);
        }

        if (isValidInput(""+include_adult)){
            map.put("include_adult",include_adult);
        }

        if (isValidInput(region)){
            map.put("region",region);
        }

        if (isValidInput(""+year)){
            map.put("year",year);
        }

        if (isValidInput(""+primary_release_year)){
            map.put("primary_release_year",primary_release_year);
        }
        return getRetrofitService().searchMovie(map);
    }

    public static Call<SearchSeries> searchSeries(String language, String query, int page, boolean include_adult, int first_air_date_year) {
        Map<String,Object> map = new HashMap<>();
        map.put("api_key",TMDB_KEY);

        if (isValidInput(language)){
            map.put("language",language);
        }

        if (isValidInput(query)){
            map.put("query",query);
        }

        if (isValidInput(""+page)){
            map.put("page",page);
        }

        if (isValidInput(""+include_adult)){
            map.put("include_adult",include_adult);
        }

        if (isValidInput(""+first_air_date_year)){
            map.put("first_air_date_year",first_air_date_year);
        }
        return getRetrofitService().searchSeries(map);
    }

    public static Call<SearchPerson> searchPerson(String language, String query, int page, boolean include_adult, String region) {
        Map<String,Object> map = new HashMap<>();
        map.put("api_key",TMDB_KEY);

        if (isValidInput(language)){
            map.put("language",language);
        }

        if (isValidInput(query)){
            map.put("query",query);
        }

        if (isValidInput(""+page)){
            map.put("page",page);
        }

        if (isValidInput(""+include_adult)){
            map.put("include_adult",include_adult);
        }

        if (isValidInput(region)){
            map.put("region",region);
        }
        return getRetrofitService().searchPerson(map);
    }

    public static Call<SearchCompany> searchCompany(String query, int page) {
        return getRetrofitService().searchCompany(TMDB_KEY, query, page);
    }

    public static Call<SearchKeyword> searchKeyword(String query, int page) {
        return getRetrofitService().searchKeyword(TMDB_KEY, query, page);
    }

    public static Call<FindDetails> find(String external_id, String language, String external_source) {
        return getRetrofitService().find(external_id, TMDB_KEY, language, external_source);
    }

    public static Call<DiscoverDetails> discoverMovie(Map<String, Object> map) {
        map.put("api_key",TMDB_KEY);
        return getRetrofitService().discoverMovie(map);
    }

    public static Call<DiscoverDetails> discoverSeries(Map<String, Object> map) {
        map.put("api_key",TMDB_KEY);
        return getRetrofitService().discoverSeries(map);
    }




    //normalize image url
    /*public static String getImageUrl(String posterPath, String backdropPath, String size) {
        String imgId = posterPath == null ? backdropPath : posterPath;
        return imgId == null ? DEFAULT_MOVIE_IMAGE_URL : BASE_IMAGE_URL + size + imgId;
    }

    public static String getImageUrl(String posterPath) {
        return posterPath == null ?
                DEFAULT_MOVIE_IMAGE_URL : BASE_IMAGE_URL + IMAGE_SIZE.w500 + posterPath;
    }

    public static String getImageUrl(String posterPath, String size) {
        return posterPath == null ?
                DEFAULT_MOVIE_IMAGE_URL : BASE_IMAGE_URL + size + posterPath;
    }*/



}
