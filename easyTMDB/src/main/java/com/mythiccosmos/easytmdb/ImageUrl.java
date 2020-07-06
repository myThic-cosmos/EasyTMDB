package com.mythiccosmos.easytmdb;

import static com.mythiccosmos.easytmdb.Enum.ImageSize.original;

public class ImageUrl {
    private final String BASE_IMAGE_URL = "http://image.tmdb.org/t/p/";

    public String url(String path) {
        return url(path, original.name());
    }

    public String url(String path, String size) {
        return BASE_IMAGE_URL + size + path;
    }
}
