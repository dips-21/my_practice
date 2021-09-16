package coreJava.oops.Interface;

public abstract class Person implements Human {
    int hands;

    Person(String name) {
        System.out.println("hands legs eyes");
        hands = 2;
    }

   @Override
    public  void eat() {
        System.out.println("use hands mouth eat");
    }

    @java.lang.Override
    public void walk() {
        System.out.println("use legs ");
    }

    @java.lang.Override
    public void work() {

    }
    //abstract void sleep();
}

class Man extends Person {
    Man() {
        super("some name");
        System.out.println("man parts");
    }

    @java.lang.Override
    public  void talk() {

    }

    @Override
    public  void eat() {
        System.out.println("use hands mouth eat");   //static method class level depend n override depend on object level.
    }

    @java.lang.Override
    public void giveBirth() {

    }
}


