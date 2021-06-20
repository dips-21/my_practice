package coreJava.movies;

public abstract class AbstractWatchable implements Watchable {
    int length;
    String name;
    String directorName;
    WatchableType type;
    int year;
    double budget;

    public AbstractWatchable(int length, String name, String directorName, WatchableType type, int year, double budget) {
        this.length = length;
        this.name = name;
        this.directorName = directorName;
        this.year = year;
        this.type = type;
        this.budget = budget;

    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public WatchableType getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDirectorName() {
        return directorName;
    }

    @Override
    public int getYear() {
        return year;
    }
}
