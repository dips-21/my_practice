package coreJava.simpleWebJavaImplementation;

public class Movie {
 String name;
 int releasedYear;
 String movieType;

    public Movie(String name, int releasedYear, String movieType) {
        this.name = name;
        this.releasedYear = releasedYear;
        this.movieType = movieType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }
}
