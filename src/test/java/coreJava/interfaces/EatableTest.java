package coreJava.interfaces;

import coreJava.Fruit;
import java.util.Arrays;

public class EatableTest {
    public static void main(String[] args) {

        Eatable[] eatables={new Mango("hapus", true),
                new Mango("alphanso", true),
                new Mango("Langda", true),
                new Mango("kesar", true),
                new Fish("Ravas", "Bangalore"),
                new Fish("Paplet", "hyderabad")};

        Fruit f=(Fruit) eatables[0];
        System.out.println(f.getName()+" "+f.hasSeed());

        Fish fish=(Fish) eatables[4];
        System.out.println(fish.canSwim());

        for (Eatable eatable:eatables) {
            System.out.println(eatable.getName()+" "+eatable.isVegeterian()+" "+ eatable.origin()+" "+ eatable.taste());

        }
    }
}
