package arrays;

import java.util.HashSet;

public class HasSubString {
    boolean hasSubStringInWord(String word, String substring) {   //india nia
        char[] words = word.toCharArray();
        char[] subWord = substring.toCharArray();
        HashSet<Character> isPresent = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            isPresent.add(words[i]);
        }
        for (int i = 0; i < subWord.length; i++) {
            if((!(isPresent.contains(subWord[i])))){
                 return false;
            }
        }
        return true;
    }
}
