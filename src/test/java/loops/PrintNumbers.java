package loops;

public class PrintNumbers {


    public static void main(String[] args) {
//printSquareOfNumber(2,4);
  //      printRectangleOfNumber(3,4,2);
        printRectangleOfNumber1(6,4,3);
    }

    static void printNumNtimes(int number, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(number+" ");
        }
        System.out.println();
    }

    static void printSquareOfNumber(int number,int times){
        for(int i=0;i<times;i++){
            printNumNtimes(number,times);
        }
    }
    static void printRectangleOfNumber(int number,int length,int breadth){
        for (int i = 0; i <length ; i++) {
            printNumNtimes(number,breadth);

        }

    }
    static void printRectangleOfNumber1(int number,int length,int breadth)
    {
        for (int i = 0; i <length ; i++) {
            printNumNtimes(number,breadth);

        }
    }
}
