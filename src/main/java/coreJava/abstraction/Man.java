package coreJava.abstraction;

public class Man extends Person{

    public Man(String name, int age, String hobby) {
        super(name, age, hobby);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getHobby() != null ? getHobby().hashCode() : 0);
        return result;
    }
}

class Student{

}

class Teacher {
}
class Course extends Academics{
    void add(){

    }
}


class Academics{
    void add(){

    }

    public static void main(String[] args) {
        Academics a = new Course();
        a.add();
    }
}