package arrays;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;

//d i p a l i r i a j i r a
public class FirstRepeatedCharacter {
    char get(String word) {

        char[] word1 = word.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word1.length; i++) {
            //not present
            hashMap.get(word1[i]){
                
            }
           hashMap.put(word1[i], 1);
            //present
        }










        for (int i = 0; i < word1.length; i++) {
            if (hashMap.containsKey(word1[i]) || count > 1)
                return word1[i];
        }
        return 0;
    }
}
