package arrays;

public class Reverse {

    void charArray(char[] word) {
        int start = 0;
        int end = word.length - 1;           //[a b c d e]  //[e d c b a]
        while (start < end) {     //0<5
            char temp = word[start];    //a
            word[start] = word[end];    //a=e
            word[end] = temp;          //e=a
            start++;
            end--;
        }
    }

    int number(int num) {
        int last_digit = 0;
        int reverse = 0;
        while (num != 0) {    //123   //12
            last_digit = num % 10;     //123%10=3    //12%10 2
            reverse = reverse * 10 + last_digit;     //3     3*10+2
            num = num / 10;   //123/10    12    12/10
        }
        return reverse;
    }
}