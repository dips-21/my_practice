package loops;

public class PowerFunction {
    static long power_positive(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = base * result;
        }
        return result;
    }

    static double power(int base, int exponent) {
        double result = 1;
        int absExponent=exponent;
        if (absExponent< 0) {
            absExponent = -absExponent;
        }
        for (int i = 1; i <= absExponent; i++) {
            result = base * result;
        }
        if (exponent < 0)
            return 1 / result;
        else
            return result;

    }
}
