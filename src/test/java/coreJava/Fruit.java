package coreJava;

import coreJava.interfaces.Eatable;

public abstract class Fruit implements Eatable {
   private  String name;
    private boolean hasSeed;

    public Fruit(String name,boolean hasSeed){
        this.name=name;
        this.hasSeed=hasSeed;
    }

    public String getName() {
        return name;
    }

    public  boolean hasSeed(){
        return hasSeed;
    }

    @Override
    public boolean isVegeterian() {
        return true;
    }
}
