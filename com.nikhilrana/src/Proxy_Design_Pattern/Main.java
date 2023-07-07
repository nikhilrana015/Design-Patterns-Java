package Proxy_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        MovieDownloader movieDownloader = new ProxyMovieDownloader(new RealMovieDownloader());
        movieDownloader.getMovie("Lights-Out");
        movieDownloader.getMovie("Orphan");
        movieDownloader.getMovie("lights-out");
        movieDownloader.getMovie("Ninja-Turtles");
        movieDownloader.getMovie("orPHAN");
    }
}
