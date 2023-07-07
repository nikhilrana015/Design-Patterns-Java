package Proxy_Design_Pattern;

public class Movie {
    private String movieName;
    private String movieType;
    public Movie(String movieName, String movieType) {
        this.movieName = movieName;
        this.movieType = movieType;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }
}
