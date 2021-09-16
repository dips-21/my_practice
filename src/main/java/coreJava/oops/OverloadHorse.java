package coreJava.oops;

class Animal {
    Animal() {

    }

    Animal(int origin) {

    }

    Animal(String origin) {

    }
}

class Horse extends Animal {

}

class Donkey extends Animal {

}

class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the Animal version");
    }

    /*public void doStuff(String a) {
         System.out.println("In the Animal version");   //ambiguious call
     }*/
    public void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }
}

public class OverloadHorse {


    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Animal horseObj = new Horse();
        ua.doStuff(animalObj);
        ua.doStuff(horseObj);
        ua.doStuff(null);

    }

    static void sort(Horse[] a) {

    }

    static void sort(Donkey[] d) {

    }

    public static void main(String[] args, int a) {
        Horse[] animals = {new Horse(), new Horse()};
        sort(animals);
    }
}