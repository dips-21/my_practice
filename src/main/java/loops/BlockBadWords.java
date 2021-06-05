package loops;

public class BlockBadWords {

    static boolean isBlocked(String[] words, String[] badWords) {
        for (int bwi = 0; bwi < badWords.length; bwi++) {
            for (int wi = 0; wi < words.length; wi++) {
                if (badWords[bwi] == words[wi]) {
                    return true;
                }
            }
        }
        return false;
    }
}
        //System.out.println(words[3]==badWords[1]);
        //System.out.println(words[3].equals(badWords[1]));