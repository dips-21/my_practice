

 public class RatedMovie {
    private String name;
    private String genre;
    private int year;
    private String rating;


    public RatedMovie(String name, String genre, int year, String rating) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    static class RatedMovieBuilder {
        String name;
        String genre;
        int year;
        String rating;

        public RatedMovieBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RatedMovieBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public RatedMovieBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public RatedMovieBuilder setRating(String rating) {
            this.rating = rating;
            return this;
        }

        public RatedMovie build() {
            return new RatedMovie(name, genre, year, rating);
        }
    }

    @Override
    public String toString() {
        return "RatedMovie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", rating='" + rating + '\'' +
                '}';
    }

    static class RatedMovieBuffer {
        String name;
        String genre;
        int year;
        String rating;

        public synchronized RatedMovieBuffer setName(String name) {
            this.name = name;
            return this;
        }

        public synchronized RatedMovieBuffer setGenre(String genre) {
            this.genre = genre;
            return this;
        }


        public synchronized RatedMovieBuffer setYear(int year) {
            this.year = year;
            return this;
        }

        public synchronized RatedMovieBuffer setRating(String rating) {
            this.rating = rating;
            return this;
        }

        public synchronized RatedMovie build(){
            return (new RatedMovie(name,genre,year,rating));

        }
    }
}
