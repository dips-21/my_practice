package PracticeInterviewSelenium;

import java.util.ArrayList;

public class PrintEvenNumber {

    public void printEvenNumberFromOneToHundred(int range){
        int countTill=range;
        int number;
        //ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        //ArrayList<Integer> oddNumber = new ArrayList<Integer>();
        for (int i = 2; i <=range ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        PrintEvenNumber number = new PrintEvenNumber();
        number.printEvenNumberFromOneToHundred(100);

    }
}
