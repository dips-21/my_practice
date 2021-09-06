package modifiers;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(int id, String name, String city, int sal, int age) {
        super(id, name, city, sal, age);

    }

    void print() {
        System.out.println("age is " + this.getAge());
    }

    @Override
    public int secret() {
        return 1;
    }
}
