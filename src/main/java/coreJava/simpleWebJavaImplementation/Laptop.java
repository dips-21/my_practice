package coreJava.simpleWebJavaImplementation;

public class Laptop {
    String laptopModel;
    int prize;
   Movie movie;
    public Laptop(String laptopModel, int prize,Movie movie) {
        this.laptopModel = laptopModel;
        this.prize = prize;
        this.movie=movie;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopModel='" + laptopModel + '\'' +
                ", prize=" + prize +
                ", movie=" + movie +
                '}';
    }
}
