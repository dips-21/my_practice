package coreJava.abstraction;

public class Child extends Person {


    public Child(String name, int age, String hobby) {
        super(name, age, hobby);
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        return getHobby() != null ? getHobby().equals(person.getHobby()) : person.getHobby() == null;
    }

}
