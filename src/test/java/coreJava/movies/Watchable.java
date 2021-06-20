package coreJava.movies;

enum WatchableType {
 KIDS(5),ADULT(20),MYTHOLOGY(1),SPIRITUAL(2);
 private int rate;
 WatchableType(int rate){
  this.rate=rate;
 }
 int getRate(){
  return  rate;
 }
}

public interface Watchable {
    int getLength();

    WatchableType getType();

    String getName();

    String getDirectorName();

    int getYear();

    double getTax();
}
