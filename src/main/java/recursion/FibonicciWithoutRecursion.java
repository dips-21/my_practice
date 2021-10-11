package recursion;

public class FibonicciWithoutRecursion extends FibonacciSeries {
    @Override
    int getNth(int num) {
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
        return sum;
    }
}
