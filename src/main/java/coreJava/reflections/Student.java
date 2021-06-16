package coreJava.reflections;

public class Student {
    String name;
    int age;
    int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public void sayHello(String greeting){
        System.out.println("hello "+greeting);
    }
}