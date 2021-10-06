package arrays;

import java.util.HashSet;

public class DuplicateLettersInWord {
    boolean hasDuplicateLetter(String word) {
        char[] words = word.toCharArray();
        HashSet<Character> visitedSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {     // a p p l e , pen
            if (visitedSet.contains(words[i])) {
                return true;  //a
            }
            visitedSet.add(words[i]);
        }
        return false;
    }


    char removeAllDuplicates(String word){
        char[]words=word.toCharArray();
        HashSet<Character>visitedSet=new HashSet<>();
        for (int i = 0; i < words.length ; i++) {

        }
        return 0;
    }
}
