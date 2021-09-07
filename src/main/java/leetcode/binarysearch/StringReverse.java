package leetcode.binarysearch;

public class StringReverse {

    String getReverseOfString(String string) {
        char[] words = string.toCharArray();
          int start=0;
           int end=string.length()-1;
        while (start<end){
            char temp;
            temp = words[start];                           //D a b i c l o t
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;

        }
        return new String(words);
    }
}
