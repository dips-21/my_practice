package coreJava.movies;

public class TvShow extends AbstractWatchable {
    int numEpisodes;

    public TvShow(int length, String name, String directorName, WatchableType type, int year, int numEpisodes, double budget) {
        super(length, name, directorName, type, year, budget);
        this.numEpisodes = numEpisodes;
        this.budget = budget;

    }

    int getNumEpisodes() {
        return numEpisodes;
    }

    @Override
    public double getTax() {
        return (type.getRate() * budget)/100;
    }

    @Override
    public String toString() {
        return "TvShow{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", directorName='" + directorName + '\'' +
                ", type=" + type +
                ", year=" + year +
                ", budget=" + budget +
                ", numEpisodes=" + numEpisodes +
                '}';
    }
}
