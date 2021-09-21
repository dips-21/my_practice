package coreJava.abstraction;

public class Women extends Person {

    public Women(String name, int age, String hobby) {
        super(name, age, hobby);
    }

    @Override
    public String getHobby() {
        return "shopping,talking,gossiping "+hobby;
    }
}
