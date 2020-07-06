package com.mythiccosmos.easytmdb;

import com.mythiccosmos.easytmdb.Helper.RetrofitHelper;
import com.mythiccosmos.easytmdb.Model.Search.Movie.SearchMovie;
import com.mythiccosmos.easytmdb.Model.Search.SearchCompany;
import com.mythiccosmos.easytmdb.Model.Search.SearchKeyword;
import com.mythiccosmos.easytmdb.Model.Search.Person.SearchPerson;
import com.mythiccosmos.easytmdb.Model.Search.Series.SearchSeries;

import retrofit2.Call;

import static com.mythiccosmos.easytmdb.EasyTMDB.getDefaultPage;

public class Search {
    /*
    * MOVIE NAME
    * SERIES NAME
    * PERSON NAME
    * COMPANY NAME
    * KEYWORD
    * */

    public Call<SearchMovie> movie(String query) {
        return movie(null,query,null,false,null,null,null);
    }

    public Call<SearchMovie> movie(String language, String query, Integer page, Boolean adult, String region, Integer year, Integer primaryReleaseYear) {
        return RetrofitHelper.searchMovie(language,query,page,adult,region,year,primaryReleaseYear);
    }

    public Call<SearchSeries> series(String query) {
        return series(null,query,null,false,null);
    }

    public Call<SearchSeries> series(String language, String query, Integer page, Boolean adult, Integer publishYear) {
        return RetrofitHelper.searchSeries(language,query,page,adult,publishYear);
    }

    public Call<SearchPerson> person(String query) {
        return person(null,query,null,false,null);
    }

    public Call<SearchPerson> person(String language, String query, Integer page, Boolean adult, String region) {
        return RetrofitHelper.searchPerson(language,query,page,adult,region);
    }

    public Call<SearchCompany> company(String name) {
        return company(name, getDefaultPage());
    }

    public Call<SearchCompany> company(String name, int page) {
        return RetrofitHelper.searchCompany(name,page);
    }

    public Call<SearchKeyword> keyword(String name) {
        return keyword(name, getDefaultPage());
    }

    public Call<SearchKeyword> keyword(String name, int page) {
        return RetrofitHelper.searchKeyword(name, page);
    }


}
