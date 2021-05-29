package loops;

public class MultiplicationOfCube {
    static long multiplicationOfCube(int start, int end) {
        long result = 1;
        for (int i = start; i <= end; i++) {
            int count = i * i * i;
            result = result * count;
        }
        return result;
    }
}
