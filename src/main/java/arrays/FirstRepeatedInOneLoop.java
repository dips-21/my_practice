package arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstRepeatedInOneLoop extends FirstRepeatedCharacter {
    @Override
    char get(String word) {
        char[] words = word.toCharArray();
        HashMap<Character, Integer> wordCount = new LinkedHashMap<>();
        for (char c : words) {
            if (!(wordCount.containsKey(c))) {
                wordCount.put(c, 1);
            } else {
                return c;
            }
        }
        return ' ';
    }
}
