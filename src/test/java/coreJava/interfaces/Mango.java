package coreJava.interfaces;

import coreJava.Fruit;

public class Mango extends Fruit {
    public Mango(String name, boolean hasSeed) {
        super(name, hasSeed);
    }

    @Override
    public String taste() {
        return "sweet";
    }

    @Override
    public String origin() {
        return "kokan";
    }


    @Override
    public String toString() {
        return "Mango{}";
    }
}
