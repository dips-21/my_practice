package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstNonRepeated {
    char firstNonRepeatedChar(String word){
        char[]words=word.toCharArray();
        HashSet<Character>repeatedWord=new LinkedHashSet<>();
        for (int i = 0; i < words.length ; i++) {      // a p p l e a o
            if(!(repeatedWord.contains(words[i]))){
                repeatedWord.add(words[i]);
            }
            else{
                repeatedWord.remove(words[i]);
            }
        }
        return repeatedWord.iterator().next();
    }
}
