package met.interval;
import met.interval.Interval;

public class IntervalTest {
    public static void main(String[] args) {
        Interval intervalOne = new Interval(5, 69, 44);
        Interval intervalTwo = new Interval(2, 00, 67);
        Interval k = new Interval(4, 77, 00);
        Interval l = new Interval(00, 56, 66);
        Interval m = new Interval(5, 69, 44);
        Interval n = intervalTwo;
        System.out.print("n==intervalTwo ");
        System.out.println(n == intervalTwo);
        System.out.print("m==intervalOne ");
        System.out.println(m == intervalOne);

        System.out.print("m.equals(intervalOne) ");
        System.out.println(m.equals(intervalOne));


        System.out.println("IntervalOne = " + intervalOne);
        System.out.println("Interval Two=  " + intervalTwo);
        System.out.println("Interval k " + k);
        System.out.println("Interval l " + l);

        intervalOne.add(intervalOne);
        intervalTwo.add(intervalOne);
        System.out.println(intervalOne);
        System.out.println(intervalTwo);
    }
}
