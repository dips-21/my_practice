package arrays;

import java.util.HashSet;

public class AnagramWithoutDuplicates {
    boolean isWordAnagram(String wordOne, String wordTwo) {
        if (wordOne.length() != wordTwo.length()) {
            return false;
        }
        HashSet<Character> wordAnagram = new HashSet<>();
        for (int i = 0; i < wordOne.length(); i++) {
            wordAnagram.add(wordOne.charAt(i));
        }

        for (int i = 0; i < wordTwo.length(); i++) {
            if (!wordAnagram.contains(wordTwo.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
