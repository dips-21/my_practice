package coreJava.oops;

import java.io.IOException;
import java.util.List;

public class OverriddenMethods {

    public class Animal {
        public void eat() throws IOException {
            System.out.println("Generic Animal Eating Generically");
        }
    }

    class Horse extends Animal{
        @java.lang.Override
        public void eat()  {
            System.out.println("Horse eating hay, oats, " + "and horse treats");
        }
    }
}

/*void draw(Person p){   //Man m
    p.drawFace();
}*/

 class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();  //Animal ref, but a Horse object
        ; // Runs the Animal version of eat()
        //b.eat(); // Runs the Horse version of eat()
    }
}


//void sort(List<? extends Comparable> one){
//
//     one.get(0).compareTo(one.get(1));
//}
// }
//
//
//interface Connection{
//     //query ,close ,open
//}
