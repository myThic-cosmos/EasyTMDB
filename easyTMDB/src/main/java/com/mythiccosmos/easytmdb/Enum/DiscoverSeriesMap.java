package com.mythiccosmos.easytmdb.Enum;

public enum DiscoverSeriesMap {
    first_air_date_year;

    public enum KEY {
        LANGUAGE("language"),
        SORT_BY("sort_by"),
        AIR_DATE_GTE("air_date.gte"),
        AIR_DATE_LTE("air_date.lte"),
        FIRST_AIR_DATE_GTE("first_air_date.gte"),
        FIRST_AIR_DATE_LTE("first_air_date.lte"),
        FIRST_AIR_DATE_YEAR("first_air_date_year"),
        PAGE("page"),
        TIMEZONE("timezone"),
        VOTE_AVERAGE_GET("vote_average.gte"),
        VOTE_COUNT_GTE("vote_count.gte"),
        WITH_GENRES("with_genres"),
        WITHOUT_GENRES("without_genres"),
        WITH_KEYWORDS("with_keywords"),
        WITHOUT_KEYWORDS("without_keywords"),
        WITH_RUNTIME_GTE("with_runtime.gte"),
        WITH_RUNTIME_LTE("with_runtime.lte"),
        INCLUDE_NULL_FIRST_AIR_DATE("include_null_first_air_dates"),
        WITH_ORIGINAL_LANGUAGE("with_original_language"),
        WITH_COMPANIES("with_companies"),
        SCREENED_THEATRICALLY("screened_theatrically"),
        WITH_NETWORKS("with_networks");


        public String value;

        KEY(String value) {
            this.value = value;
        }
    }

    public enum SHORT_BY {
        POPULARITY("popularity.asc","popularity.desc"),
        FIRST_AIR_DATE("first_air_date.asc","first_air_date.desc"),
        VOTE_AVERAGE("vote_average.asc","vote_average.desc");

        public String ASC;
        public String DESC;

        SHORT_BY(String ASC, String DESC) {
            this.ASC = ASC;
            this.DESC = DESC;
        }
    }

    public enum TIMEZONE{
        AMERICAN("America"),
        NEW_YORK("New_York");

        String value;

        TIMEZONE(String value) {
            this.value = value;
        }
    }
}
