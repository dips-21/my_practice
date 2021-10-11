package algo.recursion;

public class RecursionDemo {

    public static void main(String[] args) {
      //  new RecursionDemo().printNTimes(5);
        System.out.println("======");
        new RecursionDemo().recursivePrint(5);
    }


    void recursivePrint(int num){
        if(num==0)
            return;
        int h=num+1;
        System.out.println("printing  "+h);
        recursivePrint(num-1);
        int l=num-1;
        System.out.println(l+" printing ");
    }
   void printNTimes(int n){
       for (int i = n; i >0 ; i--) {
           printOneTime(i);
       }
    }

    void printOneTime(int n){
        System.out.println("printing "+n);

    }
}
