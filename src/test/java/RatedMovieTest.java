import coreJava.movies.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

public class RatedMovieTest {
    //setter ,constructor ,builder
    @Test
    public void getName() {
        //Movie m=new Movie();
        //m.



        StringBuilder sb = new StringBuilder();
        String s = sb.append("one").append("2").append("3").toString();
        s=s.concat("tttt");
        System.out.println(s);
        RatedMovie.RatedMovieBuilder movieBuilder = new RatedMovie.RatedMovieBuilder();
        RatedMovie m = movieBuilder.setName("Insidious")
                .setYear(2008).setRating("16+").setGenre("horror").build();
        System.out.println(m);

        RatedMovie m11=new RatedMovie(m.getName(),m.getGenre(),2018,"18+");

        StringBuffer sbu=new StringBuffer();
        sbu.append("0ii");
        RatedMovie.RatedMovieBuffer movieBuffer=new RatedMovie.RatedMovieBuffer();
        RatedMovie m1=movieBuffer.setName("matilda").setYear(2020).setRating("10+").setGenre("comedy").build();
        System.out.println(m1);
    }
}