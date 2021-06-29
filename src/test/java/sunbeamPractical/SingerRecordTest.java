package sunbeamPractical;

import datastructure.SimpleLinkedList;
import met.EmployeeSalaryComparator;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
//
public class SingerRecordTest {

    @Test
    public void sortByRating() {
       // new SingerRecordTest().sortByRating();
        SingerRecord simpleLinkedList = new SingerRecord();
        Singer arijit = new Singer("arijit", 7);
        simpleLinkedList.addSinger(arijit);
        Singer amal = new Singer("amal", 5);
        simpleLinkedList.addSinger(amal);
        simpleLinkedList.addSinger(new Singer("arman",4));
        simpleLinkedList.addSinger(new Singer("neha Kakkar",6));
        List<Singer> sortedList= simpleLinkedList.sortByRating();
        //assertThat(new SingerRecordComparator().compare(Singer o1,Singer o2),is());
        System.out.println(sortedList);

        sortedList= simpleLinkedList.sortSingerByName();
        System.out.println(sortedList);

       // assertThat(new SingerRecord().compare(Singer o1,Singer o2);
       //
        int result=arijit.compareTo(amal);
        System.out.println(result);
        new AgeComparator().compare(arijit,amal);//or
        Comparator<Singer> comparator=new AgeComparator();
        comparator.compare(amal,arijit);




    }
}