package com.mythiccosmos.easytmdb;

import static com.mythiccosmos.easytmdb.Enum.ImageSize.original;

public class ImageUrl {
    private final String BASE_IMAGE_URL = "http://image.tmdb.org/t/p/";
    private final String DEFAULT_IMAGE = "https://ispab.org/wp-content/themes/consultix/images/no-image-found-360x260.png";

    public String url(String path) {
        return url(path, original.name());
    }

    public String url(String path, String size) {
        return BASE_IMAGE_URL + size + path;
    }

    public String fixUrl(String path) {
        if (path == null || path.trim().isEmpty())
            path = DEFAULT_IMAGE;

        return fixUrl(path, DEFAULT_IMAGE, original.name());
    }

    public String fixUrl(String posterPath, String backdropPath, String size) {
        String validPath = posterPath == null || posterPath.isEmpty() ?
                backdropPath == null || backdropPath.isEmpty() ?
                        DEFAULT_IMAGE : backdropPath : posterPath;


        size = size == null || size.isEmpty() ? original.name() : size;

        return BASE_IMAGE_URL + size + validPath;
    }
}
