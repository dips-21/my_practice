package PracticeInterviewSelenium;

public class SmallestAndLargestNumberInArray {

    public void smallestAndLargestNumber(int[]array){
        int []num = array;
        int smallNumber=num[0];
        int largeNumber=num[0];

        for (int i = 0; i < num.length ; i++) {
            if (num[i] < smallNumber) {
                smallNumber = num[i];
            } else {
                largeNumber = num[i];
            }
        }
        System.out.println("Smallest Number: " + smallNumber + ", Largest Number: " + largeNumber);


    }

    public static void main(String[] args) {
        SmallestAndLargestNumberInArray num = new SmallestAndLargestNumberInArray();
        int []array={1,2,3,7,0,8,10};
        num.smallestAndLargestNumber(array);
    }
}
