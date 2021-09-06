package leetcode.binarysearch;

public class PalindromeNumber {
    boolean isPalindrome(int num) { //117
        int reverse_number = getReverse_number(num);
        if (reverse_number == num)
            return true;
        else
            return false;
    }
    //-123
    //123
    //321 .-321

    private int getReverse_number(int number) {
        int reverse_number = 0;
        while (number < 0 || number != 0) {
            int last_digit = number % 10;   //-123   3
            int limit = (Integer.MAX_VALUE - last_digit) / 10;

            if (reverse_number > limit) {
                return 0;
            }

            //num=-   -123
            reverse_number = reverse_number * 10 + last_digit;
            number = number / 10;
        }
        return reverse_number;
    }





}

