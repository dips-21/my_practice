//package datastructure.binarysearch;
//
//import org.junit.Test;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
//
//public class PairSumSearchableArrayTest {
//
//    @Test
//    public void hasSumPresent() {
//        int[] array = {16, 8, 4, 2, 1};
//        assertThat(new PairSumSearchableArray(array).hasSumPresent(20), is(true));
//    }
//
//
//    @Test
//    public void hasSumPresent01() {
//        int[] array = {16, 8, 4, 2, 1};
//        assertThat(new PairSumSearchableArray(array).hasSumPresent(50), is(false));
//
//    }
//
//
//    @Test
//    public void hasSumPresent02() {
//        int[] array = {16, 8, 4, 2, 1};
//        assertThat(new PairSumBinarySearch(array).hasSumPresent(50), is(false));
//    }
//
//    class TrinarySearch implements Searchable {
//
//        @Override
//        public boolean search(int[] arr, int key, int start, int end) {
//            return false;
//        }
//    }
////Anonymous class
//    Searchable searchable = new Searchable() {
//        @Override
//        public boolean search(int[] arr, int key, int start, int end) {
//            return false;
//        }
//    };
//    @Test
//    public void hasSumPresent03() {
//        int[] array = {16, 8, 4, 2, 1};
//      //Lamda for functional interface
//        Searchable searchable1 = (arr, key, start, end) -> {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == key)
//                    return true;
//            }
//            return false;
//        };
//
//        assertThat(new PairSumBinarySearch(array).hasSumPresent(50, searchable1), is(false));
//    }
//}