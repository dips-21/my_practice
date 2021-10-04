package arrays;

import java.util.HashSet;

public class Palindrome {
    //wow   w
    boolean isPalindrome(String word) {            //nitin
        char[] words = word.toCharArray();               //0 1 2 3 4
        int start = 0;
        int end = words.length - 1;
        while (start < end) {
            if (words[start] != words[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    boolean isPalindrome(final int number) {
        int input = number;
        int digit;
        int reverse = 0;

        while (input != 0) {
            digit = input % 10;    //121
            reverse = reverse * 10 + digit;  //1
            input = input / 10;
        }
        //System.out.println(reverse);
        //System.out.println(input);
        return reverse == number;
    }


    //wowin 5 3
    boolean areFirstKCharsPalindrome(String word, int k) {    //nisha nilesh abcabcd
        char[] words = word.toCharArray();
        int start = 0;
        int end = k;
        while (start < end) {
            if (words[start] != words[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    //dipali
    //rupali
    int getCommonCharacter(String word1, String word2) {
        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        int count = 0;   //wow
        int start = 0;   //cown
        int miniLength;
        if (words1.length > words2.length) {
            miniLength = words2.length;
        } else {
            miniLength = words1.length;
        }
        // int minLength=Math.min(words1.length,words2.length);
        while (start < miniLength) {
            if (words1[start] == words2[start]) {
                count++;
            }
            start++;

        }
        return count;
    }

    //apppiippp                     //

    //laptop  0 5
    //i =0 j=5
    //for (i=0, i<len;i++) //  //j=5
    //  for (i=0, i<len;i++) //  //j=4

    // for (i=0, i<len;i++) //  //j=1
    //  for (i=0, i<len;i++) //  //j=0
//aa
    //laptop
    //hippy gippy diyppy
    //iamnayandipali
    //0-14 1-14 2-14 3-14  4-14   7-14   8-14   14-14
    //1-1

    void printAllSubstring(String word) {
        int max = 0;
        //word.charAt(i)    word[i]
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) { //O(n2)
                //start =i
            }
        }
    }
}


   /* char temp = words[start];             //n
            words[start] = words[end];  //n=n
            words[end] = temp;     //
            start++;
            end--;*/

// System.out.println(word + "=====" +String.valueOf(words));
//return word.equals(String.valueOf(words));
