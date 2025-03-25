package PracticeInterviewSelenium;

import java.util.Arrays;

public class ReverseAnArray {

    public void reverseArray(int[]array){
        int startIndex = 0;
        int endIndex = array.length-1;

        for (int i = 0;i < array.length-1; i++) {
           int temp = array[startIndex] ;
           array[startIndex] = array[endIndex];
           array[endIndex] = temp;

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        ReverseAnArray reverse = new ReverseAnArray();
        int []array= {1,4,6,2,8,9};
        reverse.reverseArray(array);
    }
}
