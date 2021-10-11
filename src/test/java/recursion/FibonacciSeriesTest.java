package recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;

public class FibonacciSeriesTest {
    FibonacciSeries fibonacciSeries = getSeries();

    protected FibonacciSeries getSeries() {
        return new FibonacciSeries();
    }

    @Test
    public void getFibonacciSeries() {
        List<Integer> series = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            series.add(fibonacciSeries.getNth(i));
        }
        System.out.println(series);
    }

    @Test
    public void getFibonacciSeriesTill4() {
        fibonacciSeries.getNth(4);
        System.out.println(FibonacciSeries.count);
    }

    @Test
    public void getFibonacciSeriesTill1() {
        for (int i = 0; i < 10; i++) {
            FibonacciSeries.count = 0;
            fibonacciSeries.getNth(4);
            System.out.println("Nth fib" + i + "count = " + FibonacciSeries.count);
        }
    }

}