package testInterview;

public class Base {
    private int data;

    public Base(){
        data=5;
    }

    public  int getData(){
        return this.data;
    }
}

class Derived extends Base{
    private int data;
    public Derived(){
        data=6;
    }

    //private int getData(){
      //  return Data;
    }


