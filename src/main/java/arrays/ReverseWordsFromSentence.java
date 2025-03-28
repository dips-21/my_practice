package arrays;

public class ReverseWordsFromSentence {
    String getReverse(String sentence) {
       //sentence.toLowerCase().toCharArray(); //or
        return getReverse(sentence.toLowerCase().toCharArray());
    }
//DIPALI IS___CRAZY
    //YZARC___SI               ID
   private String getReverse(char[] sentence) {
        StringBuilder sentenceBuilder = new StringBuilder();
        int start = 0;
        int end = sentence.length-1;
        for (int i = sentence.length-1; i >= 0; i--) {
            sentenceBuilder.append((sentence[i]));

        }
        return sentenceBuilder.toString();
    }
}
