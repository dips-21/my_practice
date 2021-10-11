package datastructure.arrays;

import coreJava.ds.maps.HabitMap;

import java.util.HashMap;

public class FindSentenceFromParagraph {
    String[] sentences;
    HashMap<String, Integer> wordToSentencePosition = new HashMap<>();

    FindSentenceFromParagraph(String[] paragraph) {
        wordToSentencePosition = new HashMap<>();
        this.sentences = paragraph;
        for (int lineNumber = 0; lineNumber < sentences.length; lineNumber++) {
            String[] words = sentences[lineNumber].split(" ");
            for (String word : words) {
                wordToSentencePosition.put(word, lineNumber);
            }

        }
    }

    String searchParagraphFromWord(String words) {
        int position = wordToSentencePosition.get(words);
        return sentences[position];

    }
}
