package coreJava.movies;

public class MovieTest {
    public static void main(String[] args) {
        Watchable[] watchables = {new TvShow(2, "cooper", "Dips", WatchableType.ADULT, 2020, 8, 200),
                new Movie(2, "Matilda", "Dips", WatchableType.KIDS, 2020, true, 3000),
                new Movie(2, "super se oooper", "Dips", WatchableType.ADULT, 2020, true, 3000),
                new TvShow(2, "Doremon", "Dips", WatchableType.ADULT, 2020, 9, 1000)};

        double totalTax = 0;
       // for (int i = 0; i <watchables.length ; i++) {
         //   watchables[i].getTax();
        //}
        for (Watchable watchable : watchables) {
            System.out.println(watchable);
            totalTax += watchable.getTax();
            System.out.println(watchable.getTax());
        }
        System.out.println(totalTax);
    }
    //watchables[3].getTax();
}
