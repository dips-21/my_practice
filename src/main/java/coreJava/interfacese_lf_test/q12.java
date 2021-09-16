package coreJava.interfacese_lf_test;

public class q12 {
}

class Building {

    Building() {
        System.out.print("b ");
    }

    Building(String name) {
         this();
        System.out.print("bn " + name);

    }
}

 class House extends Building {

    House() {
        System.out.print("h ");
    }

    House(String name) {
         this();
        System.out.print("hn " + name);

    }

    public static void main(String[] args) {
        new House("x ");
    }
}
