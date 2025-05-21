package rajaSoftware;

public class Q5 {
    public static void main(String[] args) {
        int a = 511709;
        int sum = 0;
        while (a != 0) {
            int x = a % 10;
            sum += x;
            a = a / 100;
        }
         System.out.println(sum);
    }
}
