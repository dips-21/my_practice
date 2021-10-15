package recursion;

import java.util.Arrays;

public class ReverseString {
    void reverse(char[] word) {
        reverse(word, 0, word.length - 1);
    }

    private void reverse(char[] word, int start, int end) {
        if (start >= end)
            return;
        swap(word,start ,end );
        reverse(word, start + 1, end - 1);
    }

    void swap(char[] word, int start, int end) {
        char temp;
        temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }


    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', '0'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverse(word);
        System.out.println(Arrays.toString(word));
    }
}