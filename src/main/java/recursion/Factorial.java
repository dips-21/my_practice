package recursion;

public class Factorial {
    public static void main(String[] args) {
        int result = new Factorial().getFactorial(5);
        System.out.println(result);
    }

    int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
