package coreJava.interfaces;

import coreJava.Fruit;

public class Orange extends Fruit {
    public Orange(String name, boolean hasSeed) {
        super(name, hasSeed);
    }


    @Override
    public String origin() {
        return "Nagpur";
    }


    @Override
    public String taste() {
        return "sweet and sour";
    }
}
