package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

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


    String removeAllDuplicates(String word) {
        char[] words = word.toCharArray();
        HashSet<Character> visitedSet = new LinkedHashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (visitedSet.contains(words[i])) {
                visitedSet.remove(words[i]);
            } else {
                visitedSet.add(words[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Character> itr = visitedSet.iterator();
        while (itr.hasNext()) {
            char ch = itr.next();
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
//f()                      main(){ int c=f();
//int a=b*b;
    //return b*b
    String removeDuplicates(String word) {
        char[] words = word.toCharArray();
        HashSet<Character> visitedSet = new LinkedHashSet<>();
        for (int i = 0; i < words.length; i++) {
            visitedSet.add(words[i]);
        }

       StringBuilder stringBuilder=new StringBuilder();
            Iterator<Character>itr=visitedSet.iterator();
            while(itr.hasNext()){
                 stringBuilder.append(itr.next());
            }
            return stringBuilder.toString();
        }
    }




