import java.util.Locale;

public class CountWord {
    int getCountOfWords(String sentence) {
        return getCountOfWords(sentence.toCharArray());
    }

    //i am learning |
    //i am learning|
    //dips|
   /* int getCountOfWords(char[] sentence) {   // i laugh     //using end
        int count = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] != ' ' && (i == sentence.length - 1 || sentence[i + 1] == ' ')) {
                count++;
            }
        }
        return count;
    }
*/
    int getCountOfWords(char[]sentence){     //using start
        int count=0;
        for (int i = 0; i <sentence.length ; i++) {
            if(sentence[i]!=' ' ||sentence[i]==0 &&(sentence[i-1]==' ')){
                count++;
            }
        }
        return count;
    }
}