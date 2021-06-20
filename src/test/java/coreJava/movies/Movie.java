package coreJava.movies;

public class Movie extends AbstractWatchable {
    boolean isCensored;
    public Movie(int length, String name, String directorName, WatchableType type, int year, boolean isCensored,double budget) {
        super(length, name, directorName, type, year,budget);
        this.isCensored=isCensored;
    }

    boolean isCensored() {
        return isCensored;
    }

    @Override
    public double getTax(){
        return  (type.getRate()*budget)/100;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", directorName='" + directorName + '\'' +
                ", type=" + type +
                ", year=" + year +
                ", budget=" + budget +
                ", isCensored=" + isCensored +
                '}';
    }
}


 /* if(type==WatchableType.KIDS){
            return 0.5*budget;
        }
        return 0.0;*/