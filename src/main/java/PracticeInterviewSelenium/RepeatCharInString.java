package PracticeInterviewSelenium;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatCharInString {

    public static int repeatedCharactersAndItsCount(String str) {

        // jjaanhhhhhvvvviiii
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();
        int repeatedCount = 0;

        // Populate the map with character counts

        for (char ch : str.toCharArray()) {
            characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) + 1);
        }

        // Count repeated characters
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedCount++;
            }

        }
        return repeatedCount;
    }

    public static void main(String[] args) {
        String input = "programming";
        int result = repeatedCharactersAndItsCount(input);
        System.out.println("Number of repeated characters: " + input  + result);
    }

}
