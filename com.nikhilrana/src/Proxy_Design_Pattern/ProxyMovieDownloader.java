package Proxy_Design_Pattern;

import java.util.HashMap;

public class ProxyMovieDownloader implements MovieDownloader {
    private final MovieDownloader realMovieDownloaderService;
    private final HashMap<String,Movie>cache = new HashMap<>();

    public ProxyMovieDownloader(MovieDownloader realMovieDownloaderService) {
        this.realMovieDownloaderService = realMovieDownloaderService;
    }

    @Override
    public Movie getMovie(String movieName) {
        movieName = movieName.trim().toLowerCase();
        if(!cache.containsKey(movieName)) {
            cache.put(movieName, realMovieDownloaderService.getMovie(movieName));
        }
        return cache.get(movieName);
    }
}
