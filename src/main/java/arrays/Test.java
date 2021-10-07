package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        System.out.println(removeAllDuplicate("appplello"));     /// a  e o
    }

    static String removeAllDuplicate(String word) {
        char[] words = word.toCharArray();
        HashSet<Character> visitedWord = new LinkedHashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (visitedWord.contains(words[i])) {
                visitedWord.remove(words[i]);
            } else {
                visitedWord.add(words[i]);
            }
        }

            StringBuilder stringBuilder = new StringBuilder();
            Iterator<Character> itr = visitedWord.iterator();
            while (itr.hasNext()){
               stringBuilder.append(itr.next());
        }
        return  stringBuilder.toString();
    }
}
