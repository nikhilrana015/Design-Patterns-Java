package Proxy_Design_Pattern;

public class RealMovieDownloader implements MovieDownloader {

    public RealMovieDownloader() {
        System.out.println("Server set-up");
    }
    @Override
    public Movie getMovie(String movieName) {
        System.out.println("Connecting to the movie downloader server");
        System.out.println("Connected with movie downloader server");
        System.out.println("Downloading the movie " + movieName);
        System.out.println("Retrieving the movie metadata");
        System.out.println("Done. Enjoy your movie");
        return new Movie(movieName, "mp4");
    }
}
