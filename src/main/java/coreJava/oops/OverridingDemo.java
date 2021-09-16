package coreJava.oops;

import java.io.IOException;

public class OverridingDemo {
    public static void main(String[] args) throws IOException,NullPointerException{
        Parent p = new Child();
        p.talk();
        p.meet();
        p.talk();
        System.out.println(" ");
        Child c = new Child();
        p.talk();
        c.talk();
        p.meet();
        System.out.println(" ");
        Child gc = new Child();
           gc.talk();
    }
}

class Parent  {
    void talk() throws IOException {
        if (true){
            throw new IOException("");
        }
        System.out.println("parent talking");
    }

    static void meet() {
        System.out.println("all parents meeting");
    }
}

class Child extends Parent {
    void talk() {
        System.out.println("child talk");
    }

    static void meet() {
        System.out.println("all childs meeting");
    }

}

class GrandChild extends Parent{
    void talk() {
        System.out.println("grand child talk");
    }
}

