package coreJava;

public class StackHeap {
}

class Collar {
}

class Dog {
    Collar c;         // instance variable //
    String name;      // instance variable

    public static void main(String[] args) {
        Dog d;                         //local variable: d10.
        d = new Dog();
        d.go(d);
    }

    void go(Dog dog) {               // local variable: dog14.
        c = new Collar();
        dog.setName("Aiko");
    }

    void setName(String dogName) {   // local var: dogName
        name = dogName;          // do more stuff
        }
}
