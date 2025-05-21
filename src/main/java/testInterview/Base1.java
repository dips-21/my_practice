package testInterview;

public class Base1 {
    private int multiplier(int data){
        return data*5;
    }
}

class Derived1 extends Base1{
    private static int data;
    public Derived1(){
        data=25;
    }

    public static void main(String[] args) {
        Base1 temp=new Derived1();
       // System.out.println(temp.multiplier(data));
    }
}
