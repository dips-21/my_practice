package arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SquareOfCharNumTest {

    @Test
    public void getSquare() {
    SquareOfCharNum squareOfCharNum=new SquareOfCharNum();
    char[]num={2,4,6,8};

        int expected=4163664;
        assertThat(squareOfCharNum.getSquare(num),is(expected));
    }

    @Test
    public void getSquareOfDigits() {
        SquareOfCharNum squareOfCharNum=new SquareOfCharNum();
        char[]num={2,4,6,8};
        for (int j = 0; j <num.length ; j++) {
            System.out.print(num[j] * num[j]);
        }
        int expected=4163664;
        assertThat(squareOfCharNum.getSquare(num),is(expected));
    }

    @Test
    public void getNumberOfDigits() {
        assertThat(new SquareOfCharNum().getNumberOfDigits(123),is(3));
    }

    @Test
    public void getNumberOfDigitsOfSingleDigit() {
        assertThat(new SquareOfCharNum().getNumberOfDigits(1),is(1));
    }

    @Test
    public void getPowerOfNum() {
        assertThat(new SquareOfCharNum().power(10,2),is(100));
    }

    @Test
    public void getPowerOfNum01() {
        assertThat(new SquareOfCharNum().power(3,3),is(27));
    }

    @Test
    public void getSquareOfDigit() {
        int[]num={2,3,4,5};
        int expected=491625;
        assertThat(new SquareOfCharNum().getSquareOfDigits(num),is(expected));
    }

    @Test
    public void getSquareOfDigit01() {
        int[]num={2,3};
        int expected=49;
        assertThat(new SquareOfCharNum().getSquareOfDigits(num),is(expected));
    }

    @Test
    public void getSquareOfDigitOfCharArray01() {
        char[]num={2,3};
        int expected=49;
        assertThat(new SquareOfCharNum().getSquareOfDigitsOfCharArray(num),is(expected));
    }

    @Test
    public void getSquareOfDigitOfString() {
        assertThat(new SquareOfCharNum().getSquareOfDigitsOfCharArray("123"),is(149));
    }

}