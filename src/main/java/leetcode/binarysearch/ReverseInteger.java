package leetcode.binarysearch;

public class ReverseInteger {
    int getReverse_number(int number) {
        int reverse_number = 0;
        boolean negative=number<0;
        while (number < 0 || number != 0) {
            int last_digit = number % 10;   //-123   3
            int limit = (Integer.MAX_VALUE - last_digit) / 10;

            if (reverse_number > limit) {
                return 0;
            }

            //num=-   -123
            reverse_number = reverse_number * 10 + last_digit;
            number = number / 10;

           if(negative){
                reverse_number=-reverse_number;
            }
        }
        return reverse_number;

    }
}
