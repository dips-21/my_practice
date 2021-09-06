package modifiers.Emp;

import modifiers.Employee;

public class Employ extends modifiers.Employee {


    public Employ(int id, String name, String city, int sal) {
        super(id, name, city, sal);
        if (sal < 0) {
            throw new IllegalArgumentException("salary cant be negative" + sal);
        }
    }

    void print() {
        this.sal1 = 8;
        this.city = "";
    }

    public static void main(String[] args) {
        Employ emp = new Employ(101, "dips", "aur", -1000);


    }

}
