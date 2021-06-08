package sorting;

public class SortFactory {
    static Sorted getInstance(String algorithm) {
        if (algorithm.equals("bubble"))
            return new BubbleSort();
        else if (algorithm.equals("selection"))
            return new SelectionSort();
        return new InsertionSort();
    }
}
