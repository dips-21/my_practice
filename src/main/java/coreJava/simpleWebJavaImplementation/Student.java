package coreJava.simpleWebJavaImplementation;

public class Student {
    String name;
    int id;
    String address;
    int age;
    Laptop laptop;

    public Student(String name, String address, int age,Laptop laptop) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.laptop=laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", laptop=" + laptop.getLaptopModel() +
                ", movie=" + laptop.movie.getName() +
                '}';
    }
}
