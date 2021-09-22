package coreJava.abstraction;

public class Women extends Person {

    public Women(String name, int age, String hobby) {
        super(name, age, hobby);
    }

    @Override
    public String getHobby() {
        return "shopping,talking,gossiping "+hobby;
    }

    @Override
    public String toString() {
        return "Women{" +
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

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getHobby() != null ? getHobby().hashCode() : 0);
        return result;
    }
}
