package coreJava.immutable;

/**
 * constructor and NO setter
 * Getter returns immutable object OR copy of mutable objects
 */
public class Person {
    String name;
    int age;
    String sex;
    Address address;

    public Person(String name, int age, String sex, Address address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Address getAddress() {
        return new Address(address.getCity(),address.getState(),address.pincode);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }
//name,age,sex,address;
}

