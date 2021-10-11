package recursion;

public class PowerOfNum {

    double getPower(int base, int n) {
        int result = getPowerOfPositive(base, Math.abs(n));
        if (n < 0) {
            return 1.0 / result;
        }
        return result;

    }

    private int getPowerOfPositive(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return (base * getPowerOfPositive(base, n - 1));
    }
}



