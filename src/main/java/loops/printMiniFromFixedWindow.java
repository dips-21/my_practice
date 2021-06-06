package loops;

//9, 8, 4,|   3, 6, 7,   2, 9, 6
public class printMiniFromFixedWindow {
    static void printMiniFromFixedWindowSize(int[] array, int size) {
        int min = Integer.MAX_VALUE;

        for (int start = 0;start+size <= array.length; start += size) {
            for (int i = start; i < start+size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println(min);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 4, 3, 6, 7, 2, 9, 6};
        int size = 3;
        printMiniFromFixedWindow.printMiniFromFixedWindowSize(array, 3);

    }
}

