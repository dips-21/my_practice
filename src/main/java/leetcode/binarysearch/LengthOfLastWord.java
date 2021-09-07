package leetcode.binarysearch;
//dipali
public class LengthOfLastWord {
    int getLengthOfLastWord(String sentence) {
        char[] words = sentence.toCharArray();            //  // I LIKE SWEETS
        int wordCount = 0;

        int positionOfLastWord = -1;
        boolean isCharSeen = false;
        for (int position = 0; position < sentence.length()-1; position++) {
            // if (words[position] == 0) ||
            if (words[position] == ' ' && isCharSeen == true) {
                wordCount++;
                isCharSeen = false;
                //end
            }
            if(words[position]!=' '&& isCharSeen==false){
                isCharSeen=true;
                //start=pos
            }

        }
        if (isCharSeen==true)
            wordCount++;
        return wordCount;
    }
}