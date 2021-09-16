package coreJava.interfacese_lf_test;

public class q8 {

}

class Dog {

    public void bark() {
        System.out.println("Dog woof ");
    }

    public static void bite(){
        System.out.println("Dog bite");
    }
}

class Hound extends Dog {

    public void sniff() {
        System.out.println("Hound sniff ");
    }

    public void bark() {
        System.out.println("Hound howl ");
    }

    public static void bite(){
        System.out.println("Hound bite");
    }
}
class Wolf extends Hound{
    public void sniff() {
        System.out.println("Wolf sniff ");
    }
}

class DogShow {

    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        /* new Hound().bark();
         Hound h=new Hound();
         h.bark();
         h.sniff();*/
        // ((Dog) new Hound()).bark();
         //((Hound) new Hound()).bark();
         //((Dog) new Hound()).bite();//static method so compile time type depend.
         //((Hound) new Hound()).bite();
         //((Dog) new Hound()).sniff();
            Wolf wolf=new Wolf ();
            wolf.sniff();
            wolf.bark();
            wolf.bite();//wolk bark ,sniff bite
    }
}
