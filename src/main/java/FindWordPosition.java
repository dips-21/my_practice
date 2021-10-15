import java.nio.charset.StandardCharsets;

public class FindWordPosition {
    int getWordPosition(String sentence, String word) {
        return getWordPosition(sentence.toCharArray(), word.toCharArray());
    }


    int getWordPosition(char[] sentence, char[] word) {
        int position = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (!(sentence[i] == word[i])) {
                continue;
            }
        }
        return position;
    }
}
