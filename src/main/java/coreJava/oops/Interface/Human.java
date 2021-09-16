package coreJava.oops.Interface;

interface LivingBeing {

}

interface Bird extends LivingBeing {
    void fly();

    void layEgg();
}

interface Mammal {
    void giveBirth();
}

public interface Human extends Mammal {
    void eat();

    void walk();

     void talk();

    void work();

    default void laugh() {
        System.out.println("hehahahahaha");
    }

}
