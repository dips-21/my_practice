package leetcode.binarysearch;

//flowing
//flower
//flow                      0123456789  0123456
//0 1 2 3                 //maharashtra mahabali 0 1 2 3
//flower flowing flight fluck flick flush
// for 1- last
public class LongestCommonPrefix {
    //abcdef abcde abc abcon abon
    String commonPrefix(String[] words) {
        String common = commonPrefix(words[0], words[1]);
        for (int i = 2; i < words.length; i++) {
            String newCommon = commonPrefix(common, words[i]);
            common = newCommon;
        }
        return common;
    }

    String commonPrefix(String wordOne, String wordTwo) {
        int prefixLength = lengthOfCommonPrefix(wordOne, wordTwo);
        /*char[] commonPrefix = new char[prefixLength];
        for (int i = 0; i < prefixLength; i++) {
            commonPrefix[i] = wordOne.charAt(i);
        }
        return new String(commonPrefix); */
        return wordOne.substring(0, prefixLength);
    }

    int lengthOfCommonPrefix(String wordOne, String wordTwo) {
        char[] one = wordOne.toCharArray();
        char[] two = wordTwo.toCharArray();
        int i = 0;
        while (i < one.length && i < two.length) {
            if (one[i] != two[i]) {
                return i;
            }
            i++;
        }

        return i;           // // return Math.min(one.length, two.length);
    }
}
