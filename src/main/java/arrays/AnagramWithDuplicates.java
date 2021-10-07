package arrays;

import java.util.HashMap;

public class AnagramWithDuplicates {
    boolean isWordAnagram(String wordOne, String wordTwo) {    //knee     keen
        if (wordOne.length() != wordTwo.length()) {
            return false;
        }

        HashMap<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < wordOne.length(); i++) {
            if (!(wordMap.containsKey(wordOne.charAt(i)))) {
                wordMap.put(wordOne.charAt(i), 1);
            } else {
                int count = wordMap.get(wordOne.charAt(i));
                wordMap.put(wordOne.charAt(i), count + 1);
            }
        }
            for (int j = 0; j < wordTwo.length(); j++) {
                if (!wordMap.containsKey(wordTwo.charAt(j))) {
                    return false;
                } else {
                    int count = wordMap.get(wordTwo.charAt(j));
                    if (count > 1) {
                        wordMap.put(wordTwo.charAt(j), count - 1);
                    } else {
                        wordMap.remove(wordTwo.charAt(j));
                    }
                }
            }
            return wordMap.isEmpty();
          /*  if(wordMap.isEmpty())
                return true;
        return false;*/
    }
}
