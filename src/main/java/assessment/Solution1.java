package assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static int ArrayChallenge(int num) {
        // code goes here
        int count = 1;
        List<Integer> current = new ArrayList<>();
        boolean found = false;

        List<Integer> digits = getDigits(num);
        while (!found) {
            for (int i = 0; i < digits.size() - 1; i++) {
                if (digits.get(i) == digits.get(i + 1)) {
                    found = true;
                    break;
                }
            }
            for (int digit : digits) {
                int result = num * digit;
                List<Integer> newDigits = getDigits(result);
                num = result;
                if (digits.get(digits.size() - 1) == newDigits.get(0)) {
                    found = true;
                    break;
                }
                for (int i = 0; i < newDigits.size() - 1; i++) {
                    if (newDigits.get(i) == newDigits.get(i + 1)) {
                        found = true;
                        break;
                    }
                }
            }
            count++;
        }
        return count;
    }

    static List<Integer> getDigits(int num) {
        List<Integer> digitList = new ArrayList<>();
        while (num > 0) {
            digitList.add(num % 10);
            num = num / 10;
        }
        Collections.reverse(digitList);
        return digitList;
    }

    public static void main(String[] args) {
        // keep this function call here
        // Scanner s = new Scanner(System.in);
        // System.out.print(ArrayChallenge(s.nextInt()));
        // System.out.print(ArrayChallenge(46));
        System.out.print(ArrayChallenge(134));
    }
}
