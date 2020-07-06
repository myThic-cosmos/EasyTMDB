package com.mythiccosmos.themoviedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mythiccosmos.easytmdb.EasyTMDB;
import com.mythiccosmos.easytmdb.Model.Movie.MovieLatest.MovieLatest;

public class MainActivity extends AppCompatActivity {

    String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //you must init this
        EasyTMDB tmdb = new EasyTMDB("YOUT_TMDB_KEY_HERE");

        //follow readme

        /**get movie */
        /*tmdb.movie().latest().enqueue(new Callback<MovieLatest>() {
            @Override
            public void onResponse(Call<MovieLatest> call, Response<MovieLatest> response) {
                //get data from movie latest
                MovieLatest movieLatest = response.body();
                String name = movieLatest.getOriginalTitle();
                int budget = movieLatest.getBudget();
            }

            @Override
            public void onFailure(Call<MovieLatest> call, Throwable t) {

            }
        });*/

        /**for discover or advanced search*/
        /*Map<String, Object> map = new HashMap<>();
        map.put(DiscoverMovieMap.KEY.INCLUDE_ADULT.value, false);
        map.put(DiscoverMovieMap.KEY.WITH_RUNTIME_GTE.value, 60);
        map.put(DiscoverMovieMap.KEY.SORT_BY.value, DiscoverMovieMap.SHORT_BY.ORIGINAL_TITLE.ASC);

        tmdb.discover().movie(map).enqueue(...);*/




    }

}
