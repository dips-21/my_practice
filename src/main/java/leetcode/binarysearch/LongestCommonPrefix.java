package leetcode.binarysearch;

//flower
//flow
//0 1 2 3 4
public class LongestCommonPrefix {
    int LengthOfCommonPrefix(String wordOne, String wordTwo) {
        char[] one = wordOne.toCharArray();
        char[] two = wordTwo.toCharArray();
        int i = 0;
        while (i < one.length && i < two.length) {
            if (one[i] != two[i]) {
                return i;
            }
            i++;
        }          //flower flow   4 words common
//dips flower
        // return Math.min(one.length, two.length);
        return i;
    }

    int CommonPrefix(String[] wordArray) {
        String[] commonChar = null;

        for (int i = 0, j = 0; i < wordArray.length; i++, j++) {
            char[] one=wordArray[i].toCharArray();
        }
    return 0;
    }


}
