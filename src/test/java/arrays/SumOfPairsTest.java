package arrays;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SumOfPairsTest {
    SumOfPairs sumOfPairs = new SumOfPairs();

    @Test
    public void getPair() {
        int[] num = {10, 10, 15, 5, 6, 14, 8, 9};
       // assertThat(sumOfPairs.getPair(num, 20), is(3));
    }

    @Test
    public void getPair02() {
      //  "hello world";
        //olleh dlrow

        assertThat( sumOfPairs.minLength("000111000011"),is(2));
        //assertThat( sumOfPairs.minLength("0001100001111"),is(2));
        //assertThat( sumOfPairs.minLength("0001111000011110000111001111"),is(3));
        int[] num = {10, 15, 5, 6, 14, 8, 9};
       // assertThat(sumOfPairs.getPair(num, 21), is(1));
    }


    @Test
    public void getPair03() {
        int[] num = {1, 5, 1};
        assertThat(sumOfPairs.getPair(num, 6), is(1));
    }

    public static void main(String[] args) {

    }
}