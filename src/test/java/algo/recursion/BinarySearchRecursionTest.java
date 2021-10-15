package algo.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchRecursionTest {

    BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();

    @Test
    public void binarySearch() {
        int[] num = {5, 9, 12, 16, 20, 25};
        int a = binarySearchRecursion.binarySearch(num, 30);
        System.out.println(a);
    }

    @Test
    public void binarySearch01() {
        int[] num = {5, 9, 12, 16, 20, 25};
        int a = binarySearchRecursion.binarySearch(num, 30);
        System.out.println(a);
    }
}