package oop.organisation;

import oop.Employee;

public class Department {

    void addEmployee(Employee e){
       // System.out.println("added employee"+e.getId()); cannot call non public method
        //cannot call protected method getSalary()
       // System.out.println("added employee"+e.getName()+ " with salary "+e.getSalary());
        System.out.println("added employee"+e.getName());
    }
}
