package coreJava.interfaces;

public class Fish implements Eatable{
    String name;
    String origin;

    Fish(String name,String origin){
        this.name=name;
        this.origin=origin;
    }

    @Override
    public String taste() {
        return "salty";
    }

    @Override
    public String origin() {
        return origin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isVegeterian() {
        return false;
    }

    boolean canSwim(){
        return true;
     }

}
