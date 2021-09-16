package coreJava.oops;

public class DownCasting {
    static class Animal {
        void makeNoise() {
            System.out.println("generic noise");
        }

        public void doSomething() {

        }
    }

    class Dog extends Animal {
        void makeNoise() {
            System.out.println("bark");
        }

        void playDead() {
            System.out.println("roll over");
        }

        @java.lang.Override
        public void doSomething() {
            playDead();
        }
    }

    Dog getDog() {
        return new Dog();
    }

    public class Cat extends Animal {
        public void drink() {
            System.out.println("drinking milk");
        }

        @java.lang.Override
        public void doSomething() {
            drink();
        }
    }

}

class CastTest2 {
    public static void main(String[] args) {
        DownCasting d = new DownCasting();
        DownCasting.Dog dog = d.getDog();
        DownCasting.Animal[] a = {new DownCasting.Animal(), d.new Dog(), new DownCasting.Animal()};
        for (DownCasting.Animal animal : a) {
            animal.makeNoise();
            if (animal instanceof DownCasting.Dog) {
                ((DownCasting.Dog) animal).playDead();       // try to do a Dog behavior ?
            }
        }
        doSomeThing(a[0]);
    }


    static void doSomeThing(DownCasting.Animal animal) {

        if (animal instanceof DownCasting.Dog) {
            DownCasting.Dog d = ((DownCasting.Dog) animal); //downcast
            d.makeNoise();
        }
        if (animal instanceof DownCasting.Cat) {
            DownCasting.Cat c = ((DownCasting.Cat) animal); //downcast
            c.drink();
        }
        animal.doSomething();

    }
}