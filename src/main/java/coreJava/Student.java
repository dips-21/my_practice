package coreJava;

public class Student implements Comparable<Student> {
    int age;
    String name;
    float height;
    float weight;

    public Student(String name,int age, float height, float weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}

