package coreJava.inhertitance;

public class A {
    public void show() {
        System.out.println("self");
    }
}   //non static method run time      static method compile compile    //final -decided on compile time type and its compile time
                                     //run time both are samebcz final method cannot override.

class B extends A{
    @Override
    public void show() {
        System.out.println("parent");
    }

    public void write(){
        System.out.println("writable");
    }
}

class C {
    public static void main(String[] args) {
        B ob2 = new B();
        ob2.show();          //2

        A ob1 = new B();
        ob1.show();       //2


        B ob3 = new B();
        ob3.write();

        A ob4=new B();
        ob4.show();
    }

}
