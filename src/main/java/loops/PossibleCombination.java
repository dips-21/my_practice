package loops;

public class PossibleCombination {
   static void printPattern(int num1,int num2) {
       int j=num2;
        for (int i = num1; i <= num2; i++) {
            //for (int j = num2; j > 0; j--)
            System.out.print(i+"-"+j+"  ");
              j--;
        }

    }

    public static void main(String[] args) {
printPattern(2,5);

    }

}
