package coreJava.abstraction;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    String hobby;
    final int id;

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        id=5;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }
    void f(){

    }

}
