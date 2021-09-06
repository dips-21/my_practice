package modifiers.os;

import modifiers.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(100, "dips", "aurangabad", 5000, 19);
        SpecialEmployee employee1 = new SpecialEmployee(100, "dips", "aurangabad", 500, 19);
        employee.setSal(-5000);
        // employee1.sal1="";
        // new Object().clone();

    }

    int tax(Employee e) {
        return e.getAge() * 2;
    }

     static class SpecialEmployee extends Employee {

        public SpecialEmployee(int id, String name, String city, int sal, int age) {
            super(id, name, city, sal, age);
            this.sal1 = 90;
        }
    }
}