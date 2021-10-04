package arrays;

public class MatchingLetters {

    String getCommon(String word1, String word2) {

        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        int miniLength;

        if (words1.length < words2.length) {
            miniLength = words1.length;
        } else {
            miniLength = words2.length;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < miniLength; i++) {
            if (words1[i] == words2[i])
                stringBuilder.append(words1[i]);
        }
        return stringBuilder.toString();
    }
}

