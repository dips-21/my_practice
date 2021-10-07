package arrays;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

//d i p a p l i r i a j i r a
//d-1 i-2 a-
public class FirstRepeatedCharacter {
    char get(String word) {
        char[] words = word.toCharArray();
        HashMap<Character, Integer> wordCount = new LinkedHashMap<>();
        //word count
        for (int i = 0; i < words.length; i++) {
            if (!wordCount.containsKey(words[i])) {
                wordCount.put(words[i], 1);
            } else {
                int prevCount = wordCount.get(words[i]);
                wordCount.put(words[i], prevCount + 1);
            }
        }
        //check counts >1
        Iterator<Character> itr = wordCount.keySet().iterator();
        while (itr.hasNext()) {   // (d->1) (i->2)
            char ch = itr.next();
            int count = wordCount.get(ch);
            if (count > 1) {
                return ch;
            }
        }
        return ' ';
    }
}

      /*  for (char ch : words) {
            int count = wordCount.get(ch);
            if( count> 1){
                return ch;
            }
        }

        return ' ';
    }*/
