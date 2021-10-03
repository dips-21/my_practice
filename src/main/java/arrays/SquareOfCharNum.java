package arrays;

public class SquareOfCharNum {
    int getSquare(char[] num) {
        int square = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            int val = num[i];
            square = val * val;
            stringBuilder.append(square);
        }
        String numberString = stringBuilder.toString();
        return Integer.parseInt(numberString);
    }

    //123  //321
    int reverse(int num) {
        int reverse = 0, digits = 0;
        while (num != 0) {
            digits = num % 10;                  //123%10   3         12%10   2
            reverse = reverse * 10 + digits;   //0*10+3   3         3*10+2  32
            num = num / 10;                   //123/10   12         12/10
        }
        return reverse;
    }

    int getNumberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    //10^2
    int power(int base, int power) {
        int result = 1;
        while (power > 0) {    //10    3  , 10 100 1000
            result = base * result;
            power--;
        }
        return result;
    }

    int getSquareOfDigits(int[] num) {    //2 3 4 5      491625
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            int square = num[i] * num[i];
            if (num[i] <= 3) {                                       //2 3  4 *10 +9=49
                result = result * 10 + square;                     //2 6   4 *100+ 36=436
            } else {
                result = result * 100 + square;
            }
        }
        return result;
    }

    /**
     * @param array 123
     * @return 149
     */
    int getSquareOfDigitsOfCharArray(String str) {
        // char ch=1;
        //char ch='1'  this is 49 , string splits to char literals
        char[] chars = str.toCharArray();
        char[] nums = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            nums[i] = (char) Character.getNumericValue(chars[i]); // ascii value of 1 is 49 , char-48=numeric,ie chars[i]-48
        }
        return getSquareOfDigitsOfCharArray(nums);
    }

    int getSquareOfDigitsOfCharArray(char[] num) {
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            int square = num[i] * num[i];
            if (num[i] <= 3) {
                result = result * 10 + square;
            } else {
                result = result * 100 + square;
            }
        }
        return result;
    }

}

